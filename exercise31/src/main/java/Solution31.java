public class Solution31 {
    public static void main(String[] args) {
        Solution31 app = new Solution31();
        int age = app.getInput("What is your age?");
        int heartRate = app.getInput("What is your resting heart rate?");
        app.calcHeartRate(age, heartRate);
    }
    private int getInput(String prompt){
        //prompt is passed to getInput
        //user is prompted to enter data
        //if there's an exception for invalid input, catch it and say "invalid input"
        int input = 0;
        return input;
    }
    public StringBuilder calcHeartRate(int age, int heartRate){
        StringBuilder output = new StringBuilder();
        //for loop with a StringBuilder calculates and formats the output to be returned based on the target heart rate formula
        return output;
    }

}
