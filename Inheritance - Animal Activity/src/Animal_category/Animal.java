package Animal_category;

/**
 * Created by jpmc on 9/29/2016.
 */
public class Animal {

    private String petfirstName;
    private String petlastName;
    private int petAge;
    public String introPet()
    {
        return "Hello! I am "+petfirstName+" "+petlastName+"!";
    }

    public String giveyourage()
    {
        return "I am now "+petAge+" years of age.";
    }

    public String getPetfirstName() {
        return petfirstName;
    }

    public void setPetfirstName(String petName) {
        this.petfirstName = petName;
    }

    public String getPetlasttName() {
        return petlastName;
    }

    public void setPetlastName(String petName) {
        this.petlastName = petName;
    }
    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
}
