import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    public static JSONArray userread() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray userarray = (JSONArray) parser.parse(new FileReader("./src/main/resources/users.json"));
        return userarray;
    }
    public static JSONArray quizarray() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray quizArray = (JSONArray) parser.parse(new FileReader("./src/main/resources/quiz.json"));
        return quizArray;
    }
}
