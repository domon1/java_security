package com.lab3.komarov;

import com.lab3.komarov.entity.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class CustomerController {
    @GetMapping("/")
    public String personalArea(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("user", user);
        return "personal";
    }
}
