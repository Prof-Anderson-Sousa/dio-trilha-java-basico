/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_doc;

/**
 *
 * @author Anderson
 */
public class Comentarios {
    public static void main(String[] args){
        // Olá, eu sou um comentário em uma única linha
        
        /* Olá,
        * Eu sou um comentário
        * que posso ser mais detalhado
        * quando necessário
        */ 
    }
    
    /*
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das variáveis
     * mas olha, ele tem a finalidade somar ou  multiplicar
     * dois números
     */
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar comentário
     * a nível de documentação.
     * Que incrível !!!
     */
    
    public void metodo(){
        
    }
    
}
