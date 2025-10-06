package com.example.keycloakdemo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/me")
    public String me(
            Model model,
            @AuthenticationPrincipal OidcUser oidcUser,
            @RegisteredOAuth2AuthorizedClient("keycloak") OAuth2AuthorizedClient client) {

        model.addAttribute("user", oidcUser.getClaims());
        model.addAttribute("idToken", oidcUser.getIdToken().getTokenValue());
        model.addAttribute("accessToken", client.getAccessToken().getTokenValue());
        model.addAttribute("refreshToken",
                client.getRefreshToken() != null
                        ? client.getRefreshToken().getTokenValue()
                        : "No refresh token (scope missing)");
        return "me";
    }
}
