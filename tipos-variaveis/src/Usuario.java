public class Usuario {

    public static void main(String[] args) throws Exception {
        Metodos smartTv = new Metodos();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.vomule);
        
        smartTv.ligar();
        System.out.println("Novo status, Tv ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status, Tv ligada? " + smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumetarVolume();
        System.out.println("Volume atual? " + smartTv.vomule);
        
        smartTv.mudarCanal(113);
        System.out.println("Canal atual? " + smartTv.canal);
    }
}
