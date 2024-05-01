package Metodos;

public class Usarios {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: "+ smartTv.volume);
        
        System.out.println("Canal Atual: "+ smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: "+ smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        int canalDesejado = 10;
        
        smartTv.mudarCanal(canalDesejado);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        System.out.println("TV Ligada? "+ smartTv.ligada);

        smartTv.ligar();
        System.out.println("TV Ligada? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada? "+ smartTv.ligada);



    
    
    
    
    }
    

}
