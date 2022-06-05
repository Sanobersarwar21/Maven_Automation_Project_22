package Action_Item;

import java.util.ArrayList;

public class Automation_loopCondition {
    public static void main(String[] args) {
        //create an Array list for cities and print only when that city is Brooklyn or Manhattan.
    ArrayList <String> Cities = new ArrayList<>();

    Cities.add("Brooklyn");
    Cities.add("Queens");
    Cities.add("Manhattan");
    Cities.add("Staten Island");
    Cities.add("Bronx");
    //using forloop with Condition
    for ( int i = 0; i < Cities.size(); i++){
        if (Cities.get(i) == "Brooklyn"){
            System.out.println("My city is Brooklyn");

        } else if (Cities.get(i) == "Manhattan"){
            System.out.println("My city is Manhattan");

        }//end of condition
    }    //end of for loop


}//end of mainMethod
}//end of java class

