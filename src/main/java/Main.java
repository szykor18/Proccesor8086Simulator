import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Processor8086Simulator simulator = new Processor8086Simulator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty symulator procesora 8086");
        while (true) {
            System.out.println("Wprowadź instrukcję (np. MOV AX, 100) lub 'exit' aby wyjść:");
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = line.split(" ");
            if (parts.length == 3) {
                String instruction = parts[0].toUpperCase();
                String reg = parts[1].replaceAll(",", "").trim();
                int value = parts.length > 2 ? Integer.parseInt(parts[2]) : 0;

                switch (instruction) {
                    case "MOV":
                        simulator.MOV(reg, value);
                        break;
                    case "ADD":
                        simulator.ADD(reg, value);
                        break;
                    case "SUB":
                        simulator.SUB(reg, value);
                        break;
                    case "INC":
                        simulator.INC(reg);
                        break;
                    case "DEC":
                        simulator.DEC(reg);
                        break;
                    case "MUL":
                        simulator.MUL(reg, value);
                        break;
                    default:
                        System.out.println("Nieznana instrukcja: " + line);
                        break;
                }
            }

            simulator.displayRegisters();
        }
        scanner.close();
    }

}
