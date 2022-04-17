package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String dictionary(){
        return "index";
    }
    @PostMapping("/search")
    public String search(@RequestParam String word, ModelMap map){
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chao");
        dic.put("how", "The nao");
        dic.put("book", "Sach");
        dic.put("computer", "May tinh");

        String result = dic.get(word);
        map.addAttribute("result",result);
        return "result";
    }
}
