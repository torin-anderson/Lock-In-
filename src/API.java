import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
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

    public HashMap <String, String> questionsAndAnswers(String catagory, String questionType, int length) {
        StringBuffer value = null;
        if (length == 10) {
            if (catagory.equals("random") && questionType.equals("random")) {
                value = API("https://opentdb.com/api.php?amount=10");
            } else if (catagory.equals("books")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=10&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=10");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=10&type=boolean");
                }
            }else if (catagory.equals("movies")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=11&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=11");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=11&type=boolean");
                }
            }else if (catagory.equals("music")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=12&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=12");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=12&type=boolean");
                }
            }else if (catagory.equals("shows")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=14&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=14");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=14&type=boolean");
                }
            }else if (catagory.equals("science & nature")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=17&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=17");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=17&type=boolean");
                }
            }else if (catagory.equals("mythology")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=20&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=20");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=20&type=boolean");
                }
            } else if (catagory.equals("sports")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=21&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=21");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=21&type=boolean");
                }
            }else if (catagory.equals("geography")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=22&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=22");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=22&type=boolean");
                }
            }else if (catagory.equals("history")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=23&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=23");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=23&type=boolean");
                }
            }else if (catagory.equals("art")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=25&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=25");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=25&type=boolean");
                }
            }else if (catagory.equals("celebrities")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=26&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=26");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=26&type=boolean");
                }
            }else if (catagory.equals("animals")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=27&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=27");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=27&type=boolean");
                }
            }else if (catagory.equals("vehicles")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=28&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=28");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=10&category=28&type=boolean");
                }
            }
        } else if (length == 20) {
            if (catagory.equals("random") && questionType.equals("random")) {
                value = API("https://opentdb.com/api.php?amount=20");
            } else if (catagory.equals("books")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=20&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=20");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=20&type=boolean");
                }
            }else if (catagory.equals("movies")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=11&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=11");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=11&type=boolean");
                }
            }else if (catagory.equals("music")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=12&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=12");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=12&type=boolean");
                }
            }else if (catagory.equals("shows")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=14&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=14");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=14&type=boolean");
                }
            }else if (catagory.equals("science & nature")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=17&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=17");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=17&type=boolean");
                }
            }else if (catagory.equals("mythology")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=20&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=20");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=20&type=boolean");
                }
            } else if (catagory.equals("sports")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=21&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=21");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=21&type=boolean");
                }
            }else if (catagory.equals("geography")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=22&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=22");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=22&type=boolean");
                }
            }else if (catagory.equals("history")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=23&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=23");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=23&type=boolean");
                }
            }else if (catagory.equals("art")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=25&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=25");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=25&type=boolean");
                }
            }else if (catagory.equals("celebrities")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=26&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=26");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=26&type=boolean");
                }
            }else if (catagory.equals("animals")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=27&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=27");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=27&type=boolean");
                }
            }else if (catagory.equals("vehicles")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=28&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=28");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=20&category=28&type=boolean");
                }
            }
        } else if (length == 30) {
            if (catagory.equals("random") && questionType.equals("random")) {
                value = API("https://opentdb.com/api.php?amount=30");
            } else if (catagory.equals("books")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=30&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=30");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=30&type=boolean");
                }
            }else if (catagory.equals("movies")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=11&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=11");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=11&type=boolean");
                }
            }else if (catagory.equals("music")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=12&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=12");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=12&type=boolean");
                }
            }else if (catagory.equals("shows")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=14&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=14");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=14&type=boolean");
                }
            }else if (catagory.equals("science & nature")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=17&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=17");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=17&type=boolean");
                }
            }else if (catagory.equals("mythology")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=20&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=20");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=20&type=boolean");
                }
            } else if (catagory.equals("sports")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=21&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=21");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=21&type=boolean");
                }
            }else if (catagory.equals("geography")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=22&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=22");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=22&type=boolean");
                }
            }else if (catagory.equals("history")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=23&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=23");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=23&type=boolean");
                }
            }else if (catagory.equals("art")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=25&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=25");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=25&type=boolean");
                }
            }else if (catagory.equals("celebrities")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=26&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=26");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=26&type=boolean");
                }
            }else if (catagory.equals("animals")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=27&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=27");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=27&type=boolean");
                }
            }else if (catagory.equals("vehicles")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=28&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=28");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=30&category=28&type=boolean");
                }
            }
        } else if (length == 40) {
            if (catagory.equals("random") && questionType.equals("random")) {
                value = API("https://opentdb.com/api.php?amount=40");
            } else if (catagory.equals("books")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=40&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=40");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=40&type=boolean");
                }
            }else if (catagory.equals("movies")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=11&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=11");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=11&type=boolean");
                }
            }else if (catagory.equals("music")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=12&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=12");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=12&type=boolean");
                }
            }else if (catagory.equals("shows")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=14&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=14");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=14&type=boolean");
                }
            }else if (catagory.equals("science & nature")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=17&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=17");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=17&type=boolean");
                }
            }else if (catagory.equals("mythology")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=20&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=20");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=20&type=boolean");
                }
            } else if (catagory.equals("sports")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=21&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=21");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=21&type=boolean");
                }
            }else if (catagory.equals("geography")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=22&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=22");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=22&type=boolean");
                }
            }else if (catagory.equals("history")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=23&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=23");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=23&type=boolean");
                }
            }else if (catagory.equals("art")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=25&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=25");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=25&type=boolean");
                }
            }else if (catagory.equals("celebrities")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=26&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=26");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=26&type=boolean");
                }
            }else if (catagory.equals("animals")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=27&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=27");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=27&type=boolean");
                }
            }else if (catagory.equals("vehicles")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=28&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=28");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=40&category=28&type=boolean");
                }
            }
        } else if (length == 50) {
            if (catagory.equals("random") && questionType.equals("random")) {
                value = API("https://opentdb.com/api.php?amount=50");
            } else if (catagory.equals("books")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=50&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=50");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=50&type=boolean");
                }
            }else if (catagory.equals("movies")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=11&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=11");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=11&type=boolean");
                }
            }else if (catagory.equals("music")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=12&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=12");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=12&type=boolean");
                }
            }else if (catagory.equals("shows")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=14&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=14");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=14&type=boolean");
                }
            }else if (catagory.equals("science & nature")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=17&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=17");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=17&type=boolean");
                }
            }else if (catagory.equals("mythology")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=20&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=20");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=20&type=boolean");
                }
            } else if (catagory.equals("sports")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=21&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=21");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=21&type=boolean");
                }
            }else if (catagory.equals("geography")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=22&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=22");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=22&type=boolean");
                }
            }else if (catagory.equals("history")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=23&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=23");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=23&type=boolean");
                }
            }else if (catagory.equals("art")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=25&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=25");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=25&type=boolean");
                }
            }else if (catagory.equals("celebrities")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=26&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=26");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=26&type=boolean");
                }
            }else if (catagory.equals("animals")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=27&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=27");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=27&type=boolean");
                }
            }else if (catagory.equals("vehicles")) {
                if (questionType.equals("multiple choice")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=28&type=multiple");
                } else if (questionType.equals("random")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=28");
                } else if (questionType.equals("true or false")) {
                    value = API("https://opentdb.com/api.php?amount=50&category=28&type=boolean");
                }
            }
        }
        
        String apiData = value.toString();
        apiData = apiData.replaceAll("&quot;", "").replaceAll("&#039;", "\'");
        String[] result = apiData.split("\"");
        ArrayList<String> valuable_info = new ArrayList<>();
        
        int counter = 0;
        for (String s : result) {
            if (counter % 2 == 1) {
                valuable_info.add(s);
            }
            counter += 1;
        }
        
        counter = 0;
        HashMap<String, String> questionsAndAnswers = new HashMap<>();
        for (String s : valuable_info) {
            if (s.equals("multiple")) {
                counter += 1;
                questionsAndAnswers.put("Question " + Integer.toString(counter), valuable_info.get(valuable_info.indexOf(s) + 6));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " answer", valuable_info.get(valuable_info.indexOf(s) + 8));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " incorrect answer 1", valuable_info.get(valuable_info.indexOf(s) + 10));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " incorrect answer 2", valuable_info.get(valuable_info.indexOf(s) + 11));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " incorrect answer 3", valuable_info.get(valuable_info.indexOf(s) + 12));
            } else if (s.equals("boolean")) {
                counter += 1;
                questionsAndAnswers.put("Question " + Integer.toString(counter), valuable_info.get(valuable_info.indexOf(s) + 6));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " answer", valuable_info.get(valuable_info.indexOf(s) + 8));
                questionsAndAnswers.put("Question " + Integer.toString(counter) + " incorrect answer 1", valuable_info.get(valuable_info.indexOf(s) + 10));
            }
        }
        return questionsAndAnswers;
    }
    
    public static <JSONObject> void main(String[] args) {
        API findquestionins = new API();
        System.out.println(findquestionins.questionsAndAnswers("movies", "multiple choice", 20).get("Question 20"));
    }
}
