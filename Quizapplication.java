import java.util.Scanner;

public class Quizapplication {

    // static
    // int startgame;
    // int viewsummary;
    int wronganswer;
    static int useroption1;
    static int useroption2;
    static int useroption3;
    static int correctoption1 = 2;
    static int correctoption2 = 2;
    static int correctoption3 = 3;

    /**
     * @param args
     */
    public static void main(String[] args)
     {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("start game press 1");
            int startgame = scanner.nextInt();
            if (startgame == 1)

            {
                question1();

                // int correctoption1 = 2;
                System.out.println("Enter user option");
                int useroption1 = scanner.nextInt();
                int marks = 0;
                int wronganswer = 0;
                if (useroption1 == correctoption1) {
                    ++marks;
                } else 
                {
                    ++wronganswer;
                }

                System.out.println("press 1 to go to next question");
                int gonext = scanner.nextInt();
                if (gonext == 1) {

                    question2();

                    int correctoption2 = 2;
                    System.out.println("Enter user option");
                    int useroption2 = scanner.nextInt();
                    if (useroption2 == correctoption2) {
                        ++marks;
                    } else {
                        ++wronganswer;
                    }
                    System.out.println("usercoption is " + useroption2);
                } // 2 nd question

                System.out.println("press 1  to go to next question");

                int gonext3 = scanner.nextInt();

                if (gonext3 == 1) {
                    question3();

                    int correctoption3 = 3;
                    // System.out.println("Enter user option");
                    System.out.println("enter user opton");
                    int useroption3 = scanner.nextInt();
                    if (useroption3 == correctoption3) {
                        ++marks;
                    } else {
                        ++wronganswer;
                    }
                } // gonext3
                  // startgame loopover
                System.out.println("press 1 to confirm submission");
                int confirmsubmission;
                confirmsubmission = scanner.nextInt();
                System.out.println("usercoption is " + useroption2);
                if (confirmsubmission == 1) {
                    System.out.println("you have scored " + (marks * 10) + "points");
                    System.out.println("you have answered " + marks + "questions right ");
                    System.out.println("you have answered " + wronganswer + "questions wrong ");
        

    
        }
    }
}

    }// main method

    static void question1() {
        System.out.println("which of the followig is  a bird");
        System.out.println("1.cow");
        System.out.println("2.peacock");
        System.out.println("3.lion");
        System.out.println("4.bull");

    }

    static void question2() {
        System.out.println("which of the followig is not a animal");
        System.out.println("1.cow");
        System.out.println("2.peacock");
        System.out.println("3.bull");
        System.out.println("4.dog");

    }

    static void question3() {
        System.out.println("how many sides are ther in a pentagon");
        System.out.println("1.one ");
        System.out.println("2.six");
        System.out.println("3.five ");
        System.out.println("4.twelve");

    }

}// quiz applicaton bracket