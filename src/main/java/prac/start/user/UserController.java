package prac.start.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import prac.start.dummy.DummyController;
import prac.start.dummy.DummyUtil;

@RestController("/user")
public class UserController extends DummyController {
    private final String API_URL = DummyUtil.getApiUrl() + "user";
    @GetMapping("/getUser")
    public String getUser() {
        return getData(API_URL);
    }

    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable("id") String id) {
        String apiUrl = API_URL + "/" + id;
        return getData(apiUrl);
    }

}
