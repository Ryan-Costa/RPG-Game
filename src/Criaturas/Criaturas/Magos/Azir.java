package Criaturas.Criaturas.Magos;

import Criaturas.FabricaDeCriaturas.Criatura02;

public class Azir implements Criatura02 {
    float ataqueI;
    float defesaI;
    int energia = 100;
    String name = "Azir";
    String classe = " Mago ";

    public void mostrarCriatura02(float ataque, float defesa){
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
