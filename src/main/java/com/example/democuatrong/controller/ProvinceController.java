package com.example.democuatrong.controller;

import com.example.democuatrong.model.Province;
import com.example.democuatrong.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.democuatrong.service.IProvinceService;

@Controller
@RequestMapping("/provinces")
public class ProvinceController {
    @Autowired
    IProvinceService provinceService;

    @GetMapping
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("/provinces/list");
        modelAndView.addObject("provinces", provinceService.findAll());
        return modelAndView;
    }
}
