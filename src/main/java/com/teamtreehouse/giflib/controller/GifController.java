package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.model.Gif;
import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping(value = "/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping(value = "/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("compiler-bot", LocalDate.of(2015,2,13), "Nolawee",true);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
