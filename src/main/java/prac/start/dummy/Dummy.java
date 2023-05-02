package prac.start.dummy;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Dummy {

    @GetMapping("/dummy")
    public String getDummy() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://dummyapi.io/data/v1/user";
        HttpHeaders headers = new HttpHeaders();
        headers.set("app-id", "6451014824116412c42378e8");

        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            String responseBody = response.getBody();
            System.out.println(responseBody);
            return responseBody;
        } else {
            // API 호출 실패 처리 코드
            return "fail";
        }
    }
}
