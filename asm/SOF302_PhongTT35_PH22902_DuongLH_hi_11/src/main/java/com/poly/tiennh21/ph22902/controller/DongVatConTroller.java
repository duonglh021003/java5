package com.poly.tiennh21.ph22902.controller;

import com.poly.tiennh21.ph22902.entity.DongVat;
import com.poly.tiennh21.ph22902.service.DongVatService;
import com.poly.tiennh21.ph22902.service.DongVatServiceImpl.DongVatServiceImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "dong-vat")
public class DongVatConTroller {

    private DongVatService dongVatService = new DongVatServiceImpl();
    private List<DongVat> dongVats = new ArrayList<>();

    @GetMapping("/hien-thi-tat-ca")
    public String index(Model model){

        dongVats = dongVatService.getAll();
        model.addAttribute("lists",dongVats);
        model.addAttribute("dv",new DongVat());

        return "/lab1_4/dong-vat";
    }

    @GetMapping("/remove/{ma}")
    public String delete(@PathVariable("ma")String ma,Model model){
        dongVatService.delete(ma);
        model.addAttribute("lists",dongVatService.getAll());
        model.addAttribute("dv",new DongVat());
        return "redirect:/dong-vat/hien-thi-tat-ca";
    }

    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("dv") DongVat dongVat, BindingResult result,Model model){
        if(result.hasErrors()){
            model.addAttribute("lists",dongVatService.getAll());
            return "/lab1_4/dong-vat";
        }
        dongVatService.add(dongVat);
        return "redirect:/dong-vat/hien-thi-tat-ca";
    }

}
