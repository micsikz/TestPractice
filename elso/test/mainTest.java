import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class mainTest {

   List<Integer> testarray = new ArrayList<>();

    @Test
    public void paratlan() {
        testarray.add(2);
        testarray.add(3);
        testarray.add(4);
        testarray.add(5);

        Main test1 = new Main();
       assertEquals("A páratlan számok összege a nagyobb!", test1.osszead(testarray), "Páratlan fail!");

    }

    List<Integer> testarray2 = new ArrayList<>();

    @Test
    public void egyenlo() {
        testarray.add(5);
        testarray.add(5);
        testarray.add(10);

        Main test2 = new Main();
        assertEquals("Egyenlő!", test2.osszead(testarray2), "Egyenlő fail!");

    }

    List<Integer> testarray3 = new ArrayList<>();

    @Test
    public void paros() {
        testarray.add(5);
        testarray.add(50);
        testarray.add(10);

        Main test3 = new Main();
        assertEquals("A páros számok összege a nagyobb!", test3.osszead(testarray3), "Páros fail!");

    }
}
