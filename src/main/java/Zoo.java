import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Zoo {
    private ArrayList<Animal> animals;
    private int count;

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public void add(Animal a) {
        animals.add(a);

    }

    public ArrayList<Animal> getList() {
        return this.animals;
        }


    /*
     * TODO: YOUR CODE BELOW
     * Fill out the return type and method body
     **/

    /*
    public static ?? getAnimalTypes(List<Animal> animalList) {
        // YOUR CODE HERE
    }
    */

    public Map<Animal, Integer> getAnimalCounts() {
        // TODO: YOUR CODE HERE
        // HINT: Animal.values() returns a collection of the possible types of
        // Animals

        return null;
    }
}
