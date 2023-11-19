public class Processor8086Simulator {
    // Rejestry
    int AX, BX, CX, DX, SI, DI, BP, SP, IP;
    int[] FLAGS = new int[16]; // Przykładowo, każdy bit reprezentuje inny flag

    // Metoda do wykonywania operacji MOV
    void MOV(String dest, int value) {
        switch (dest) {
            case "AX":
                AX = value;
                break;
            // inne przypadki dla BX, CX, DX itd.
        }
    }
}
