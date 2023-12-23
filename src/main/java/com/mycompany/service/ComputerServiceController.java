package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class ComputerServiceController {
    @Autowired private ComputerServiceService service;
    @GetMapping("computer-service")
    public String showUserList(Model model){
        List<ComputerService> computerServices = service.ListAll();
        model.addAttribute("computerServices",computerServices);
        return "computer-service";
    }


    @GetMapping("computer-service/new")
    public String showNewForm(Model model){
        model.addAttribute("computerService", new ComputerService());
        return "computer-service-form";
    }

    @PostMapping("computer-service/save")
    public String saveUser(ComputerService user, RedirectAttributes ra){
        service.save(user);
        ra.addFlashAttribute("message","Услуга успешно сохранена");
        return "redirect:/computer-service";
    }
    @GetMapping("computer-service/edit/{id}")
    public String showEditForm(@PathVariable("id")Integer id,Model model,RedirectAttributes ra){
            Optional<ComputerService> computerService = service.get(id);
            model.addAttribute("computerService", computerService.get());
            return "computer-service-form";

    }





    @GetMapping("computer-service/delete/{id}")
    public String deleteUser(@PathVariable("id")Integer id,RedirectAttributes ra){
            service.delete(id);
            ra.addFlashAttribute("message", "Услуга успешно удалена");

        return "redirect:/computer-service";
    }
}

