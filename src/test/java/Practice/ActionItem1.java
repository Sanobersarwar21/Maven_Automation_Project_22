package Practice;

public class ActionItem1 {
    public static void main(String[] args) {
        //iterate through region and its areaCode using linear array and while loop
        String[] region = new String[]{"Northeast","Southwest","West","Southeast"};
        int[] areaCode = new int[]{111,222,333,444};
        //initializing your starting point before calling while loop
        int i = 0;
        //define the end point in while loop
        while (i < areaCode.length) {
            System.out.println("My first region is  " + region[i] + "areaCode " + areaCode[i]);

            //incrementing
            i = i + 1;
        }//end of loop
    }//end of main method
}//end of java class


