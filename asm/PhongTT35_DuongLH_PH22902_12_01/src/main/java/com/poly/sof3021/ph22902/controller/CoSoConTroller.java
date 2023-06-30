package com.poly.sof3021.ph22902.controller;

import com.poly.sof3021.ph22902.entity.CoSo;
import com.poly.sof3021.ph22902.repository.TaiKhoanRepository;
import com.poly.sof3021.ph22902.service.CoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
@RequestMapping("/co-so")
public class CoSoConTroller {

    @Autowired
    private CoSoService coSoService;

    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @GetMapping("/hien-thi")
    public String index(Model model){

        model.addAttribute("listCoSo",coSoService.getAll());
        return "/coso/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        coSoService.delete(id);
        return "redirect:/co-so/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        model.addAttribute("coSo", new CoSo());
        CoSo coSo = coSoService.detail(id);
        model.addAttribute("coSo",coSo);
        model.addAttribute("listCoSo",coSoService.getAll());

        return "/coso/detail";
    }
    @GetMapping("/view-update")
    public String viewUpdate(){
        return "/coso/view-update";
    }

}
