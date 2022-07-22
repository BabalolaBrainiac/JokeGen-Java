package com.babalola.jokegenjava.controllers;

import com.babalola.jokegenjava.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/"})
    public String displayJoke(Model model){
    model.addAttribute("joke", jokeService.getJoke());

    return "index";
    }
}
