package co.develhope.api03.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringController {
    @GetMapping
    public String concat(@RequestParam(value = "string1") String string1,
                         @RequestParam(required = false, value = "string2") String string2) {
        if (string2 == null) return string1;
        else return string1 + " " + string2;
    }
}
