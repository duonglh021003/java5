package com.poly.duonglh.ph22902.demo.controller;

import com.poly.duonglh.ph22902.demo.entity.KhachHang;
import com.poly.duonglh.ph22902.demo.repository.HangKhachHangRepository;
import com.poly.duonglh.ph22902.demo.service.KhachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/khach-hang")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private HangKhachHangRepository khachHangRepository;

    @GetMapping("/hien-thi")
    public String index(Model model){
        model.addAttribute("khachHang",new KhachHang());
        model.addAttribute("listHangKhachHang", khachHangRepository.findAll());
        model.addAttribute("listKhachHang",khachHangService.getAll());
        return "/khach_hang/index";
    }

    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("khachHang") KhachHang khachHang, BindingResult result,
                      Model model){
        if(result.hasErrors()){
            model.addAttribute("listHangKhachHang", khachHangRepository.findAll());
            model.addAttribute("listKhachHang",khachHangService.getAll());
            return "/khach_hang/index";
        }else {
            khachHangService.add(khachHang);
        }

        return "redirect:/khach-hang/hien-thi";

    }

    @GetMapping("/detail")
    public String detail(@RequestParam("ma") String ma,
                         Model model){
        KhachHang khachHang = khachHangService.detail(Long.valueOf(ma));
        model.addAttribute("khachHang",khachHang);

        model.addAttribute("listHangKhachHang", khachHangRepository.findAll());
        model.addAttribute("listKhachHang",khachHangService.getAll());
        return "/khach_hang/index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("ma") Long ma){
        khachHangService.delete(ma);
        return "redirect:/khach-hang/hien-thi";
    }
}
