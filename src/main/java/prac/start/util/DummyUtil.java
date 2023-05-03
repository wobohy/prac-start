package prac.start.util;

import org.springframework.http.HttpHeaders;

public class DummyUtil {
    private static final String APP_ID = "6451014824116412c42378e8";
    private static final String API_URL = "https://dummyapi.io/data/v1/";
    public static String getAppId() {
        return APP_ID;
    }
    public static String getApiUrl() {
        return API_URL;
    }

    public static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("app-id", APP_ID);
        return headers;
    }
}
