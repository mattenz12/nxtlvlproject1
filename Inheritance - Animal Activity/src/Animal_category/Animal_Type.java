package Animal_category;

/**
 * Created by jpmc on 9/29/2016.
 */
public class Animal_Type extends Animal {

    private boolean mammal = true;

    public String petType1 ()
    {
        return "I am a "+mammal+" mammal! Thank you!";
    }


    public boolean isMammal() {
        return mammal;
    }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }
}
