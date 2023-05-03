package prac.start.dummy;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class DummyUtil {
    // Bean 등록 후 사용 예정
    private static final RestTemplate REST_TEMPLATE = new RestTemplate();
    private static final String APP_ID = "6451014824116412c42378e8";
    private static final String API_URL = "https://dummyapi.io/data/v1/";
    public static String getAppId() {
        return APP_ID;
    }
    public static String getApiUrl() {
        return API_URL;
    }
    public static RestTemplate getRestTemplate() {
        return REST_TEMPLATE;
    }
    public static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("app-id", APP_ID);
        return headers;
    }
}
