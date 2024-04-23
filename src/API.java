import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class API<JSONObject> {
    public StringBuffer API(String apiUrl) {
        StringBuffer response = null;
        try {
            // Create a URL object from the API endpoint
            URL url = new URL(apiUrl);

            // Create an HttpURLConnection object
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method to GET
            connection.setRequestMethod("GET");

            // Read the response from the API
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("Try Again");
        }
        return response;
    }


    public static <JSONObject> void main(String[] args) {
        API apiReader = new API();
        StringBuffer value = apiReader.API("https://opentdb.com/api.php?amount=10");
        String apiData = value.toString();
        String[] result = apiData.split("\"");
        ArrayList <String> valuable_info = new ArrayList<>();
        int counter = 0;
        for (String s : result){
            if (counter%2 == 1){
                valuable_info.add(s);
            }
            counter += 1;
        }
        counter = 0;
        HashMap<String, String> questionsAndAnswers = new HashMap<>();
        for (String s : valuable_info){
            if (s.equals("multiple")) {
                counter += 1;
                questionsAndAnswers.put("Question " + Integer.toString(counter), valuable_info.get(valuable_info.indexOf(s) + 6));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " answer", valuable_info.get(valuable_info.indexOf(s) + 8));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " incorrect answer 1", valuable_info.get(valuable_info.indexOf(s) + 10));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " incorrect answer 2", valuable_info.get(valuable_info.indexOf(s) + 11));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " incorrect answer 3", valuable_info.get(valuable_info.indexOf(s) + 12));
            } else if(s.equals("boolean")){
                counter += 1;
                questionsAndAnswers.put("Question " + Integer.toString(counter), valuable_info.get(valuable_info.indexOf(s) + 6));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " answer", valuable_info.get(valuable_info.indexOf(s) + 8));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " incorrect answer 1", valuable_info.get(valuable_info.indexOf(s) + 10));
            }

        }
        System.out.println(valuable_info);
        System.out.println(questionsAndAnswers.get("Question 1"));
        System.out.println(questionsAndAnswers.get("Question 1 answer"));
        System.out.println(questionsAndAnswers.get("Question 1 incorrect answer 1"));
        System.out.println(questionsAndAnswers.get("Question 1 incorrect answer 2"));
        System.out.println(questionsAndAnswers.get("Question 1 incorrect answer 3"));
    }
}