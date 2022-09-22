public class BooleanComparison {
    public static void main(String[] args) {

        // Variables 
        int chemistryGrade = 95;
        int biologyGrade = 75; 
        int englishGrade = 75;
        double sales = 37.55;
        double costs = 5.55;
        String sentence = "I love Java!";
        String sentence2 = "I love Java!";

        System.out.println("\nVariables that are being compared are as follows: " +
                              "\n\t Chemistry Grade: " + chemistryGrade +
                              "\n\t Biology Grade: " + biologyGrade +
                              "\n\t English Grade: " + englishGrade +
                              "\n\t Sales: " + sales +
                              "\n\t Costs: " + costs +
                              "\n\t Sentence 1: " + sentence +
                              "\n\t Sentence 2: " + sentence2);

        // Greater than and Less than 
        System.out.println("\nGREATER THAN");
        System.out.println("Biology Grade > Chemistry Grade?: " + (biologyGrade > chemistryGrade));
        System.out.println("\nLESS THAN");
        System.out.println("Sales < Costs?: " + (sales < costs));

        // Greater than or equal to 
        System.out.println("\nGREATER THAN OR EQUAL TO");
        System.out.println("Chemistry Grade >= English Grade?: " + (chemistryGrade >= englishGrade));
        System.out.println("Biology Grade >= English Grade?: " + (biologyGrade >= englishGrade));

        // Less than or equal to
        System.out.println("\nLESS THAN OR EQUAL TO"); 
        System.out.println("Chemistry Grade <= English Grade?: " + (chemistryGrade >= englishGrade));
        System.out.println("Biology Grade <= English Grade?: " + (biologyGrade >= englishGrade));

        // Equal to
        System.out.println("\n EQUAL TO"); 
        System.out.println("Chemistry Grade = English Grade?: " + (chemistryGrade == englishGrade));
        System.out.println("Biology Grade = English Grade?: " + (biologyGrade == englishGrade));

        // Not equal to 
        System.out.println("\n NOT EQUAL TO"); 
        System.out.println("Chemistry Grade != English Grade?: " + (chemistryGrade != englishGrade));
        System.out.println("Biology Grade != English Grade?: " + (biologyGrade != englishGrade));

        //String equal to 
        System.out.println("\n STRING EQUAL TO");
        System.out.println("Sentence 1 = Sentence 2?: " + sentence.equals(sentence2));

        //String not equal to 
        System.out.println("\n STRING NOT EQUAL TO");
        System.out.println("Sentence 1 != Sentence 2?: " + !sentence.equals(sentence2));
    }
}
