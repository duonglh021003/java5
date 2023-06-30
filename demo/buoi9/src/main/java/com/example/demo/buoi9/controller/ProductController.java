package com.example.demo.buoi9.controller;

import com.example.demo.buoi9.entity.Category;
import com.example.demo.buoi9.entity.Product;
import com.example.demo.buoi9.service.CategoryService;
import com.example.demo.buoi9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/index")
    public String index(Model model,@RequestParam(name = "page",defaultValue = "0")Integer pageNo){


        model.addAttribute("listProduct",productService.getAll());
        model.addAttribute("listCategory",categoryService.getAll());
        return "/product/index";
    }

    @PostMapping("/add")
    public String add(@RequestParam("code") String code,
                      @RequestParam("name") String name,
                      @RequestParam("price") String price,
                      @RequestParam("description") String description,
                      @RequestParam("category") Category category,
                      Model model
                      ){

        Category category1 = new Category();

        Product product = Product.builder()
                .code(code)
                .name(name)
                .price(Float.valueOf(price))
                .description(description)
                .category(category1)
                .build();

        this.productService.add(product);
        return "";
    }

}
