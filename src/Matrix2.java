public class Matrix2 {

    public static void main(String[] args) {
        int[][] tabu = new int[3][3];

        exibe_tabuleiro_com_numeros(tabu);
    }


    public static void exibe_tabuleiro_com_numeros(int[][] tabu) {
        System.out.println("   C0 C1 C2");
        for (int i = 0; i < tabu.length; i++) {
            System.out.print("L" + i + "|");
            for (int j = 0; j < tabu[i].length; j++) {
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
    }
}
