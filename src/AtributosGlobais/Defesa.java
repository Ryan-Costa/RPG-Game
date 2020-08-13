package AtributosGlobais;

public class Defesa {

    // Definição de dano padrão de cada terreno, para melhorar a flexibilidade caso
    // seja //
    // necessário trocar algum atributo //
    float Ionia = 0.10f;
    float Shurima = 0.10f;
    float Noxus = 0.10f;
    float Vazio = 0.10f;
    // =================================================================================================
    // //

    // Definição de dano padrão de cada classe, para melhorar a flexibilidade caso
    // seja //
    // necessário trocar algum atributo //

    float defensePadraoAssassinos = 30.0f;
    float defensePadraoLutadores = 150.0f;
    float defensePadraoMagos = 120.0f;
    float defensePadraoTanques = 270.0f;
    // =================================================================================================
    // //

    // toda classe deverá ter sua defesa padrão setado, antes mesmo de entrar no
    // Switch //
    // porque ela poderá ou não ser escolhiada para ser adicionada defesa //
    // ASSASINOS //
    float kassadinDefense = defensePadraoAssassinos;
    float katarinaDefense = defensePadraoAssassinos;
    float kaynDefense = defensePadraoAssassinos;
    float khaZixDefense = defensePadraoAssassinos;
    float leBlancDefense = defensePadraoAssassinos;

    // LUTADORES //
    float ireliaDefense = defensePadraoLutadores;
    float leeSinDefense = defensePadraoLutadores;
    float renektonDefense = defensePadraoLutadores;
    float rivenDefense = defensePadraoLutadores;
    float yasuoDefense = defensePadraoLutadores;

    // MAGOS //
    float ahriDefense = defensePadraoMagos;
    float azirDefense = defensePadraoMagos;
    float malzaharDefense = defensePadraoMagos;
    float swainDefense = defensePadraoMagos;
    float xerathDefense = defensePadraoMagos;

    // TANQUES //
    float amumuDefense = defensePadraoTanques;
    float choGathDefense = defensePadraoTanques;
    float dariusDefense = defensePadraoTanques;
    float rammusDefense = defensePadraoTanques;
    float shenDefense = defensePadraoTanques;
    // =================================================================================================
    // //

    // Switch para a adição de damage de acordo com o terreno escolhido //
    public void SetarDefesa(String territorio) {
        switch (territorio) {

            case "IONIA":
                ireliaDefense += (this.Ionia * ireliaDefense);
                ahriDefense += (this.Ionia * ahriDefense);
                kaynDefense += (this.Ionia * kaynDefense);
                yasuoDefense += (this.Ionia * yasuoDefense);
                leeSinDefense += (this.Ionia * leeSinDefense);
                shenDefense += (this.Ionia * shenDefense);

                break;

            case "SHURIMA":
                amumuDefense += (this.Shurima * amumuDefense);
                azirDefense += (this.Shurima * azirDefense);
                xerathDefense += (this.Shurima * xerathDefense);
                renektonDefense += (this.Shurima * renektonDefense);
                rammusDefense += (this.Shurima * rammusDefense);
                break;

            case "NOXUS":
                katarinaDefense += (this.Noxus * katarinaDefense);
                leBlancDefense += (this.Noxus * leBlancDefense);
                swainDefense += (this.Noxus * swainDefense);
                rivenDefense += (this.Noxus * rivenDefense);
                dariusDefense += (this.Noxus * dariusDefense);
                break;

            case "VAZIO":
                kassadinDefense += (this.Vazio * kassadinDefense);
                khaZixDefense += (this.Vazio * khaZixDefense);
                malzaharDefense += (this.Vazio * malzaharDefense);
                choGathDefense += (this.Vazio * choGathDefense);
                break;

        }
    }
    // =================================================================================================
    // //
    // Métodos getters para conseguir pegar o dano de cada criatura //

    public float getKassadinDefense() {
        return kassadinDefense;
    }

    public float getKatarinaDefense() {
        return katarinaDefense;
    }

    public float getKaynDefense() {
        return kaynDefense;
    }

    public float getKhaZixDefense() {
        return khaZixDefense;
    }

    public float getLeBlancDefense() {
        return leBlancDefense;
    }

    public float getIreliaDefense() {
        return ireliaDefense;
    }

    public float getLeeSinDefense() {
        return leeSinDefense;
    }

    public float getRenektonDefense() {
        return renektonDefense;
    }

    public float getRivenDefense() {
        return rivenDefense;
    }

    public float getYasuoDefense() {
        return yasuoDefense;
    }

    public float getAhriDefense() {
        return ahriDefense;
    }

    public float getAzirDefense() {
        return azirDefense;
    }

    public float getMalzaharDefense() {
        return malzaharDefense;
    }

    public float getSwainDefense() {
        return swainDefense;
    }

    public float getXerathDefense() {
        return xerathDefense;
    }

    public float getAmumuDefense() {
        return amumuDefense;
    }

    public float getChoGathDefense() {
        return choGathDefense;
    }

    public float getDariusDefense() {
        return dariusDefense;
    }

    public float getRammusDefense() {
        return rammusDefense;
    }

    public float getShenDefense() {
        return shenDefense;
    }
}
// =================================================================================================
// //