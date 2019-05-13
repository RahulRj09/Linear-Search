public class LinearSearch {
    private static void numberChecker(int userInput) {
        int[] listOfNumbers = {12, 34, 45, 98, 23};
        for (int number : listOfNumbers){
            if (number == userInput){
                System.out.println(number);
                return;
            }
        }
        System.out.println("invalid input");
    }

    public static void main(String[] args){
        int userInput = Integer.parseInt(args[0]);
        numberChecker(userInput);
    }
}