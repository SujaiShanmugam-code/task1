package com.project1.Odd.Even;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class oddevenfunc
{
    @GetMapping("/CheckNumber")
    public String CheckNumber(@RequestParam int number)
    {
        if( number == 0)
        {
            return "Error : You enter Zero !";
        }

        else if( number % 2 == 0)
        {
            return "Even";
        }
        else
        {
         return "Odd";
        }

    }

}
