package app.controller;

import app.model.Cat;
import app.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CatController {

    @Autowired
    private CatService catService;


    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "0", required = false) Integer page,
                        Model model) {
        PagedListHolder<Cat> cats = catService.getAllCats(page);

        if (cats.getPageCount() > page) {
            model.addAttribute("cats", cats);
            model.addAttribute("page", page);

            return "index";

        } else {
            return "redirect:/top";
        }
    }

    @PostMapping("/")
    public String sendVote(@RequestParam String page,
                           @RequestParam("id") Cat cat) {
        catService.sendVote(cat);

        return "redirect:/?page=" + page;
    }

    @GetMapping("/top")
    public String top10Cats(Model model) {
        model.addAttribute("cats", catService.getTop10());

        return "top";
    }
}
