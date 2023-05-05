package com.example.conference.controller;

import com.example.conference.model.Registration;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("reg")
public class RegistrationController {

    @GetMapping
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration,
                                  BindingResult result) {
        if (result.hasErrors()){
            System.out.println("There were errors");
            return "registration";
        }
        System.out.println("Successfully Register : " + registration.getName());
        return "redirect:registration";
    }
}
