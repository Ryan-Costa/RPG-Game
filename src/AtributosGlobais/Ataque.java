package AtributosGlobais;

public class Ataque {

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

    float damagePadraoAssassinos = 270.0f;
    float damagePadraoLutadores = 150.0f;
    float damagePadraoMagos = 180.0f;
    float damagePadraoTanques = 30.0f;
    // =================================================================================================
    // //

    // toda classe deverá ter seu dano padrão setado, antes mesmo de entrar no
    // Switch //
    // porque ela poderá ou não ser escolhiada para ser adicionada dano //
    // ASSASINOS //
    float kassadinDamage = damagePadraoAssassinos;
    float katarinaDamage = damagePadraoAssassinos;
    float kaynDamage = damagePadraoAssassinos;
    float khaZixDamage = damagePadraoAssassinos;
    float leBlancDamage = damagePadraoAssassinos;

    // LUTADORES //
    float ireliaDamage = damagePadraoLutadores;
    float leeSinDamage = damagePadraoLutadores;
    float renektonDamage = damagePadraoLutadores;
    float rivenDamage = damagePadraoLutadores;
    float yasuoDamage = damagePadraoLutadores;

    // MAGOS //
    float ahriDamage = damagePadraoMagos;
    float azirDamage = damagePadraoMagos;
    float malzaharDamage = damagePadraoMagos;
    float swainDamage = damagePadraoMagos;
    float xerathDamage = damagePadraoMagos;

    // TANQUES //
    float amumuDamage = damagePadraoTanques;
    float choGathDamage = damagePadraoTanques;
    float dariusDamage = damagePadraoTanques;
    float rammusDamage = damagePadraoTanques;
    float shenDamage = damagePadraoTanques;
    // =================================================================================================
    // //

    // Switch para a adição de damage de acordo com o terreno escolhido //
    public void SetarAtaque(final String territorio) {
        switch (territorio) {

            case "IONIA":
                ireliaDamage += (this.Ionia * ireliaDamage);
                ahriDamage += (this.Ionia * ahriDamage);
                kaynDamage += (this.Ionia * kaynDamage);
                yasuoDamage += (this.Ionia * yasuoDamage);
                leeSinDamage += (this.Ionia * leeSinDamage);
                shenDamage += (this.Ionia * shenDamage);

                break;

            case "SHURIMA":
                amumuDamage += (this.Shurima * amumuDamage);
                azirDamage += (this.Shurima * azirDamage);
                xerathDamage += (this.Shurima * xerathDamage);
                renektonDamage += (this.Shurima * renektonDamage);
                rammusDamage += (this.Shurima * rammusDamage);
                break;

            case "NOXUS":
                katarinaDamage += (this.Noxus * katarinaDamage);
                leBlancDamage += (this.Noxus * leBlancDamage);
                swainDamage += (this.Noxus * swainDamage);
                rivenDamage += (this.Noxus * rivenDamage);
                dariusDamage += (this.Noxus * dariusDamage);
                break;

            case "VAZIO":
                kassadinDamage += (this.Vazio * kassadinDamage);
                khaZixDamage += (this.Vazio * khaZixDamage);
                malzaharDamage += (this.Vazio * malzaharDamage);
                choGathDamage += (this.Vazio * choGathDamage);
                break;

        }
    }
    // =================================================================================================
    // //
    // Métodos getters para conseguir pegar o dano de cada criatura //

    public float getKassadinDamage() {
        return kassadinDamage;
    }

    public float getKatarinaDamage() {
        return katarinaDamage;
    }

    public float getKaynDamage() {
        return kaynDamage;
    }

    public float getKhaZixDamage() {
        return khaZixDamage;
    }

    public float getLeBlancDamage() {
        return leBlancDamage;
    }

    public float getIreliaDamage() {
        return ireliaDamage;
    }

    public float getLeeSinDamage() {
        return leeSinDamage;
    }

    public float getRenektonDamage() {
        return renektonDamage;
    }

    public float getRivenDamage() {
        return rivenDamage;
    }

    public float getYasuoDamage() {
        return yasuoDamage;
    }

    public float getAhriDamage() {
        return ahriDamage;
    }

    public float getAzirDamage() {
        return azirDamage;
    }

    public float getMalzaharDamage() {
        return malzaharDamage;
    }

    public float getSwainDamage() {
        return swainDamage;
    }

    public float getXerathDamage() {
        return xerathDamage;
    }

    public float getAmumuDamage() {
        return amumuDamage;
    }

    public float getChoGathDamage() {
        return choGathDamage;
    }

    public float getDariusDamage() {
        return dariusDamage;
    }

    public float getRammusDamage() {
        return rammusDamage;
    }

    public float getShenDamage() {
        return shenDamage;
    }

}
// =================================================================================================
// //
