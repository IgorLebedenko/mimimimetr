package app.controller;

import app.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatController {

    @Autowired
    private CatService catService;


    @GetMapping
    public String getAllCats(Model model) {
        model.addAttribute("cats", catService.getAllCats());
        return "index";
    }
}
