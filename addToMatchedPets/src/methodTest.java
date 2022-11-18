import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class methodTest {
    //Keys for maps are users adopting pets, values are pets
    HashMap<String, ArrayList<String>> matchedPets; //replace 'String' with 'Pet' object in Array for final version
    HashMap<String, ArrayList<String>> unmatchedPets;

    methodTest(){ //constructs a proxy database for testing
        matchedPets = new HashMap<>();
        unmatchedPets = new HashMap<>();

        ArrayList<String> petList1 = new ArrayList<>(Arrays.asList("Max", "Charlie", "Cooper"));
        ArrayList<String> petList2 = new ArrayList<>(Arrays.asList("Milo", "Buddy", "Rocky"));
        ArrayList<String> petList3 = new ArrayList<>(Arrays.asList("Lola", "Sadie", "Bailey"));

        matchedPets.put("Liam", petList1);
        matchedPets.put("Chloe", petList2);
        matchedPets.put("Connor", petList3);
        unmatchedPets.put("Liam", petList3);
        unmatchedPets.put("Chloe", petList1);
        unmatchedPets.put("Connor", petList2);
    }


    public void addToMatchedPets(String username, String currentPet){
        ArrayList<String> matched = matchedPets.get(username);
        ArrayList<String> unmatched = unmatchedPets.get(username);

        if(currentPet.equals("")){
            //send error message
        }
        else if(unmatched.contains(currentPet) || matched.contains(currentPet)){
            //send error message
        }
        else{
            matchedPets.get(username).add(currentPet);
        }
    }


}