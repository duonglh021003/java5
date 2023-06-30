package com.example.demo.buoi9.controller;


import com.example.demo.buoi9.entity.Category;
import com.example.demo.buoi9.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/index")
    public String index(Model model){
        List<Category> categoryList = categoryService.getAll();
        model.addAttribute("lists",categoryList);
        return "/buoi9/index";
    }

    @PostMapping("/add")
    public String add(@RequestParam("categoryCode") String code,
                      @RequestParam("categoryName")String name){
        Category category = Category.builder()
                .code(code)
                .name(name)
                .build();
        this.categoryService.add(category);
        return "redirect:/category/index";
    }

    @GetMapping("/delete")
    public String deltete(@RequestParam("id") String id,Model model){
        categoryService.delete(Long.valueOf(id));
        model.addAttribute("lists", categoryService.getAll());
        return "redirect:/category/index";
    }

    @GetMapping("/view-update")
    public String viewupdate(@RequestParam("id") String id,Model model){
        categoryService.getById(Long.valueOf(id));
        List<Category> categoryList = categoryService.getAll();
        model.addAttribute("sv",categoryList);
        return "/buoi9/update";
    }

//    @PostMapping("/update")
//    public String update(@RequestParam("id") String id,
//                         @RequestParam("categoryCode") String categoryCode,
//                         @RequestParam("categoryName")String categoryName,
//                         Model model
//                         ){
////        Category category = Category.builder()
////                .id(Long.valueOf(id))
////                .categoryCode(categoryCode)
////                .categoryName(categoryName)
////                .build();
//        this.categoryService.update(category,Long.valueOf(id));
//        return "redirect:/category/index";
//
//    }


}
