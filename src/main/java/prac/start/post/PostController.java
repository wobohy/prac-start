package prac.start.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import prac.start.dummy.DummyController;
import prac.start.dummy.DummyUtil;

@RestController("/post")
public class PostController{
    private final String API_URL = DummyUtil.getApiUrl() + "post";
    private final DummyController dummyController;

    @Autowired
    public PostController(DummyController dummyController) {
        this.dummyController = dummyController;
    }
    @GetMapping("/getPost")
    public String getPost() {
        return dummyController.getData(API_URL);
    }
}