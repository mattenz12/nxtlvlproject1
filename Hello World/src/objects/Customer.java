package objects;

/**
 * Created by jpmc on 9/29/2016.
 */
public class Customer extends Jackson {


    public String introduceYourself()
    {
        String fname=getFname();
        String lname=getLname();
        return "My name is customer "+getFname()+" "+getLname()+"!";
    }

    public String introduceYourself(String product){

        String fname=getFname();
        String lname=getLname();
        return "I am "+ fname +"! I Wanna buy your poo "+product+".";
    }
}
