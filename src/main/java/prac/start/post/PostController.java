package prac.start.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import prac.start.dummy.DummyController;
import prac.start.dummy.DummyUtil;

@RestController("/post")
public class PostController extends DummyController {
    private final String API_URL = DummyUtil.getApiUrl() + "post";

    @GetMapping("/getPost")
    public String getPost() {
        return getData(API_URL);
    }
}