package com.mahmutcelik.demo.actualLogin;


import com.mahmutcelik.demo.todo.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
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


    private Logger logger = LoggerFactory.getLogger(getClass());
    @PostMapping("login")
    public String afterLoginToWelcomePage(@RequestParam("name") String name, @RequestParam("password") String password, ModelMap model){
        if(service.isValid(name,password)){
            model.put("name",name);
            logger.debug(name);
            return "welcomePage";
        }
        else{
            model.put("error","INVALID AUTHENTICATION");
            return "actualLoginPage";
        }
    }


}
