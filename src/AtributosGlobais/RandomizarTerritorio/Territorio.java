package AtributosGlobais.RandomizarTerritorio;

import java.util.Random;

public class Territorio {
    String territorio;

    public Territorio() {
        Random territorioA = new Random();
        int A = territorioA.nextInt(3);
        switch (A) {
            case 0:
                territorio = "IONIA";
                break;
            case 1:
                territorio = "SHURIMA";
                break;
            case 2:
                territorio = "NOXUS";
                break;
            case 3:
                territorio = "VAZIO";
                break;
        }
    }

    public String getTerritorio() {
        return territorio;
    }
}