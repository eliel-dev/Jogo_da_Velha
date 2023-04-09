public class Matriz2 {

    public static void main(String[] args) {
        int[][] tabu = new int[4][4];

        exibe_tabuleiro_com_numeros(tabu);
    }



    public static void exibe_tabuleiro_com_numeros(int[][] tabu) {
        System.out.println("Tabuleiro:");
        System.out.println("*****************");
        System.out.println("\tC1 C2 C3 \t");
        for (int i = 1; i < tabu.length; i++) {
            System.out.print(" L" + i + "|");
            for (int j = 1; j < tabu.length; j++) {
                if (tabu[i][j] == 1) {
                    System.out.print(" X ");
                } else if (tabu[i][j] == 2) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        System.out.println("*****************");
        System.out.println("L = Linha.");
        System.out.println("C = Coluna.");
    }

}


