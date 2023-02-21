package metodos;

/**
 *
 * @author Anderson
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 13;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando Canal Para: " + canal);
    }
    
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo Canal Para: " + canal);
    }
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume Para: " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume Para: " + volume);
    }
    
}
