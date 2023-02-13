package com.perscholas.ExcerciseOne_Rest.TestController;


import com.perscholas.ExcerciseOne_Rest.model.User3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ModelAndViewcontroller {
    @GetMapping("/goToUserViewPage")
    public ModelAndView UserModelAndView() {
        List<User3> listUsers = new ArrayList<User3>();
        listUsers.add(new User3(1,"Haseeb","haseeb@abc.com,"));
        listUsers.add(new User3(2,"Shahparan","Shahparan@abc.com,"));
        listUsers.add(new User3(3,"James","James@abc.com,"));
        listUsers.add(new User3(4,"Joseph","Joseph@abc.com,"));

        ModelAndView modelAndView = new ModelAndView("userdata");
        modelAndView.addObject("userlist", listUsers);
        return modelAndView;
    }
    @GetMapping("/showViewPage")
    public String passParametersWithModel(Model model){
        model.addAttribute("messgae","Perscholas");
        model.addAttribute("WelcomeMessgae","welcome");
        int i = 10;
        model.addAttribute("number",i);
        List<String> list = Arrays.asList("one","two");
        model.addAttribute("listData",list);
        return "viewPage";
    }
    @GetMapping("/goToViewPage")
    public ModelAndView passParametersWithModelAndView() {
        String st = "Welcome to the Page";
        ModelAndView modelAndView = new ModelAndView("viewPage_2");
        modelAndView.addObject("message", st);
        modelAndView.addObject("info", "Employee information.");
        return modelAndView;
    }


}
