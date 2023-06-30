package com.example.demo.buoi3.controller;

import com.example.demo.buoi3.entity.SinhVien;
import com.example.demo.buoi3.service.SinhVienService;
import com.example.demo.buoi3.service.impl.SinhVienServiceImpl;
import com.sun.jdi.IntegerValue;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {

    private SinhVienService sinhVienService = new SinhVienServiceImpl();
    private List<SinhVien> sinhViens = new ArrayList<>();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiSinhVien(Model model) {

        sinhViens = sinhVienService.getAll();
        model.addAttribute("lists", sinhViens);

        return "/buoi3/sinhviens";
    }

    //c1
//    @GetMapping("/sinh-vien/view-add")
//    public String viewaddSV() {
//        return "/buoi3/add-sinh-vien";
//    }
//
//    @PostMapping("/sinh-vien/add")
//    public String addSV(@RequestParam("mssv") String ma,
//                        @RequestParam("ten") String ten,
//                        @RequestParam("tuoi") Integer tuoi,
//                        @RequestParam("diaChi") String diaChi,
//                        @RequestParam("gioiTinh") Boolean gioiTinh,
//                        Model model) {
//        // khoi tao 1 object
//        //c1: su dung contructor
////        SinhVien sv = new SinhVien(ma,ten,Integer.valueOf(tuoi),diaChi,Boolean.valueOf(gioiTinh));
//        //c2: su dung builder
//        SinhVien sv = SinhVien.builder()
//                .mssv(ma)
//                .ten(ten)
//                .tuoi(tuoi)
//                .diaChi(diaChi)
//                .gioiTinh(gioiTinh)
//                .build();
//        sinhVienService.addSinhVien(sv);
//        model.addAttribute("lists",sinhViens);
//
//        return "redirect:/sinh-vien/hien-thi";
//    }
    //c2: string form
    @GetMapping("/sinh-vien/view-add")
    public String viewadd(Model model) {
        model.addAttribute("sv", new SinhVien());
        return "/buoi5/add-sinh-vien";
    }

    @PostMapping("/sinh-vien/add")
    public String addSV(@Valid @ModelAttribute("sv") SinhVien sinhVien, BindingResult result) {
        if (result.hasErrors()) {
            return "/buoi5/add-sinh-vien";
        }
        sinhVienService.addSinhVien(sinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/detail/{ma}")
    public String detailSV(@PathVariable("ma") String mssv, Model model) {
        SinhVien sv = sinhVienService.detailSinhVien(mssv);
        model.addAttribute("sv", sv);
        return "/buoi3/detail-sinh-vien";
    }

    @GetMapping("/sinh-vien/delete/{ma}")
    public String deleteSV(@PathVariable("ma") String mssv) {
        sinhVienService.deleteSinhVien(mssv);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/view-update/{ma}")
    public String viewupdateSV(@PathVariable("ma") String mssv, Model model) {
        SinhVien sv = sinhVienService.detailSinhVien(mssv);
        model.addAttribute("sv", sv);
        return "/buoi3/update-sinh-vien";
    }

    @PostMapping("/sinh-vien/update")
    public String update(@RequestParam("msgv") String msgv,
                         @RequestParam("ten") String ten,
                         @RequestParam("tuoi") String tuoi,
                         @RequestParam("diaChi") String diaChi,
                         @RequestParam("gioiTinh") String gioiTinh,
                         Model model) {
        SinhVien gv = SinhVien.builder().mssv(msgv).ten(ten).tuoi(Integer.valueOf(tuoi)).gioiTinh(Boolean.valueOf(gioiTinh)).diaChi(diaChi).build();
        sinhVienService.update(gv,msgv);

        return "redirect:/sinh-vien/hien-thi";
    }

}


