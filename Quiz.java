import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;

public class Quiz implements ActionListener {
    public StringBuffer getAPI(String apiUrl) {
        StringBuffer response = null;
        try {
            // Create a URL object from the getAPI endpoint
            URL url = new URL(apiUrl);

            // Create an HttpURLConnection object
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method to GET
            connection.setRequestMethod("GET");

            // Read the response from the getAPI
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

    public ArrayList<String> questionsAndAnswers(String category, int length, String difficulty) {
        StringBuffer value = new StringBuffer();
        if (length == 10) {
            if (category.equals("random")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&difficulty=hard&type=multiple");
                }
            } else if (category.equals("books")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=10&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=10&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=10&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=10&difficulty=hard&type=multiple");
                }
            }else if (category.equals("movies")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=11&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=11&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=11&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=11&difficulty=hard&type=multiple");
                }
            }else if (category.equals("music")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=12&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=12&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=12&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=12&difficulty=hard&type=multiple");
                }
            }else if (category.equals("shows")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=14&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=14&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=14&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=14&difficulty=hard&type=multiple");
                }
            }else if (category.equals("science & nature")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=17&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=17&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=17&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=17&difficulty=hard&type=multiple");
                }
            }else if (category.equals("mythology")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=20&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=20&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=20&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=20&difficulty=hard&type=multiple");
                }
            } else if (category.equals("sports")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=21&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=21&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=21&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=21&difficulty=hard&type=multiple");
                }
            }else if (category.equals("geography")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=22&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=22&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=22&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=22&difficulty=hard&type=multiple");
                }
            }else if (category.equals("history")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=23&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=23&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=23&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=23&difficulty=hard&type=multiple");
                }
            }else if (category.equals("art")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=25&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=25&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=25&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=25&difficulty=hard&type=multiple");
                }
            }else if (category.equals("celebrities")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=26&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=26&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=26&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=26&difficulty=hard&type=multiple");
                }
            }else if (category.equals("animals")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=27&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=27&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=27&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=27&difficulty=hard&type=multiple");
                }
            }else if (category.equals("vehicles")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=28&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=28&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=28&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=10&category=28&difficulty=hard&type=multiple");
                }
            }
        } else if (length == 20) {
            if (category.equals("random")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&difficulty=hard&type=multiple");
                }
            } else if (category.equals("books")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=10&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=10&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=10&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=10&difficulty=hard&type=multiple");
                }
            }else if (category.equals("movies")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=11&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=11&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=11&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=11&difficulty=hard&type=multiple");
                }
            }else if (category.equals("music")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=12&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=12&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=12&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=12&difficulty=hard&type=multiple");
                }
            }else if (category.equals("shows")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=14&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=14&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=14&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=14&difficulty=hard&type=multiple");
                }
            }else if (category.equals("science & nature")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=17&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=17&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=17&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=17&difficulty=hard&type=multiple");
                }
            }else if (category.equals("mythology")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=20&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=20&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=20&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=20&difficulty=hard&type=multiple");
                }
            } else if (category.equals("sports")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=21&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=21&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=21&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=21&difficulty=hard&type=multiple");
                }
            }else if (category.equals("geography")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=22&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=22&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=22&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=22&difficulty=hard&type=multiple");
                }
            }else if (category.equals("history")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=23&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=23&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=23&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=23&difficulty=hard&type=multiple");
                }
            }else if (category.equals("art")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=25&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=25&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=25&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=25&difficulty=hard&type=multiple");
                }
            }else if (category.equals("celebrities")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=26&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=26&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=26&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=26&difficulty=hard&type=multiple");
                }
            }else if (category.equals("animals")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=27&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=27&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=27&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=27&difficulty=hard&type=multiple");
                }
            }else if (category.equals("vehicles")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=28&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=28&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=28&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=20&category=28&difficulty=hard&type=multiple");
                }
            }
        } else if (length == 30) {
            if (category.equals("random")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&difficulty=hard&type=multiple");
                }
            } else if (category.equals("books")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=10&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=10&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=10&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=10&difficulty=hard&type=multiple");
                }
            }else if (category.equals("movies")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=11&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=11&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=11&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=11&difficulty=hard&type=multiple");
                }
            }else if (category.equals("music")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=12&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=12&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=12&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=12&difficulty=hard&type=multiple");
                }
            }else if (category.equals("shows")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=14&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=14&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=14&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=14&difficulty=hard&type=multiple");
                }
            }else if (category.equals("science & nature")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=17&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=17&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=17&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=17&difficulty=hard&type=multiple");
                }
            }else if (category.equals("mythology")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=20&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=20&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=20&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=20&difficulty=hard&type=multiple");
                }
            } else if (category.equals("sports")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=21&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=21&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=21&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=21&difficulty=hard&type=multiple");
                }
            }else if (category.equals("geography")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=22&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=22&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=22&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=22&difficulty=hard&type=multiple");
                }
            }else if (category.equals("history")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=23&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=23&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=23&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=23&difficulty=hard&type=multiple");
                }
            }else if (category.equals("art")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=25&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=25&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=25&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=25&difficulty=hard&type=multiple");
                }
            }else if (category.equals("celebrities")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=26&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=26&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=26&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=26&difficulty=hard&type=multiple");
                }
            }else if (category.equals("animals")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=27&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=27&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=27&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=27&difficulty=hard&type=multiple");
                }
            }else if (category.equals("vehicles")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=28&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=28&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=28&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=30&category=28&difficulty=hard&type=multiple");
                }
            }
        } else if (length == 40) {
            if (category.equals("random")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&difficulty=hard&type=multiple");
                }
            } else if (category.equals("books")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=10&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=10&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=10&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=10&difficulty=hard&type=multiple");
                }
            }else if (category.equals("movies")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=11&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=11&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=11&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=11&difficulty=hard&type=multiple");
                }
            }else if (category.equals("music")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=12&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=12&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=12&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=12&difficulty=hard&type=multiple");
                }
            }else if (category.equals("shows")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=14&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=14&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=14&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=14&difficulty=hard&type=multiple");
                }
            }else if (category.equals("science & nature")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=17&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=17&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=17&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=17&difficulty=hard&type=multiple");
                }
            }else if (category.equals("mythology")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=20&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=20&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=20&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=20&difficulty=hard&type=multiple");
                }
            } else if (category.equals("sports")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=21&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=21&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=21&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=21&difficulty=hard&type=multiple");
                }
            }else if (category.equals("geography")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=22&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=22&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=22&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=22&difficulty=hard&type=multiple");
                }
            }else if (category.equals("history")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=23&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=23&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=23&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=23&difficulty=hard&type=multiple");
                }
            }else if (category.equals("art")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=25&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=25&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=25&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=25&difficulty=hard&type=multiple");
                }
            }else if (category.equals("celebrities")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=26&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=26&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=26&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=26&difficulty=hard&type=multiple");
                }
            }else if (category.equals("animals")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=27&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=27&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=27&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=27&difficulty=hard&type=multiple");
                }
            }else if (category.equals("vehicles")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=28&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=28&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=28&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=40&category=28&difficulty=hard&type=multiple");
                }
            }
        } else if (length == 50) {
            if (category.equals("random")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&difficulty=hard&type=multiple");
                }
            } else if (category.equals("books")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=10&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=10&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=10&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=10&difficulty=hard&type=multiple");
                }
            }else if (category.equals("movies")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=11&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=11&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=11&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=11&difficulty=hard&type=multiple");
                }
            }else if (category.equals("music")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=12&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=12&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=12&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=12&difficulty=hard&type=multiple");
                }
            }else if (category.equals("shows")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=14&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=14&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=14&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=14&difficulty=hard&type=multiple");
                }
            }else if (category.equals("science & nature")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=17&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=17&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=17&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=17&difficulty=hard&type=multiple");
                }
            }else if (category.equals("mythology")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=20&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=20&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=20&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=20&difficulty=hard&type=multiple");
                }
            } else if (category.equals("sports")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=21&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=21&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=21&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=21&difficulty=hard&type=multiple");
                }
            }else if (category.equals("geography")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=22&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=22&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=22&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=22&difficulty=hard&type=multiple");
                }
            }else if (category.equals("history")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=23&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=23&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=23&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=23&difficulty=hard&type=multiple");
                }
            }else if (category.equals("art")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=25&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=25&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=25&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=25&difficulty=hard&type=multiple");
                }
            }else if (category.equals("celebrities")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=26&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=26&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=26&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=26&difficulty=hard&type=multiple");
                }
            }else if (category.equals("animals")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=27&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=27&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=27&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=27&difficulty=hard&type=multiple");
                }
            }else if (category.equals("vehicles")) {
                if (difficulty.equals("any")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=28&type=multiple");
                } else if (difficulty.equals("easy")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=28&difficulty=easy&type=multiple");
                } else if (difficulty.equals("medium")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=28&difficulty=medium&type=multiple");
                } else if (difficulty.equals("hard")) {
                    value = getAPI("https://opentdb.com/api.php?amount=50&category=28&difficulty=hard&type=multiple");
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

        return valuable_info;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    String category;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    int length;
    String difficulty;
    FrontPage page = new FrontPage();
    ArrayList<String> stuff = questionsAndAnswers(page.selectedCategory, page.selectedAmountOfQuestions, page.selectedQuestionDifficulty);

    public ArrayList<String> findQuestions(ArrayList<String> ogList) {
        ArrayList<String> questions = new ArrayList();
        for (int i = 0; i < ogList.size(); i++) {

            if (ogList.get(i).equals("multiple")) {
                questions.add(ogList.get(i + 6));
            }
        }
        return questions;
    }

    public ArrayList<String> findCorrectAnswer(ArrayList<String> ogList) {
        ArrayList<String> correctAnswer = new ArrayList();
        for (int i = 0; i < ogList.size(); i++) {

            if (ogList.get(i).equals("multiple")) {
                correctAnswer.add(ogList.get(i + 8));
            }
        }
        return correctAnswer;
    }

    public ArrayList<String> findWrongAnswer1(ArrayList<String> ogList) {
        ArrayList<String> wrongAnswer1 = new ArrayList();
        for (int i = 0; i < ogList.size(); i++) {

            if (ogList.get(i).equals("multiple")) {
                wrongAnswer1.add(ogList.get(i + 10));
            }
        }
        return wrongAnswer1;
    }

    public ArrayList<String> findWrongAnswer2(ArrayList<String> ogList) {
        ArrayList<String> wrongAnswer2 = new ArrayList();
        for (int i = 0; i < ogList.size(); i++) {

            if (ogList.get(i).equals("multiple")) {
                wrongAnswer2.add(ogList.get(i + 11));
            }
        }
        return wrongAnswer2;
    }

    public ArrayList<String> findWrongAnswer3(ArrayList<String> ogList) {
        ArrayList<String> wrongAnswer3 = new ArrayList();
        for (int i = 0; i < ogList.size(); i++) {
            if (ogList.get(i).equals("multiple")) {
                wrongAnswer3.add(ogList.get(i + 12));
            }
        }
        return wrongAnswer3;
    }



    ArrayList<String> questions = findQuestions(stuff);
    ArrayList<String> correctAnswer = findCorrectAnswer(stuff);
    ArrayList<String> wrongAnswer1 = findWrongAnswer1(stuff);
    ArrayList<String> wrongAnswer2 = findWrongAnswer2(stuff);
    ArrayList<String> wrongAnswer3 = findWrongAnswer3(stuff);


    public char[] getAnswerPlacement( ArrayList questions){
        char[] answers = new char[questions.size()];
        for (int i = 0; i < questions.size(); i++) {
            int num = Double.valueOf(Math.random() * ((4 - 1) + 1)).intValue() + 1;
            if(num == 1){
                answers[i] = 'A';
            } else if(num == 2){
                answers[i] = 'B';
            } else if(num == 3){
                answers[i] = 'C';
            } else if(num == 4){
                answers[i] = 'D';
            }
        }
        return answers;
    }

    char[] answers = getAnswerPlacement(questions);

    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.size();
    int result;
    int seconds = 10;

    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    Timer shotclock = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            seconds--;
            seconds_left.setText(String.valueOf(seconds));
            if (seconds<=0) {
                displayAnswer();
            }
        }
    });

    public Quiz() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(20, 46, 54));
        frame.setLayout(null);
        frame.setResizable(false);

        textfield.setBounds(0, 0, 650, 50);
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(248, 228, 204));
        textfield.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        textarea.setBounds(0, 50, 650, 50);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25, 25, 25));
        textarea.setForeground(new Color(248, 228, 204));
        textarea.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        buttonA.setBounds(0, 100, 100, 100);
        buttonA.setFont(new Font("Eras", Font.BOLD, 25));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");
        buttonA.setBackground(new Color(255, 255, 255));

        buttonB.setBounds(0, 200, 100, 100);
        buttonB.setFont(new Font("Eras", Font.BOLD, 25));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");
        buttonB.setBackground(new Color(255, 255, 255));

        buttonC.setBounds(0, 300, 100, 100);
        buttonC.setFont(new Font("Eras", Font.BOLD, 25));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");
        buttonC.setBackground(new Color(255, 255, 255));

        buttonD.setBounds(0, 400, 100, 100);
        buttonD.setFont(new Font("Eras", Font.BOLD, 25));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");
        buttonD.setBackground(new Color(255, 255, 255));

        answer_labelA.setBounds(125, 100, 500, 100);
        answer_labelA.setBackground(new Color(20, 46, 54));
        answer_labelA.setForeground(new Color(248, 228, 204));
        answer_labelA.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));

        answer_labelB.setBounds(125, 200, 500, 100);
        answer_labelB.setBackground(new Color(20, 46, 54));
        answer_labelB.setForeground(new Color(248, 228, 204));
        answer_labelB.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));

        answer_labelC.setBounds(125, 300, 500, 100);
        answer_labelC.setBackground(new Color(20, 46, 54));
        answer_labelC.setForeground(new Color(248, 228, 204));
        answer_labelC.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));

        answer_labelD.setBounds(125, 400, 500, 100);
        answer_labelD.setBackground(new Color(20, 46, 54));
        answer_labelD.setForeground(new Color(248, 228, 204));
        answer_labelD.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));

        seconds_left.setBounds(535, 511, 100, 100);
        seconds_left.setBackground(new Color(25, 25, 25));
        seconds_left.setForeground((new Color(173, 35, 94)));
        seconds_left.setFont(new Font("Eras", Font.BOLD, 60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(3));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(535, 475, 100, 25);
        time_label.setForeground(new Color(173, 35, 94));
        time_label.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("LOCK IN");

        number_right.setBounds(225, 225, 200, 100);
        number_right.setBackground(new Color(25, 25, 25));
        number_right.setForeground(new Color(255, 255, 255));
        number_right.setFont(new Font("Bookman Old Style", Font.BOLD, 5));
        number_right.setBorder(BorderFactory.createBevelBorder(2));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(225, 325, 200, 100);
        percentage.setBackground(new Color(25, 25, 25));
        percentage.setForeground(new Color(255, 255, 255));
        percentage.setFont(new Font("Bookman Old Style", Font.BOLD, 5));
        percentage.setBorder(BorderFactory.createBevelBorder(2));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(textfield);
        frame.add(textarea);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(seconds_left);
        frame.add(time_label);

        frame.setVisible(true);

        nextQuestion();
    }

    public void nextQuestion() {
        if (index >= total_questions) {
            results();
        } else {
            textfield.setText("Question " + (index + 1));
            textarea.setText(questions.get(index));
            char setCorrectAnswer = answers[index];
            if (setCorrectAnswer == 'A') {
                answer_labelA.setText(correctAnswer.get(index));
                answer_labelB.setText(wrongAnswer1.get(index));
                answer_labelC.setText(wrongAnswer2.get(index));
                answer_labelD.setText(wrongAnswer3.get(index));
            } else if (setCorrectAnswer == 'B') {
                answer_labelA.setText(wrongAnswer1.get(index));
                answer_labelB.setText(correctAnswer.get(index));
                answer_labelC.setText(wrongAnswer2.get(index));
                answer_labelD.setText(wrongAnswer3.get(index));
            } else if (setCorrectAnswer == 'C') {
                answer_labelA.setText(wrongAnswer1.get(index));
                answer_labelB.setText(wrongAnswer2.get(index));
                answer_labelC.setText(correctAnswer.get(index));
                answer_labelD.setText(wrongAnswer3.get(index));
            } else if (setCorrectAnswer == 'D') {
                answer_labelA.setText(wrongAnswer1.get(index));
                answer_labelB.setText(wrongAnswer3.get(index));
                answer_labelC.setText(wrongAnswer2.get(index));
                answer_labelD.setText(correctAnswer.get(index));
            }
            shotclock.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (e.getSource() == buttonA) {
            answer = 'A';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == buttonB) {
            answer = 'B';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }

        if (e.getSource() == buttonC) {
            answer = 'C';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }

        if (e.getSource() == buttonD) {
            answer = 'D';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        displayAnswer();
    }

    public void displayAnswer() {
        shotclock.stop();
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (answers[index] != 'A') {
            answer_labelA.setForeground(new Color(173, 35, 94));
        }
        if (answers[index] != 'B') {
            answer_labelB.setForeground(new Color(173, 35, 94));
        }
        if (answers[index] != 'C') {
            answer_labelC.setForeground(new Color(173, 35, 94));
        }
        if (answers[index] != 'D') {
            answer_labelD.setForeground(new Color(173, 35, 94));
        }

        Timer pause = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer_labelA.setForeground(new Color(248, 228, 204));
                answer_labelB.setForeground(new Color(248, 228, 204));
                answer_labelC.setForeground(new Color(248, 228, 204));
                answer_labelD.setForeground(new Color(248, 228, 204));

                answer = ' ';
                seconds = 10;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                index++;
                nextQuestion();
            }
        });
        pause.setRepeats(false);
        pause.start();
    }


    public void results() {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        result = (int)(correct_guesses/(double)total_questions *100);

        textfield.setText("Results:");
        textarea.setText("");
        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");

        number_right.setText("("+correct_guesses+"/"+total_questions+")");
        number_right.setForeground(new Color(248, 228, 204));
        number_right.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
        percentage.setText(result+"%");
        percentage.setForeground(new Color(248, 228, 204));
        percentage.setFont(new Font("Bookman Old Style", Font.BOLD, 30));

        frame.add(percentage);
        frame.add(number_right);

        if (result >= 70) {
            JLabel passMessage = new JLabel("Bad day to be a wrong question, stay locked in");
            passMessage.setBounds(100, 475, 500, 25);
            passMessage.setForeground(new Color(39, 148, 39)); // Green color for pass message
            passMessage.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
            frame.add(passMessage);
        } else {
            JLabel failMessage = new JLabel("... you needa lock in fr");
            failMessage.setBounds(100, 475, 500, 25);
            failMessage.setForeground(new Color(206, 54, 54)); // Red color for fail message
            failMessage.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
            frame.add(failMessage);
        }
    }
}