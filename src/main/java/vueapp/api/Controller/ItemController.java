package vueapp.api.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @RequestMapping(value = "/api/items", method = RequestMethod.GET)
    public List<String> HelloWorld(HttpServletRequest request) {
        List<String> items = new ArrayList<>();
        items.add("아이폰");
        items.add("아이패드");
        items.add("아이맥");
       return items;
    }
}