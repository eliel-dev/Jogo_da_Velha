public class Matriz2 {

    public static void main(String[] args) {
        int[][] tabu = new int[3][3];

        exibe_tabuleiro_com_numeros(tabu);
    }

    //vezDoJogador = vezDoJogador == 0 ? 1 : 0;


    public static void exibe_tabuleiro_com_numeros(int[][] tabu) {
        System.out.println("   C0 C1 C2");
        for (int i = 0; i < tabu.length; i++) {
            System.out.print("L" + i + "|");
            for (int j = 0; j < tabu[i].length; j++) {
                System.out.print(tabu[i][j] == 1 ? " X " : tabu[i][j] == 2 ? " O " : " - ");
            }
            System.out.println();
        }
    }
}


