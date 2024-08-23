public class Metodos {

    boolean ligada = false;
    int canal = 1;
    int vomule = 25;
    

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    
    public void aumetarVolume(){
        vomule++;
        System.out.println("Aumentando o volume para: " + vomule);
    }
    public void diminuirVolume(){
        vomule--;
        System.out.println("Diminuindo o volume para: " + vomule);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("aumentar o canal para: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }
    public void mudarCanal(int novocanal){
        canal = novocanal;
    }
}
