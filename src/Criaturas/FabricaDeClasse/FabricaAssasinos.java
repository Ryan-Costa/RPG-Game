package Criaturas.FabricaDeClasse;

import Criaturas.FabricaPrincipal.*;
import Criaturas.FabricaDeCriaturas.*;
import Criaturas.Criaturas.Assasinos.*;

public class FabricaAssasinos implements FabricaPrincipal {

    public Criatura01 mostrarCriatura01() {
        return new Kassadin();
    }

    public Criatura02 mostrarCriatura02() {
        return new Katarina();
    }

    public Criatura03 mostrarCriatura03() {
        return new Kayn();
    }

    public Criatura04 mostrarCriatura04() {
        return new KhaZix();
    }

    public Criatura05 mostrarCriatura05() {
        return new LeBlanc();
    }
}