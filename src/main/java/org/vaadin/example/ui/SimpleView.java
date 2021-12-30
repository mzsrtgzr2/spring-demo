package org.vaadin.example.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/moshe")
public class SimpleView {

    @GetMapping("/roth")
    public String roth(){
        return "view1";
    }

}
