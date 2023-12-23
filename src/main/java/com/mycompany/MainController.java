package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("index-us")
    public String showHomePage(){
        return "index";
    }

    @GetMapping("about-us")
    public String showAboutPage() { return "about"; }

    @GetMapping("contacts-us")
    public String showContactPage() {return "contacts"; }

    @GetMapping("Order service-us")
    public String showOrderPage() {return "Order service"; }


}

