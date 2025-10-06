package com.example.keycloakdemo;

import org.springframework.ui.Model;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String index(@AuthenticationPrincipal OidcUser oidcUser, Model model) {
        if (oidcUser != null) {
            System.out.println("Claims: " + oidcUser.getClaims()); // debug xem claim nào có
            model.addAttribute("name", oidcUser.getFullName()); // hoặc kết hợp given_name + family_name
            model.addAttribute("email", oidcUser.getEmail());
        }
        return "index";
    }




    @GetMapping("/me")
    public String me(@AuthenticationPrincipal OidcUser oidcUser, Model model) {
        if (oidcUser != null) {
            model.addAttribute("name", oidcUser.getFullName());
            model.addAttribute("email", oidcUser.getEmail());
            model.addAttribute("username", oidcUser.getPreferredUsername());
        }
        return "me"; // trả về me.html
    }
}
