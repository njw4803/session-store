package com.example.sessionstore;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {

    // HashMap<String, String> sessionMap = new HashMap<>();

    // /login?name=Jay
    @GetMapping("/login")
    public String login(HttpSession session, @RequestParam String name) {
        session.setAttribute("name", name);
        // sessionMap.put(session.getId(), name);

        return "saved";
    }

    // /myName => "Jay"
    @GetMapping("/myName")
    public String myName(HttpSession session) {
        String myName = (String) session.getAttribute("name");
        // String myName = sessionMap.get(session.getId());

        return myName;
    }
}
