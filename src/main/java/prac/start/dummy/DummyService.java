package prac.start.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DummyService {
    private final RestTemplate restTemplate;
    private final String APP_ID = "6451014824116412c42378e8";
    private final String API_URL = "https://dummyapi.io/data/v1/";

    @Autowired
    public DummyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getData(String step) {
        String apiUrl = API_URL + step;

        HttpHeaders headers = new HttpHeaders();
        headers.set("app-id", APP_ID);
        HttpEntity<String> entity = new HttpEntity<>("body", headers);

        ResponseEntity<String> response;
        try {
            response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);
        } catch (Exception e) {
            return "[exception]" + apiUrl + e + "fail";
        }

        if (HttpStatus.OK == response.getStatusCode()) {
            return response.getBody();
        } else {
            // API 호출 실패 처리 코드
            return "getDummy fail";
        }
    }

    public String isStep (String step) {
        String[] steps = {"user", "post", "comment", "tag"};
        List<String> stepList = Arrays.asList(steps);

        if (!stepList.contains(step)) {
            System.out.println("this step is not valid");
        }

        return step;
    }

}
