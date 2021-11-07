package pl.basicstuff.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.basicstuff.bean.BoxService;
import pl.basicstuff.model.Box;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/games")
public class BoxController {
    private BoxService boxService;

    @Autowired
    public BoxController(BoxService boxService) {
        this.boxService = boxService;
    }

    @GetMapping("")
    public List<Box> getList(HttpServletResponse response) {
        response.addHeader("access-control-allow-origin","*");
        return boxService.getList();
    }
}
