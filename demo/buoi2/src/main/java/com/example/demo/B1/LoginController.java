package com.example.demo.B1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String Login(){
        return "/buoi2/login";
    }
    @PostMapping("/ket-qua")
    public String xulyLogin(@RequestParam("uname")String name, @RequestParam("psw")String password, Model model){
        // Lay gia tri tu o input (view) sang controller
        // Java5: @RequestParam
        model.addAttribute("name",name);
        model.addAttribute("psw",password);
        return "/buoi2/hienthi";
    }

}
