package com.shortcut.controller;


import com.shortcut.service.NumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/numbers")
@RequiredArgsConstructor
public class NumberController {

    private final NumberService numberService;

    @GetMapping("/sum1")
    public Integer getSquare(@RequestParam int[] arrNumber) {
        return numberService.getMaxSquare(arrNumber);
    }

    @GetMapping("/sum2/{num1}/{num2}")
    public Integer getSquare1(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return numberService.getMaxSquare2(num1, num2);
    }

    @PostMapping("/sum3")
    public long getSquare2(@RequestBody List<Integer> nums) {
        System.out.println(nums);
        return numberService.getMaxSquare3(nums);
    }
}
//на вход поступает список чисел, возвращается максимальный квадрат
// [1,2,5,7]