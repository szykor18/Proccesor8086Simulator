import java.util.HashMap;
import java.util.Map;

public class Processor8086Simulator {
    // Rejestry
    private Map<String, Integer> registers;
    public Processor8086Simulator() {
        // Inicjalizacja rejestrów
        registers = new HashMap<>();
        registers.put("AX", 0);
        registers.put("BX", 0);
        registers.put("CX", 0);
        registers.put("DX", 0);
    }

    // Metoda do wykonywania operacji MOV
    public void MOV(String dest, int value) {
        if (registers.containsKey(dest)) {
            registers.put(dest, value);
        } else {
            System.out.println("Nieznany rejestr: " + dest);
        }
    }

}
