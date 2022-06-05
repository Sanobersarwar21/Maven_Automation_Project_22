package Day4_050722;

public class SplitMessage {
    public static void main(String[] args) {
        String splitMessage = "My Name Is JOhn";

        //declare an array of string to store the string split
        String[] splitNameArray = splitMessage.split(" ");

        //print out john to the console
        System.out.println(" My First Name Is  " + splitNameArray[3]);



    }
}
