/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escopo;

/**
 *
 * @author Anderson
 */
public class Escopo {
    // Variável da classe conta
    double saldo = 10.0;
    
    public void sacar(double valor){
        // Variável local de método
        double novoSaldo = saldo - valor;
    }
    
    public void imprimirSaldo(){
        // Disponível em toda classe
        System.out.println(saldo);
        // Somente o método sacar conhece está variável abaixo
        //System.out.println(novoSaldo);
    }
    
    public double calcularDividaExponencial(){
        // Variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // Começando variável com valor zero
        for(int x=1; x <= 5; x++){ // x Variável de escopo de fluxo
            // esta variável será reiniciada a cada execução do for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;            
        }
        // escopo de fluxo
        // x e valorCalculado nunca estarão disponíveis fora do for
    }
}
