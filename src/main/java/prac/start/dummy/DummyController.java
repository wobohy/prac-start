package prac.start.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/dummy")
@RestController
public class DummyController {
    private final RestTemplate restTemplate;

    private final HttpHeaders headers = DummyUtil.getHttpHeaders();

    @Autowired
    public DummyController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getData(String apiUrl) {
        HttpEntity<String> entity = new HttpEntity<>("body", headers);

        ResponseEntity<String> response;
        try {
             response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);
        } catch (Exception e) {
            return "[exception]" + apiUrl + e + "fail";
        }

        if (HttpStatus.OK == response.getStatusCode()) {
            String responseBody = response.getBody();
            System.out.println("responseBody, " + responseBody);
            return responseBody;
        } else {
            // API 호출 실패 처리 코드
            return "getDummy fail";
        }
    }

    @GetMapping("/dummy")
    public String test() {

        return "/dummy/dummy";
    }
}
