package com.parser.controllers;

import com.parser.models.Laptop;
import com.parser.models.laptopDetails.LaptopPhoto;
import com.parser.parser.ParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ParserController {

    @Autowired
    ParserService parserService;

    @GetMapping("/")
    public String getParser(){
        return "parser";
    }

    @PostMapping("/")
    @ResponseBody
    public ResponseEntity<Laptop> postParser(ModelMap modelMap, @RequestParam String url) {
        Laptop laptop = parserService.getMapCharacteristics(url);
        List<LaptopPhoto> photos = parserService.getListPhotos(url, laptop);
        laptop.setPhoto(photos);
        modelMap.addAttribute("laptop", laptop);
        ResponseEntity<Laptop> responseEntity = new ResponseEntity<Laptop>(laptop, HttpStatus.OK);
        return responseEntity;
    }

}
