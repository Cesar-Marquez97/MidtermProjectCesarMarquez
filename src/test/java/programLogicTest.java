import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class programLogicTest {

//    @BeforeEach
//    void setUp() {
//    }


    @Test
    @DisplayName("Add Testing Method")
    void add() {

        //calling both class for testing

        programLogic programLogic = new programLogic();
        programUI programUI = new programUI();

        //creating an array List for testing
        ArrayList<String> testingList = new ArrayList<>();

        //input simulation
        String userInputSimulation = "10 Push Ups\n";
        ByteArrayInputStream in = new ByteArrayInputStream(userInputSimulation.getBytes());
        System.setIn(in);

        String expected = programUI.successfulMessage() + "\n" + "10 Push Ups" + "\nwas added to the to do list";

        String actual = programLogic.add(testingList);
        assertEquals(expected, actual, "Error, Add method test fail!");

    }

    @Test
    @DisplayName("Delete Testing Method")
    void delete() {

        //calling both class for testing

        programLogic programLogic = new programLogic();
        programUI programUI = new programUI();

        //creating an array List for testing
        ArrayList<String> testingList = new ArrayList<>();

        testingList.add("10 Push Ups");
        testingList.add("10 sit Ups");
        testingList.add("Run 5 miles");

        //input simulation
        String userInputSimulation = "2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(userInputSimulation.getBytes());
        System.setIn(in);

        String expected = programUI.successfulMessage() + "\n" +  "10 sit Ups" + "\nwas deleted";

        String actual = programLogic.delete(testingList);
        assertEquals(expected, actual, "Error, delete method test fail!");
    }

}