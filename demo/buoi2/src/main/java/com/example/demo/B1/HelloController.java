package com.example.demo.B1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//tat ca cac class trong com => deu la bean duoc String quan ly.
//khi danh dau la @Controller => Class nay (Tang nay) => la tang controller
// dung de trao doi giua client & server
public class HelloController {
    // Client & server giao tiep thong qua phuong thuc HTTP
    // Co 4 loai HTTP co ban:
    // GET      <=> READ
    // POST     <=> CREATE
    // PUT      <=> UPDATE
    // DELETE   <=> DELETE
    // Với Java 4,5 dung 2 loai : GET , POST
    // GET: Hien thi / lay du lieu
    // POST: Xu ly

    // khi dung @Controller => mo hinh trong project MVC(MODEL - VIEW - CONTROLLER)
    // => Tat ca request trong controller luon luon tra ve 1 VIEW <=> RETURN STRING
    // C1: @GetMapping
    @GetMapping("/demo")
    public String hienThiHelloworld(Model model){
        // Truyen gia tri tu phia controller sang view
        // Java5: Model
        model.addAttribute("name","AAA");
        return "view";
    }
//    //C2: RequestMapping
//    @RequestMapping(Va)
}
