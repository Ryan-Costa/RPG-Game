package Criaturas.Criaturas.Lutadores;

import Criaturas.FabricaDeCriaturas.Criatura03;

public class Renekton implements Criatura03 {
    float ataqueI;
    float defesaI;
    int energia = 100;
    String name = "Renekton";
    String classe = " Lutador ";

    public void mostrarCriatura03(float ataque, float defesa){
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
