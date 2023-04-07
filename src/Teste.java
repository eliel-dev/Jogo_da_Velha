import java.util.Scanner;

public class Teste {
    static int[][] tabu = new int[3][3];

    public static void main(String[] args) {
        // Le as entradas digitadas pelo user
        Scanner entrada = new Scanner(System.in);

        //Vetor que representa o tabu
        int[][] tabu = new int[3][3];
        String[] jogadores = new String[2];

        int vezDoJogador = 0;
        int jogadas = 0;

        inicia_jogo(jogadores);

        //"Melhorar", loop de jogo enquanto ainda não ganhou ou deu empate
        while (true){
            System.out.println(jogadores[vezDoJogador] + ", faça sua jogada:");
            System.out.print("Linha: ");
            int linha = entrada.nextInt();
            System.out.print("Coluna: ");
            int coluna = entrada.nextInt();


            // Usa "continue" para ignorar o resto do loop e voltar para início do while, caso a condição no if seja true
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Coordenadas inválidas!");
                continue;
            }

            // Usa "continue" para ignorar o resto do loop e voltar para início do while, caso a condição no if seja true
            if (tabu[linha][coluna] != 0) {
                System.out.println("Posição já marcada!");
                continue;
            }

            //Preenche a matriz com linha e coluna escolhida, vezDoJogador alterna entre jogador 1 e 2
            tabu[linha][coluna] = vezDoJogador + 1;

            //Incrementa num de jogadas, onde o limite vai ser até 9
            jogadas++;

            exibe_tabuleiro(tabu);


            if (verificarVencedor(tabu, vezDoJogador + 1)) {
                System.out.println(jogadores[vezDoJogador] + " ganhou!");
                break;
            }
            if (jogadas == 9) {
                System.out.println("Empate!");
                break;
            }

            vezDoJogador = (vezDoJogador == 0) ? 1 : 0;
        }
    }


    public static String inicia_jogo(Scanner entrada, String[] jogadores) {
        System.out.println("Bem-vindo ao jogo da velha, desenvolvido por Eliel e Carlos");
        System.out.println("Informe o nome dos jogadores");
        System.out.println("Jogador 1 (X): ");
        jogadores[0] = entrada.nextLine();
        System.out.println("Jogador 2 (O): ");
        jogadores[1] = entrada.nextLine();
        System.out.println();
        exibe_tabuleiro(tabu);

        return jogadores[0];
    }


    //Desenha tabuleiro trocando 1 por X e 2 por O, deixando campos não preenchidos com "-"
    public static void exibe_tabuleiro(int[][] tabu) {
        System.out.println("Tabuleiro: ");
        for (int i = 0; i < tabu.length; i++) {
            for (int j = 0; j < tabu.length; j++) {
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
        System.out.println();
    }



    //Verifica vencedor analisando cada linha, coluna e diagonais / Recebe por parametro a matriz e o jogador a ser analisado
    public static boolean verificarVencedor(int[][] tabu, int jogador) {
        // For para verificar cada linha
        for (int i = 0; i < tabu.length; i++) {
            if (tabu[i][0] != 0 && tabu[i][0] == tabu[i][1] && tabu[i][1] == tabu[i][2]) {
                return true;
            }
        }
        // For para verificar cada coluna
        for (int i = 0; i < tabu.length; i++) {
            if (tabu[0][i] != 0 && tabu[0][i] == tabu[1][i] && tabu[1][i] == tabu[2][i]) {
                return true;
            }
        }
        // Verificar diagonal principal
        if (tabu[0][0] != 0 && tabu[0][0] == tabu[1][1] && tabu[1][1] == tabu[2][2]) {
            return true;
        }
        // Verificar diagonal secundária
        if (tabu[0][2] != 0 && tabu[0][2] == tabu[1][1] && tabu[1][1] == tabu[2][0]) {
            return true;
        }
        return false;
    }
}
