package controllers;

import model.Buyer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView newForm() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("buyer", new Buyer());
        mv.addObject("hello");
        return mv;
    }
    @PostMapping
    public ModelAndView sum(@ModelAttribute("buyer")Buyer buyer){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",buyer.getName());
        mv.addObject("date",buyer.getDate());
        mv.addObject("email",buyer.getEmail());

        mv.setViewName("confirm");
        return mv;
    }

}
