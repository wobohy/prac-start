package prac.start.user;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import prac.start.util.DummyUtil;

@RestController("/user")
public class UserController {
    private final RestTemplate REST_TEMPLATE = new RestTemplate();
    private final String API_URL = DummyUtil.getApiUrl() + "user";
    private final HttpHeaders headers = DummyUtil.getHttpHeaders();

    @GetMapping("/getUser")
    public String getUser() {
        return getData(REST_TEMPLATE, API_URL, headers);
    }

    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable("id") String id) {
        String apiUrl = API_URL + "/" + id;
        return getData(REST_TEMPLATE, apiUrl, headers);
    }

    private String getData(RestTemplate restTemplate, String apiUrl, HttpHeaders headers) {
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);

        if (HttpStatus.OK == response.getStatusCode()) {
            String responseBody = response.getBody();
            System.out.println(responseBody);
            return responseBody;
        } else {
            // API 호출 실패 처리 코드
            return "getDummy fail";
        }
    }
}
