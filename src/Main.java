import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escriu el numero de columnes i files que vols que tingui la teva matriu (Ha de ser senar i no pot ser 1):");

        int tamany = llegirDimensio();
        int matriu [][] = inicialitzarQuadrat(tamany);
        matriu = calcularPosicioInicial(matriu,tamany);
    }

    public static int llegirDimensio() {
        boolean senar = true;
        int tamany = 0;

        while (senar) {
            tamany = llegirEnterTeclat();
            if (tamany % 2 != 0 && tamany != 1) {
                System.out.println("El número introduït SI es senar");
                senar = false;
            } else {
                System.out.println("El número introduït NO es senar o es 1, torna a introdüir un valor");
            }
        }




        return tamany;
    }

    public static int [][] inicialitzarQuadrat(int tamanytaula) {
        int matriu[][] = new int[tamanytaula][tamanytaula];

        for (int i = 0; i < tamanytaula; i++) {
            for (int j = 0; j < tamanytaula; j++) {
                int valor = 0;
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();  // Agregar un salto de línea después de cada fila
        }
        return matriu;
    }

    public static int llegirEnterTeclat() {
        boolean verificar = true;
        Scanner sc = new Scanner(System.in);
        int enter1 = 0;

        while (verificar) {
            if (sc.hasNextInt()) {
                enter1 = sc.nextInt();
                System.out.println("Perfecte, has introduït un número enter");
                verificar = false;
            } else {
                System.out.println("Has d'introduir un número enter, torna-ho a intentar");
                sc.next();
            }
        }

        return enter1;
    }

    public static int [][] calcularPosicioInicial(int [][] quadrat,int tamany){
        quadrat [ (tamany / 2) - 1] [tamany / 2] = 1;
        int PInicial = quadrat [ (tamany / 2) - 1] [tamany / 2];
        System.out.println(PInicial);
        return quadrat;
    }
    public static int[][] calcularposicio(int [][] quadrat, int tamany){
        /** j and i cannot be more or "equal(not sure)" than "tamany variable"*/
    }
}