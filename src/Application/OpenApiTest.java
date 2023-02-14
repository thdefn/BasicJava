package Application;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenApiTest {
    public static void main(String[] args) {
        String key = "7948437a6c74686438344872706241";
        String baseUrl= "http://openapi.seoul.go.kr:8088/";

        try {
            //{"RESULT":{"CODE":"INFO-000","MESSAGE":"정상 처리되었습니다"},"row":[{},{}
            //{"RESULT":{"CODE":"INFO-200","MESSAGE":"해당하는 데이터가 없습니다."}}
            URL url = new URL(baseUrl + key + "/json/TbPublicWifiInfo/19200/20000/"); //end-start=1000
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-type", "application/xml");
            System.out.println("Response code: " + connection.getResponseCode());

            BufferedReader bf;

            bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String result = bf.readLine();

            System.out.println(result);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
