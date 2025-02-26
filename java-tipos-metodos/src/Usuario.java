public class Usuario {
    public static void main(String[] args) {
        int canal = 7;
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado da TV: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();

        System.out.println("Estado da TV: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.definirCanal(canal);

        System.out.println("Canal Atual: " + smartTv.canal);

    }
}
