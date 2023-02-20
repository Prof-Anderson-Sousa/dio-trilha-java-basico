package operadores;

/**
 *
 * @author Anderson
 */
public class Unarios {
    public static void main(String[] args){
        // Criando Variável Principal do Tipo int
        int numero = 5;
        
        // Imprimindo o número negativo
        System.out.println(- numero);
        
        // Incrementando número em mais 1 número, imprime 6
        numero++;
        System.out.println(numero);
        
        // Incrementando número em mais 1 número. imprime 7
        System.out.println(numero ++);// ops algo de errado
        
        System.out.println(numero);// agora sim, numero virou 7
        
        // Ordem de precedência conta aqui
        System.out.println(++ numero);
        
        // Criando Variável do Tipo Boolean
        boolean verdadeiro = true;
        
        // Invertendo Lógica
        System.out.println("Inverteu " + !verdadeiro);
        
    }
}
