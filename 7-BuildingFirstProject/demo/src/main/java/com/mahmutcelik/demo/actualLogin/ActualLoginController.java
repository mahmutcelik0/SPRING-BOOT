package com.mahmutcelik.demo.actualLogin;


import com.mahmutcelik.demo.todo.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActualLoginController {

//    @RequestMapping("login")
//    public String loginPage(){
//        return "actualLoginPage";
//    }
    //ABOVE METHOD HANDLES BOTH POST AND GET METHODS
    //INITIALLY WE NEED TO USE GET METHOD TO SHOW LOGIN PAGE AND AFTER THAT
    //WE NEED TO USE POST METHOD TO SHOW IF ALL CORRECT THE WELCOME PAGE

    @GetMapping("login")
    public String loginPage(){
        return "actualLoginPage";
    }

    @Autowired
    private AuthenticationService service;


    @PostMapping("login")
    public String afterLoginToWelcomePage(@RequestParam("name") String name, @RequestParam("password") String password, ModelMap model){
        if(service.isValid(name,password)){
            model.put("name",name);
            return "welcomePage";
        }
        else{
            model.put("error","INVALID AUTHENTICATION");
            return "actualLoginPage";
        }
    }


}
