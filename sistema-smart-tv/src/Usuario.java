public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Ligada ? : " + smartTv.ligada);
        System.out.println("Canal ? : " + smartTv.canal);
        System.out.println("Volume ? : " + smartTv.volume);

        smartTv.ligarDesligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(22);

        System.out.println("Canal ? : " + smartTv.canal);

    }
}
