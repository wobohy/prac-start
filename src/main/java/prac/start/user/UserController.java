package prac.start.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prac.start.dummy.DummyController;
import prac.start.dummy.DummyUtil;

@RequestMapping("/user")
@RestController
public class UserController {
    private final String API_URL = DummyUtil.getApiUrl() + "user";
    private final DummyController dummyController;

    @Autowired
    public UserController(DummyController dummyController) {
        this.dummyController = dummyController;
    }
    @GetMapping("/getUsers")
    public String getUser() {
        return dummyController.getData(API_URL);

    }
    @GetMapping("/{id}")
    public String getUserId(@PathVariable("id") String id) {

        String apiUrl = API_URL + "/" + id;
        return dummyController.getData(apiUrl);
    }

    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable("id") String id) {
        return"";
    }

}
