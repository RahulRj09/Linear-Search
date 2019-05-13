public class LinearSearch {
    private static void numberChecker(int userInput) {
        int[] listOfNumbers = {12, 34, 45, 98, 23};
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] == userInput){
                System.out.println("Number in list and index of number "+i);
                return;
            }
        }
        System.out.println("Number not in list");
    }

    public static void main(String[] args){
        int userInput = Integer.parseInt(args[0]);
        numberChecker(userInput);
    }
}