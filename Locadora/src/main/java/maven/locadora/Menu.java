package maven.locadora;

import java.util.Scanner;

/**
 *
 * @author gcall
 */
public class Menu {

    public static void main(String[] args) {
        String opcao = "a";

        while (opcao.charAt(0) != 's') {

            System.out.println("Digite a opcao: ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.next();

            switch (opcao.charAt(0)) {
                case 's':
                    // continua
                    break;
                case 'i':
                    System.out.println("inserir");
                    break;
                case 'r':
                    System.out.println("remover");
                    break;
            }
        }
    }
}
