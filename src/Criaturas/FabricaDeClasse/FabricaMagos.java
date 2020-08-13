package Criaturas.FabricaDeClasse;

import Criaturas.Criaturas.Magos.*;
import Criaturas.FabricaPrincipal.*;
import Criaturas.FabricaDeCriaturas.*;

public class FabricaMagos implements FabricaPrincipal {

    public Criatura01 mostrarCriatura01() {
        return new Ahri();
    }

    public Criatura02 mostrarCriatura02() {
        return new Azir();
    }

    public Criatura03 mostrarCriatura03() {
        return new Malzahar();
    }

    public Criatura04 mostrarCriatura04() {
        return new Swain();
    }

    public Criatura05 mostrarCriatura05() {
        return new Xerath();
    }
}