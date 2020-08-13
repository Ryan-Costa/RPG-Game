package Criaturas.Aplicacao;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import AtributosGlobais.*;
import AtributosGlobais.RandomizarTerritorio.Territorio;
import Criaturas.FabricaDeClasse.FabricaAssasinos;
import Criaturas.FabricaDeClasse.FabricaLutadores;
import Criaturas.FabricaDeClasse.FabricaMagos;
import Criaturas.FabricaDeClasse.FabricaTanques;
import Criaturas.FabricaPrincipal.*;
import Criaturas.FabricaDeCriaturas.*;

public class GerarCriaturas {

    // Variáveis de quantidade //
    int qA = 0;
    int qL = 0;
    int qM = 0;
    int qT = 0;
    // Variáveis de quantidade //

    // Iniciar variáveis //
    FabricaPrincipal Assasino = new FabricaAssasinos();
    FabricaPrincipal Lutadores = new FabricaLutadores();
    FabricaPrincipal Magos = new FabricaMagos();
    FabricaPrincipal Tanques = new FabricaTanques();
    // Iniciar variáveis //

    // Variáveis para guardar todos os atributos gerados //
    List<String> territorioAr = new ArrayList<String>();
    List<String> classes = new ArrayList<String>();
    List<String> names = new ArrayList<String>();
    List<Float> ataque = new ArrayList<Float>();
    List<Float> defesa = new ArrayList<Float>();
    // Variáveis para guardar todos os atributos gerados //

    public void criarCriaturas() {
        Territorio territorio = new Territorio();

        List<String> classes = new ArrayList<String>();
        List<String> names = new ArrayList<String>();
        List<Float> ataque = new ArrayList<Float>();
        List<Float> defesa = new ArrayList<Float>();

        Defesa Defense = new Defesa();
        Ataque Damage = new Ataque();
        Damage.SetarAtaque(territorio.getTerritorio());
        Defense.SetarDefesa(territorio.getTerritorio());
        territorioAr.add(territorio.getTerritorio());

        // Gerador de 25 criaturas aleatórias //
        Random aleatorio = new Random();
        for (int a = 0; a <= 24; a++) {
            int b = aleatorio.nextInt(19);

            switch (b) {
                case 0:
                    Criatura01 Kassadin = Assasino.mostrarCriatura01();
                    Kassadin.mostrarCriatura01(Damage.getKassadinDamage(), Defense.getKassadinDefense());
                    qA = qA + 1;
                    names.add(Kassadin.getName());
                    ataque.add(Kassadin.getAtaqueI());
                    defesa.add(Kassadin.getDefesaI());
                    classes.add(Kassadin.getClasse());
                    break;

                case 1:
                    Criatura02 Katarina = Assasino.mostrarCriatura02();
                    Katarina.mostrarCriatura02(Damage.getKatarinaDamage(), Defense.getKatarinaDefense());
                    qA = qA + 1;
                    names.add(Katarina.getName());
                    ataque.add(Katarina.getAtaqueI());
                    defesa.add(Katarina.getDefesaI());
                    classes.add(Katarina.getClasse());

                    break;

                case 2:
                    Criatura03 Kayn = Assasino.mostrarCriatura03();
                    Kayn.mostrarCriatura03(Damage.getKaynDamage(), Defense.getKaynDefense());
                    qA = qA + 1;
                    names.add(Kayn.getName());
                    ataque.add(Kayn.getAtaqueI());
                    defesa.add(Kayn.getDefesaI());
                    classes.add(Kayn.getClasse());

                    break;

                case 3:
                    Criatura04 KhaZix = Assasino.mostrarCriatura04();
                    KhaZix.mostrarCriatura04(Damage.getKhaZixDamage(), Defense.getKhaZixDefense());
                    qA = qA + 1;
                    names.add(KhaZix.getName());
                    ataque.add(KhaZix.getAtaqueI());
                    defesa.add(KhaZix.getDefesaI());
                    classes.add(KhaZix.getClasse());

                    break;

                case 4:
                    Criatura05 LeBlanc = Assasino.mostrarCriatura05();
                    LeBlanc.mostrarCriatura05(Damage.getLeBlancDamage(), Defense.getLeBlancDefense());
                    qA = qA + 1;
                    names.add(LeBlanc.getName());
                    ataque.add(LeBlanc.getAtaqueI());
                    defesa.add(LeBlanc.getDefesaI());
                    classes.add(LeBlanc.getClasse());

                    break;

                case 5:
                    Criatura01 Irelia = Lutadores.mostrarCriatura01();
                    Irelia.mostrarCriatura01(Damage.getIreliaDamage(), Defense.getIreliaDefense());
                    qL = qL + 1;
                    names.add(Irelia.getName());
                    ataque.add(Irelia.getAtaqueI());
                    defesa.add(Irelia.getDefesaI());
                    classes.add(Irelia.getClasse());

                    break;

                case 6:
                    Criatura02 LeeSin = Lutadores.mostrarCriatura02();
                    LeeSin.mostrarCriatura02(Damage.getLeeSinDamage(), Defense.getLeeSinDefense());
                    qL = qL + 1;
                    names.add(LeeSin.getName());
                    ataque.add(LeeSin.getAtaqueI());
                    defesa.add(LeeSin.getDefesaI());
                    classes.add(LeeSin.getClasse());

                    break;

                case 7:
                    Criatura03 Renekton = Lutadores.mostrarCriatura03();
                    Renekton.mostrarCriatura03(Damage.getRenektonDamage(), Defense.getRenektonDefense());
                    qL = qL + 1;
                    names.add(Renekton.getName());
                    ataque.add(Renekton.getAtaqueI());
                    defesa.add(Renekton.getDefesaI());
                    classes.add(Renekton.getClasse());

                    break;

                case 8:
                    Criatura04 Riven = Lutadores.mostrarCriatura04();
                    Riven.mostrarCriatura04(Damage.getRivenDamage(), Defense.getRivenDefense());
                    qL = qL + 1;
                    names.add(Riven.getName());
                    ataque.add(Riven.getAtaqueI());
                    defesa.add(Riven.getDefesaI());
                    classes.add(Riven.getClasse());

                    break;

                case 9:
                    Criatura05 Yasuo = Lutadores.mostrarCriatura05();
                    Yasuo.mostrarCriatura05(Damage.getYasuoDamage(), Defense.getYasuoDefense());
                    qL = qL + 1;
                    names.add(Yasuo.getName());
                    ataque.add(Yasuo.getAtaqueI());
                    defesa.add(Yasuo.getDefesaI());
                    classes.add(Yasuo.getClasse());

                    break;

                case 10:
                    Criatura01 Ahri = Magos.mostrarCriatura01();
                    Ahri.mostrarCriatura01(Damage.getAhriDamage(), Defense.getAhriDefense());
                    qM = qM + 1;
                    names.add(Ahri.getName());
                    ataque.add(Ahri.getAtaqueI());
                    defesa.add(Ahri.getDefesaI());
                    classes.add(Ahri.getClasse());

                    break;

                case 11:
                    Criatura02 Azir = Magos.mostrarCriatura02();
                    Azir.mostrarCriatura02(Damage.getAzirDamage(), Defense.getAzirDefense());
                    qM = qM + 1;
                    names.add(Azir.getName());
                    ataque.add(Azir.getAtaqueI());
                    defesa.add(Azir.getDefesaI());
                    classes.add(Azir.getClasse());

                    break;

                case 12:
                    Criatura03 Malzahar = Magos.mostrarCriatura03();
                    Malzahar.mostrarCriatura03(Damage.getMalzaharDamage(), Defense.getMalzaharDefense());
                    qM = qM + 1;
                    names.add(Malzahar.getName());
                    ataque.add(Malzahar.getAtaqueI());
                    defesa.add(Malzahar.getDefesaI());
                    classes.add(Malzahar.getClasse());

                    break;

                case 13:
                    Criatura04 Swain = Magos.mostrarCriatura04();
                    Swain.mostrarCriatura04(Damage.getSwainDamage(), Defense.getSwainDefense());
                    qM = qM + 1;
                    names.add(Swain.getName());
                    ataque.add(Swain.getAtaqueI());
                    defesa.add(Swain.getDefesaI());
                    classes.add(Swain.getClasse());

                    break;

                case 14:
                    Criatura05 Xerath = Magos.mostrarCriatura05();
                    Xerath.mostrarCriatura05(Damage.getXerathDamage(), Defense.getXerathDefense());
                    qM = qM + 1;
                    names.add(Xerath.getName());
                    ataque.add(Xerath.getAtaqueI());
                    defesa.add(Xerath.getDefesaI());
                    classes.add(Xerath.getClasse());

                    break;

                case 15:
                    Criatura01 Amumu = Tanques.mostrarCriatura01();
                    Amumu.mostrarCriatura01(Damage.getAmumuDamage(), Defense.getAmumuDefense());
                    qT = qT + 1;
                    names.add(Amumu.getName());
                    ataque.add(Amumu.getAtaqueI());
                    defesa.add(Amumu.getDefesaI());
                    classes.add(Amumu.getClasse());

                    break;

                case 16:
                    Criatura02 Chogath = Tanques.mostrarCriatura02();
                    Chogath.mostrarCriatura02(Damage.getChoGathDamage(), Defense.getChoGathDefense());
                    qT = qT + 1;
                    names.add(Chogath.getName());
                    ataque.add(Chogath.getAtaqueI());
                    defesa.add(Chogath.getDefesaI());
                    classes.add(Chogath.getClasse());

                    break;

                case 17:
                    Criatura03 Darius = Tanques.mostrarCriatura03();
                    Darius.mostrarCriatura03(Damage.getDariusDamage(), Defense.getDariusDefense());
                    qT = qT + 1;
                    names.add(Darius.getName());
                    ataque.add(Darius.getAtaqueI());
                    defesa.add(Darius.getDefesaI());
                    classes.add(Darius.getClasse());

                    break;

                case 18:
                    Criatura04 Rammus = Tanques.mostrarCriatura04();
                    Rammus.mostrarCriatura04(Damage.getRammusDamage(), Defense.getRammusDefense());
                    qT = qT + 1;
                    names.add(Rammus.getName());
                    ataque.add(Rammus.getAtaqueI());
                    defesa.add(Rammus.getDefesaI());
                    classes.add(Rammus.getClasse());

                    break;

                case 19:
                    Criatura05 Shen = Tanques.mostrarCriatura05();
                    Shen.mostrarCriatura05(Damage.getShenDamage(), Defense.getShenDefense());
                    qT = qT + 1;
                    names.add(Shen.getName());
                    ataque.add(Shen.getAtaqueI());
                    defesa.add(Shen.getDefesaI());
                    classes.add(Shen.getClasse());

                    break;
            }
        }

        this.names = names;
        this.ataque = ataque;
        this.defesa = defesa;
        this.classes = classes;
    }

    public String getClasses(int rounds) {
        String cClasses = classes.get(rounds);
        return cClasses;
    }

    public List<String> getNames() {
        return names;
    }

    public Float getAtaque(int rounds) {
        Random criaturasGolpesA = new Random();
        float rAtaque = (criaturasGolpesA.nextFloat() * 0.5f) + 0.5f;
        float ataqueFinal = ataque.get(rounds) * rAtaque;
        return ataqueFinal;
    }

    public Float getDefesa(int rounds) {
        Random criaturasGolpesA = new Random();
        float rDefesa = (criaturasGolpesA.nextFloat() * 0.5f) + 0.5f;
        float defesaFinal = defesa.get(rounds) * rDefesa;
        return defesaFinal;
    }

    public List<String> getTerritorioAr() {
        return territorioAr;
    }
}
