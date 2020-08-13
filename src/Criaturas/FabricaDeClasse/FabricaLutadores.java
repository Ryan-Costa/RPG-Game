package Criaturas.FabricaDeClasse;

import Criaturas.Criaturas.Lutadores.*;
import Criaturas.FabricaPrincipal.*;
import Criaturas.FabricaDeCriaturas.*;

public class FabricaLutadores implements FabricaPrincipal {

    public Criatura01 mostrarCriatura01() {
        return new Irelia();
    }

    public Criatura02 mostrarCriatura02() {
        return new LeeSin();
    }

    public Criatura03 mostrarCriatura03() {
        return new Renekton();
    }

    public Criatura04 mostrarCriatura04() {
        return new Riven();
    }

    public Criatura05 mostrarCriatura05() {
        return new Yasuo();
    }
}
