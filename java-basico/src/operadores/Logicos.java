package operadores;

/**
 *
 * @author Anderson
 */
public class Logicos {
   public static void main(String[] args){
        // && Operador Lógico "E"
        // || Operador Lógico "OU"
        
        // Criando Variáveis do Tipo Boolean
        boolean condicao1 = true;
        boolean condicao2 = false;
        
        // Se Condicao1 e Condicao2 forem verdadeiras, executar código
        if(condicao1 && condicao2)
            System.out.println("Os dois valores foram verdadeiros");
        // Se condicao1 OU condicao2 for verdadeira, executar código
        if(condicao1 || condicao2)
            System.out.println("Um dos valores foi verdadeiro");
        
        
   } 
}
