package prac.start.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import prac.start.dummy.DummyController;
import prac.start.dummy.DummyUtil;

@RestController("/user")
public class UserController {
    private final String API_URL = DummyUtil.getApiUrl() + "user";
    private final DummyController dummyController;

    @Autowired
    public UserController(DummyController dummyController) {
        this.dummyController = dummyController;
    }
    @GetMapping("/getUser")
    public String getUser() {
        return dummyController.getData(API_URL);
    }

    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable("id") String id) {
        String apiUrl = API_URL + "/" + id;
        return dummyController.getData(apiUrl);
    }

}
