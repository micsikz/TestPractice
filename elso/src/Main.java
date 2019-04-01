import java.util.List;

public class Main {

    public static void main (String... args) {


    }

    public String osszead (List<Integer> array) {
        int sumparos = 0;
        int sumparatlan = 0;
        String a;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                sumparos = sumparos + array.get(i);
            } else if (array.get(i) % 2 != 0) {
                sumparatlan = sumparatlan + array.get(i);
            }
        }
        if (sumparos > sumparatlan) {
           a = "A páros számok összege a nagyobb!";
        } else if (sumparatlan > sumparos) {
            a ="A páratlan számok összege a nagyobb!";
        } else {
            a = "Egyenlő!";
        }
            return a;
    }
}
