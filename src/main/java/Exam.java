import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Exam {
    public static Object randommcq() throws IOException, ParseException {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            while (true)
            {
                if (input.equalsIgnoreCase("s"))
                {
                    int score=0;
                    JSONArray examarray = Utils.quizarray();
                    Random random = new Random();
                    for (int i=1;i<=10;i++)

                    {
                        int randvalue = random.nextInt(examarray.size()-1);
                        JSONObject mcqobject = (JSONObject)examarray.get(randvalue);
                        String question = (String) mcqobject.get("question");
                        System.out.println("[Question "+ i+"] "+question);
                        String option1 = (String) mcqobject.get("option 1");
                        System.out.println("1. "+option1);
                        String option2 = (String) mcqobject.get("option 2");
                        System.out.println("2. "+option2);
                        String option3 = (String) mcqobject.get("option 3");
                        System.out.println("3. "+option3);
                        String option4 = (String) mcqobject.get("option 4");
                        System.out.println("4. "+option4);
                        System.out.print("Student:> ");
                        int answer = scanner.nextInt();

                        int answerkey = Integer.parseInt(mcqobject.get("answerkey").toString());

                        if(answer==answerkey)
                        {
                            score++;
                        }

                    }
                    if(score>=8)
                    {
                        System.out.println("Excellent! You have got " +score+ " out of 10");
                        return null;
                    }
                    else if (score<8 && score>=5)
                    {
                        System.out.println("Good. You have got " +score+ " out of 10");
                        return 0;

                    }
                    else if (score<5 && score>=2)
                    {
                        System.out.println("Very poor! You have got " +score+ " out of 10");
                        return 0;

                    }
                    else
                    {
                        System.out.println("Very sorry you are failed. You have got "+score+ " out of 10");
                        return 0;
                    }


                }
                else
                {
                    System.out.println("You have entered wrong input. Press 's' to start.");
                    break;
                }
            }




        }

    }



}
