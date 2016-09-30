import Animal_category.Animal_Type;

/**
 * Created by jpmc on 9/29/2016.
 */
public class Main {


    public static void main(String[] args) {

        Animal_Type animal = new Animal_Type();
        animal.setPetfirstName("Piggy");
        animal.setPetlastName("Nanny");
        animal.setPetAge(13);
        animal.isMammal();

        String introName = animal.introPet();
        String ageofPet = animal.giveyourage();
        String petType = animal.petType1();

        System.out.println(introName);
        System.out.println(ageofPet);
        System.out.println(petType);


    }
}
