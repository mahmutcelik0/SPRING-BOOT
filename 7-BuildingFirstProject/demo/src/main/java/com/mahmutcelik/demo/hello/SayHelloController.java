package com.mahmutcelik.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class SayHelloController {
    @GetMapping("say-hello")
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    //RETURN HTML as response with hardcoded way (Bad situation)
    @GetMapping("say-hello-html")
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> FIRST PAGE </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html body");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }


}
