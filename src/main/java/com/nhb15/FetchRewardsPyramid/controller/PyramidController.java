package com.nhb15.FetchRewardsPyramid.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.TreeSet;

@RestController
public class PyramidController {
    @GetMapping(path="isPyramid/{inputWord}")
    @ResponseStatus(value= HttpStatus.OK)
    public boolean isPyramid(@PathVariable String inputWord){

        HashMap<Character, Integer> charFrequencyMap = new HashMap<Character, Integer>();

        for (int i = 0; i < inputWord.length(); i++){
            charFrequencyMap.merge(inputWord.charAt(i), 1, Integer::sum);
        }

        //Tree set is automatically sorted in ascending order
        TreeSet<Integer> characterFreqSet = new TreeSet<>(charFrequencyMap.values());

        //If the set size matches the map size, all values in the map were distinct. If the last value is greater than the number of the distinct characters, the set skipped a value and should be false.
        return (charFrequencyMap.size() == characterFreqSet.size() && characterFreqSet.last() <= characterFreqSet.size());
    }

}
