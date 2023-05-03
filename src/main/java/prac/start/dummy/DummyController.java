package prac.start.dummy;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DummyController {
    private final RestTemplate restTemplate = DummyUtil.getRestTemplate();

    private final HttpHeaders headers = DummyUtil.getHttpHeaders();

    public String getData(String apiUrl) {
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
