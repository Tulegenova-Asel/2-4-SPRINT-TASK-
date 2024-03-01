package com.example.projectdemo.controller;


import com.example.projectdemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String showItems(Model model) {
        model.addAttribute("items", itemService.findAllItems());
        return "item";
    }
}
