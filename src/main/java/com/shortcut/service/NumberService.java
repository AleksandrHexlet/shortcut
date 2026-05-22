package com.shortcut.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NumberService {

    public int getMaxSquare(int[] numbers) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a * b);
    }

    public int getMaxSquare2(int num1, int num2) {
        return num1 * num2;
    }

    public long getMaxSquare3(List<Integer> nums) {
        return nums.stream()
                .mapToLong(num -> (long) num * num)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Список чисел не должен быть пустым"));
    }

}
