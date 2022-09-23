public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 75;
        String language = "Java";
        int credits = 56;
        double GPA = 3.2;

        // OR || Operator
        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("java")) {
            System.out.println("\nCongratulations, you got the scholarship!");
        } else {
            System.out.println("\nWe're sorry, you didn't get the scholarship.");
        }

        //AND && Operator
        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma!");
        } else {
            System.out.println("Sorry, you need at least 40 crdits and a minimum GPA of 2.0");
        }

    }
}
