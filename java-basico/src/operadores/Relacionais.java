package operadores;

/**
 *
 * @author Anderson
 */
public class Relacionais {
    public static void main(String[] args){
        // Criando Variáveis
        int numero1 = 3;
        int numero2 = 2;
        
        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");
        
        // < Quando desejamos verificar se uma variável é MENOR QUE outra.
        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");
        
        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");
        
        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");
        
        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        if(numero1 != numero2)
            System.out.println("Numero 1 diferente de numero 2");
        
        
    }
}
