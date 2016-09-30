import objects.Jackson;
import objects.Employee;
import objects.Customer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Fucking World!");


        /**shit's about to get real friend**/
        //Who knows what it does//
     /*Alright alright*/
     /* TODO */
    /* TODO this is just a sample TODO stuff. */


        /** Primitive variables */

        byte byteVariable = 127; //range from -334 to 333;
        short mediumRangeDecimalVariable = 22767; //range from -32768 to 32767
        int decimalVariableUpTo = 2147483647; //in java <8 from -2147483648 to 2147483647 Java 8+ 4294967296
        long largeDecimalVariablFrom = -999999999999999999L;
        long largeDecimalVariableUpTo = 929292929292992909L;
        float numberWithDecimalPlaces = 8.2f;
        double veryLargeNumberwithDecimalPlaces = 13123.32;
        boolean isTrueOrFalse = true;
        char singleCharacter = '\u0041'; //min \u0000 max \uffff

        long longShit = 1231000009;
        int stuffLong = 12332323;

        String someText = "This is a string variable";

        /*TODO - to create an animal class with 3 properties (int, string bolean) with getters and setters */

        int x = 5;

        if (x == 5) {
            System.out.println("x = 5");
        } else {
            System.out.println("x is just x");
        }

        //Objects
//        Jackson person1 = new Jackson();
//        person1.setFname("Jacky");
//        person1.setLname("Loo");

//        String personName = person1.getFname();
//
//        System.out.println(personName);
//        System.out.println(someText);
//
//        String introduce = person1.introduceYourself();

//        System.out.println(introduce);

        Customer customer1 = new Customer();
        customer1.setFname("Mamayae");
        customer1.setLname("Lalosa");

        String custName = customer1.introduceYourself("potato");

        System.out.println(custName);

        Employee emp1 = new Employee();

        int q;
        int sum = 0;

        for (q = 1; q <= 6; q++) {

            sum = sum + q;
            System.out.print("[" + sum + "]");
        }

        String[] myInstructors ={ "Bert", "Amante", "Bert"};

        for (int e=0; e<=2; e++) {
            if(myInstructors[e]=="Bert"){
                myInstructors[e]="Amanate";
            }
            System.out.println(myInstructors[e]);
        }

        MyCollection.flist();
        MyCollection.glist();
        MyCollection.relstat();
        MyCollection.randStatement();
    }




}
