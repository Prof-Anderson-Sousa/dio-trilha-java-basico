package operadores;

/**
 *
 * @author Anderson
 */
public class Ternario {
    public static void main(String[] args){
        // Criando Variáveis do Tipo int
        int a, b;
        
        // Atribuindo Valores as Variáveis
        a = 6;
        b = 6;
        
        // Criando Varíavel "resultado" do tipo String
//        String resultado = "";
        
//        Exemplo de Condicional Utilizando uma Estrutura IF/ELSE
//        if (a == b){
//            resultado = "verdadeiro";
//        }else{
//            resultado = "falso";
//        }
//        System.out.println(resultado);
        
        // Mesma Condicional, Mas Dessa Vez, Utilizando o Operador Condicional Ternário
        String resultado = (a == b) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
    
}
