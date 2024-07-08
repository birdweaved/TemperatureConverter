package com.example.temperatureconverter.controller;

import com.example.temperatureconverter.model.Temperature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemperatureController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam double value, @RequestParam String scale, Model model) {
        Temperature temperature = new Temperature(value, scale);
        double result = temperature.convert();
        model.addAttribute("originalValue", value);
        model.addAttribute("originalScale", scale);
        model.addAttribute("convertedValue", result);
        model.addAttribute("convertedScale", "C".equalsIgnoreCase(scale) ? "F" : "C");
        return "index";
    }
}
