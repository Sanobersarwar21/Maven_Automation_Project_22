package Practice;

import java.util.ArrayList;

public class ActionItem2 {
    public static void main(String[] args) {
        //create an ArrayList for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Canada");
        countries.add("Pakistan");

        // create an arrayList for countryCode and Loop/iterating all the values using for loop
        ArrayList<String> countryCode = new ArrayList<>();
        countryCode.add("111");
        countryCode.add("222");
        countryCode.add("333");
        countryCode.add("444");
        countryCode.add("555");

        for (int i = 0; i < countryCode.size(); i++) {

            System.out.println("My last country is " + countries.get(4) + " and my third value is " + countries.get(2) + " My countryCode is " + countryCode.get(i));
        }
    }
}



