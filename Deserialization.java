import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
class CompanyDataSearchDto {
    private List<Result> results;
    private String license;

    public List<Result> getResults() {
        return results;
    }
}

class Result {
    private Integer id;
    private String termination;

    public Integer getId() {
        return id;
    }
}

public class Deserialization {
    public static void main(String[] args) {
        try {
            System.out.println(numDevices("", 0, ""));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Integer numDevices(String statusQuery, int threshold, String dateStr) throws MalformedURLException {
        URL url = new URL("https://api.statistics.sk/rpo/v1/search?identifier=50560557");
        String downloaded;
        try {
            downloaded = download(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        CompanyDataSearchDto companyDataSearchDto;
        try {
            companyDataSearchDto = deserialize(downloaded);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return companyDataSearchDto.getResults().get(0).getId();
    }

    public static CompanyDataSearchDto deserialize(String data) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(data, CompanyDataSearchDto.class);
    }

    public static String download(URL url) throws IOException {
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (InputStream input = con.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            String downloaded = reader.lines().collect(Collectors.joining());
            con.disconnect();
            return downloaded;
        }

    }
}
