package vueapp.api.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCtrl {

    @RequestMapping(value = "/api/hello", method = RequestMethod.GET)
    public String HelloWorld(HttpServletRequest request) {

       return "HelloWorld!!!";
    }

}