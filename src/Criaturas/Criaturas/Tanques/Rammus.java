package Criaturas.Criaturas.Tanques;

import Criaturas.FabricaDeCriaturas.Criatura04;

public class Rammus implements Criatura04 {
    float ataqueI;
    float defesaI;
    int energia = 100;
    String name = "Rammus";
    String classe = " Tanque ";

    public void mostrarCriatura04(float ataque, float defesa){
        this.ataqueI = ataque;
        this.defesaI = defesa;
       // System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
    public float getAtaqueI() {
        return ataqueI;
    }

    public float getDefesaI() {
        return defesaI;
    }

    public int getEnergia() {
        return energia;
    }
    public String getName() {
        return name;
    }
    public String getClasse() {
        return classe;
    } 
}
