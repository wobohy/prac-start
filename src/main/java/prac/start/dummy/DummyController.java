package prac.start.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dummy")
@RestController
public class DummyController {
    private final DummyService dummyService;

    @Autowired
    public DummyController (DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @GetMapping("/get/{step}")
    public String getDummy(/*@PathVariable("id") String id, */@PathVariable("step") String step) {
        System.out.println("step = " + step);
        String step1 = dummyService.isStep(step);
        return dummyService.getData("", "");
    }
}
