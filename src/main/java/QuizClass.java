import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizClass {
    public static JSONArray quiz() throws IOException, ParseException {
        JSONArray quizarray = Utils.quizarray();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            JSONObject quizobject = new JSONObject();
            System.out.println("System:> Input your question");
            System.out.print("Admin:> ");
            quizobject.put("question",scanner.nextLine());
            System.out.println("System: Input option 1:");
            System.out.print("Admin:> ");
            quizobject.put("option 1",scanner.nextLine());
            System.out.println("System: Input option 2:");
            System.out.print("Admin:> ");
            quizobject.put("option 2",scanner.nextLine());
            System.out.println("System: Input option 3:");
            System.out.print("Admin:> ");
            quizobject.put("option 3",scanner.nextLine());
            System.out.println("System: Input option 4:");
            System.out.print("Admin:> ");
            quizobject.put("option 4",scanner.nextLine());
            System.out.println("System: What is the answer key?");
            System.out.print("Admin:> ");
            quizobject.put("answerkey",scanner.nextInt());
            scanner.nextLine();
            quizarray.add(quizobject);
            System.out.println("Saved successfully! Do you want to add more questions? (press s for start and q for quit)");
            while (true)
            {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("s")|| input.equalsIgnoreCase("q"))
                {
                    if (input.equalsIgnoreCase("q"))
                    {
                        FileWriter fileWriter  = new FileWriter("./src/main/resources/quiz.json");
                        fileWriter.write(quizarray.toJSONString());
                        fileWriter.flush();
                        fileWriter.close();
                        return quizarray;

                    }
                    else
                    {
                        break;

                    }
                }
                else
                {
                    System.out.println("Invalid input.(press s for start and q for quit)");
                }
            }

        }

    }

}

