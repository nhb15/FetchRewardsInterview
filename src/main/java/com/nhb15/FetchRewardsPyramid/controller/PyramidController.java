package com.nhb15.FetchRewardsPyramid.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PyramidController {

    @GetMapping(path="isPyramid/{inputWord}")
    @ResponseStatus(value= HttpStatus.OK)
    public boolean isPyramid(@PathVariable String inputWord){
        return true;
    }

}
