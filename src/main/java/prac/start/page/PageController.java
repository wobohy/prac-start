package prac.start.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/page")
@Controller
public class PageController {
    @RequestMapping("/dummy")
    public String dummy() {
        return "dummy/dummy";
    }
}
