package operadores;

/**
 *
 * @author Anderson
 */
public class Concatenacao {
    public static void main(String[] args){
        // Concatenação de Strings
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        
        // Qual o resultado das expressões abaixo?
        String concatenacao = "?";
        
        // Concatenação Number e String
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); 
    }
}
