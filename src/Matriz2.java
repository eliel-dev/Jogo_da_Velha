public class Matriz2 {

    public static void main(String[] args) {
        String[][] tabu = new String[4][4];

        exibe_tabuleiro(tabu);
    }



    public static void exibe_tabuleiro(String[][] tabu) {
        System.out.println("Tabuleiro: ");
        System.out.println("   C1 C2 C3");
        for (int i = 1; i < tabu.length; i++) {
            System.out.print("L" + i + "|");
            for (int j = 1; j < tabu.length; j++) {
                if (tabu[i][j].equals("X")) {
                    System.out.print(" X ");
                } else if (tabu[i][j].equals("0")) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        System.out.println("L = Linha.");
        System.out.println("C = Coluna.");
    }

}


