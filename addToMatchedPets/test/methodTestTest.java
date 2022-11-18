import org.junit.Test;

import static org.junit.Assert.*;

public class methodTestTest {

    @Test
    public void addToMatchedPets(){
        methodTest MT = new methodTest();

        MT.addToMatchedPets("Liam", "Luna");
        MT.addToMatchedPets("Chloe", "");
        MT.addToMatchedPets("Connor", "Milo");


        assertTrue(MT.matchedPets.get("Liam").contains("Luna"));
        assertFalse(MT.matchedPets.get("Chloe").contains(""));
        assertFalse(MT.matchedPets.get("Connor").contains("Milo"));
    }
}