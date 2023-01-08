package com.fetisov.threehundredbucks.Controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Description;
import org.springframework.ui.Model;
import com.fetisov.threehundredbucks.Services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AuthorController {
    private AuthorService authorService;
private static final Logger logger = LogManager.getLogger(AuthorController.class);

    private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

    @Description("Test controller")
    @GetMapping("/")
    public String main(Model model) {

        logger.debug("Hello from Log4j 2 - num : {}", () -> num);
        model.addAttribute("tasks", num);
        return "welcome";
    }

    private int getNum() {
        return 100;
    }
}
