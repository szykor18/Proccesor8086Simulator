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
    // Metoda do operacji ADD
    public void ADD(String dest, int value) {
        if (registers.containsKey(dest)) {
            int originalValue = registers.get(dest);
            registers.put(dest, originalValue + value);
        } else {
            System.out.println("Nieznany rejestr: " + dest);
        }
    }
    // Metoda do operacji SUB
    public void SUB(String dest, int value) {
        if (registers.containsKey(dest)) {
            int originalValue = registers.get(dest);
            registers.put(dest, originalValue - value);
        } else {
            System.out.println("Nieznany rejestr: " + dest);
        }
    }
    // Metoda do operacji INC (increment)
    public void INC(String dest) {
        if (registers.containsKey(dest)) {
            int originalValue = registers.get(dest);
            registers.put(dest, originalValue + 1);
        } else {
            System.out.println("Nieznany rejestr: " + dest);
        }
    }
    // Metoda do operacji DEC (decrement)
    public void DEC(String dest) {
        if (registers.containsKey(dest)) {
            int originalValue = registers.get(dest);
            registers.put(dest, originalValue - 1);
        } else {
            System.out.println("Nieznany rejestr: " + dest);
        }
    }
    // Metoda do operacji MUL
    public void MUL(String dest, int value) {
        if (registers.containsKey(dest)) {
            int originalValue = registers.get(dest);
            registers.put(dest, originalValue * value);
        } else {
            System.out.println("Nieznany rejestr: " + dest);
        }
    }

    // Wyświetlanie stanu rejestrów
    public void displayRegisters() {
        for (String reg : registers.keySet()) {
            System.out.println(reg + " = " + registers.get(reg));
        }
    }
}
