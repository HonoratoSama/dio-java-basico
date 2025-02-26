public class SmartTv {
    boolean ligada = false;
    int canal = 9;
    int volume = 10;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal() {
        canal++;
        if (canal > 13)
            canal = 1;
    }

    public void diminuirCanal() {
        canal--;
        if (canal < 1)
            canal = 13;
    }

    public int definirCanal(int scanal) {
        if (scanal >= 1 && scanal < 14) {
            canal = scanal;
        }
        return canal;
    }

    public void aumentarVolume() {
        volume++;
        if (volume >= 100)
            volume = 100;
    }

    public void diminuirVolume() {
        volume--;
        if (volume <= 0)
            volume = 0;
    }

}
