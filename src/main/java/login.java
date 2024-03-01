import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class login {
    public static void main(String[] args) throws IOException, ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        JSONArray userarray = Utils.userread();
//        System.out.println(userarray);
//        JSONObject userObject = (JSONObject) userarray.get(0);
//        System.out.println(userObject.get("username"));
        if (username.equals(((JSONObject)userarray.get(0)).get("username")) && password.equals(((JSONObject)userarray.get(0)).get("password")))
        {
            System.out.println("Welcome admin! Please create new questions in the question bank.");
            QuizClass.quiz();

        }
        else if (username.equals(((JSONObject)userarray.get(1)).get("username")) && password.equals(((JSONObject)userarray.get(1)).get("password")))
        {
            System.out.println("Welcome "+username+" to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' to start.");
//            Random random = new Random();
//            int rand =random.nextInt(10);
//            System.out.println(rand);
            Exam.randommcq();
            //marks.marks();

        }
        else
        {
            System.out.println("You have entered wrong credentials!");
        }

    }
}
