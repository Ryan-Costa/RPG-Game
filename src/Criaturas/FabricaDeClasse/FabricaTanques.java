package Criaturas.FabricaDeClasse;

import Criaturas.Criaturas.Tanques.*;
import Criaturas.FabricaPrincipal.*;
import Criaturas.FabricaDeCriaturas.*;

public class FabricaTanques implements FabricaPrincipal {

    public Criatura01 mostrarCriatura01() {
        return new Amumu();
    }

    public Criatura02 mostrarCriatura02() {
        return new Chogath();
    }

    public Criatura03 mostrarCriatura03() {
        return new Darius();
    }

    public Criatura04 mostrarCriatura04() {
        return new Rammus();
    }

    public Criatura05 mostrarCriatura05() {
        return new Shen();
    }
}