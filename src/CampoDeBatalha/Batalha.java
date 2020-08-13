package CampoDeBatalha;

import java.util.ArrayList;
import java.util.List;

import AtributosGlobais.AtributosPerson;
import Criaturas.Aplicacao.*;
import Nucleo.Fachada;
import Personagem.PersonBuilder.*;
import Personagem.PersonManager.*;
import Personagem.Personagem.*;

public class Batalha extends GerarCriaturas implements Fachada {

  // Variáveis de ranking//
  List<String> territoro = new ArrayList<String>();
  int qAssasinos = 0; // Variável para contabilizar as criaturas mortas.
  int qLutadores = 0; // Variável para contabilizar as criaturas mortas.
  int qMagos = 0; // Variável para contabilizar as criaturas mortas.
  int qTanques = 0; // Variável para contabilizar as criaturas mortas.
  int qBatalha = 0; // Variável para contabilizar as criaturas mortas.
  int desafios = 0; // Variável para contabilizar os desafios.
  int pontuacao = 0;
  String name;
  float vida;
  String runa;
  String item;
  String talento;
  // ^^^^^^^ Variáveis de ranking ^^^^^^^//

  // Inicialização de variáveis e instanciamento de classes //
  int rounds = 0; // Variável para contabilizar os rounds dos desafios
  float contador = 0; // Contador para setar a hora de utilizar as runas
  GerarCriaturas Criaturas = new GerarCriaturas(); // Instaciamento de criaturas
  PersonManager gerente = new PersonManager(); // Instaciamento de personagem
  AtributosPerson totalDamage = new AtributosPerson(); // Variável para aplicar o dano total em runas como "FLASH"
  // ^^^^^^^ Inicialização de variáveis e instanciamento de classes ^^^^^^^//

  public void IniciarBatalha() {

    // Inicialização do personagem //
    gerente.setConstrutor(new APersonPrincipalBuilder());
    gerente.criador();
    AaPerson Person = gerente.getAaPerson();
    System.out.println(Person.info()); // Informações do personagem criado
    float danoTotal = Person.getVida(); // Inicialização de variável para gerar a vida do personagem após batalha.
    // ^^^^^^^ Inicialização do personagem ^^^^^^^//

    System.out.print("Esses são os atributos do seu personagem. Começando as batalhas");
    for (int C = 0; C <= 2; C++) { // Delay entre DUELOS
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
      } // Delay entre DUELOS
      System.out.print("."); // Delay entre DUELOS
    }
    System.out.println("");
    System.out.println("QUE COMECE O DUELO! ");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
    } // Delay entre DUELOS

    // Batalha //
    while (desafios < 5 && Person.getVida() > 0) { // While para contabilizar os 5 níveis
      Criaturas.criarCriaturas();
      System.out.println();
      int cDesafios = desafios + 1;

      System.out.println("===============" + " INICIO DO " + cDesafios + "º Nível" + "===============");

      for (rounds = 0; rounds <= 24 && Person.getVida() > 0; rounds++) { // For para contabilizar as 25 lutas
        int cRounds = rounds + 1;
        System.out.println("");
        System.out.println("################## DUELO #################");
        System.out.println("\t" + Person.getNome() + "\tVS\t" + Criaturas.getNames().get(rounds));

        System.out.println("Informações do " + cRounds + "º Round ");
        System.out.println("Sua vida: " + Person.getVida());

        float energiaC = 100f;
        while (energiaC > 0 && Person.getVida() > 0) {
          float acumuladoCriatura = 0; // Variável para acumular o dano da criatura
          float acumuladoPersonagem = 0; // Variável para acumular o dano do personagem

          float criaturaAtaque = Criaturas.getAtaque(rounds); // Váriavel já randomizada para o combate.
          float criaturaDefesa = Criaturas.getDefesa(rounds); // Váriavel já randomizada para o combate.
          float personagemAtaque = Person.getAtaque(); // Váriavel já randomizada para o combate.
          float personagemDefesa = Person.getDefesa(); // Váriavel já randomizada para o combate.

          // ÁREA ONDE A CRIATURA ATACA //
          if (criaturaAtaque <= personagemDefesa) {
          } else {
            acumuladoCriatura = criaturaAtaque - personagemDefesa;
            danoTotal = Person.getVida() - acumuladoCriatura;
            contador += acumuladoCriatura;
          }

          if (Person.getVida() <= 0) {
            System.out.println("Você morreu.");
            break;
          }
          // ^^^^^^^ ÁREA ONDE A CRIATURA ATACA ^^^^^^^//

          // ÁREA ONDE O PERSONAGEM ATACA //
          if (personagemAtaque <= criaturaDefesa) {
          } else {
            if (contador >= 130f) {
              switch (Person.getTalento()) {

                case "Flash":
                  if (criaturaAtaque <= personagemDefesa) {
                  } else {
                    Person.setVida(danoTotal);
                  }
                  energiaC -= totalDamage.getPersonDamage();
                  // INFORMAÇÕES SOBRE A BATALHA COM TALENTOS //
                  System.out.println("-------------------------------------");
                  System.out.println("Dano Criatura: " + criaturaAtaque);
                  System.out.println("Defesa personagem: " + personagemDefesa);
                  System.out.println("Vida personagem: " + Person.getVida());
                  System.out.println("-------------------------------------");
                  System.out.println("Você flashou, causando dano crítico de 100%");
                  System.out.println("Dano total: " + totalDamage.getPersonDamage());
                  System.out.println("Vida da criatura: " + energiaC);
                  // ^^^^^^^ INFORMAÇÕES SOBRE A BATALHA COM TALENTOS ^^^^^^^//
                  break;

                case "Incendiar":
                  if (criaturaAtaque <= personagemDefesa) {
                  } else {
                    Person.setVida(danoTotal);
                  }
                  float C = criaturaDefesa;
                  C -= (criaturaDefesa * 0.15f);
                  acumuladoPersonagem = personagemAtaque - C;
                  energiaC -= acumuladoPersonagem;

                  // INFORMAÇÕES SOBRE A BATALHA COM TALENTOS //
                  System.out.println("-------------------------------------");
                  System.out.println("Dano Criatura: " + criaturaAtaque);
                  System.out.println("Defesa personagem: " + personagemDefesa);
                  System.out.println("Vida personagem: " + Person.getVida());
                  System.out.println("-------------------------------------");
                  System.out.println("Dano Personagem: " + personagemAtaque);
                  System.out.println("Você Incendiou o inimigo abaixando sua defesa em 15%.");
                  System.out.println("DEFESA DA CRIATURA ANTES DA RUNA: " + criaturaDefesa);
                  System.out.println("DEFESA DA CRIATURA APÓS A RUNA: " + C);
                  System.out.println("Dano tomado: " + acumuladoPersonagem);
                  System.out.println("Vida da criatura: " + energiaC);
                  // ^^^^^^^ INFORMAÇÕES SOBRE A BATALHA COM TALENTOS ^^^^^^^//
                  break;

                case "Barreira":
                  acumuladoPersonagem = personagemAtaque - criaturaDefesa;
                  energiaC -= acumuladoPersonagem;

                  // INFORMAÇÕES SOBRE A BATALHA COM TALENTOS //
                  System.out.println("Você defendeu o ataque, logo não toma nenhum dano.");
                  System.out.println("Dano criatura: 0.0");
                  System.out.println("-------------------------------------");
                  System.out.println("Dano personagem: " + personagemAtaque);
                  System.out.println("Defesa Criatura: " + criaturaDefesa);
                  System.out.println("Vida criatura: " + energiaC);
                  System.out.println("-------------------------------------");
                  // ^^^^^^^ INFORMAÇÕES SOBRE A BATALHA COM TALENTOS ^^^^^^^//
                  break;
              }
              contador = 0f;
            }
            // ^^^^^^^ TALENTOS UTILIZADOS ^^^^^^^//

            // ATAQUE BÁSICO PADRÃO //
            else {
              if (criaturaAtaque <= personagemDefesa) {
              } else {
                Person.setVida(danoTotal);
              }
              System.out.println("TALENTO NÃO UTILIZADO");
              acumuladoPersonagem = personagemAtaque - criaturaDefesa;
              energiaC -= acumuladoPersonagem;

              // INFORMAÇÕES SOBRE A BATALHA //
              System.out.println("-------------------------------------");
              System.out.println("Dano Criatura: " + criaturaAtaque);
              System.out.println("Defesa personagem: " + personagemDefesa);
              System.out.println("Vida personagem: " + Person.getVida());
              System.out.println("-------------------------------------");
              System.out.println("Dano personagem: " + personagemAtaque);
              System.out.println("Defesa Criatura: " + criaturaDefesa);
              System.out.println("Vida criatura: " + energiaC);
              System.out.println("-------------------------------------");
              if (acumuladoCriatura <= 0) {
                String valorDamageC;
                valorDamageC = "Ataque da criatura menor que defesa do personagem, dano insuficiente.";
                System.out.println(valorDamageC);
              } else {
                System.out.println("Dano que o personagem tomou da critura: " + acumuladoCriatura);
              }
              System.out.println("Dano que a criatura tomou do personagem: " + acumuladoPersonagem);
            }
            // ^^^^^^^ INFORMAÇÕES SOBRE A BATALHA ^^^^^^^//
            // ^^^^^^^ ATAQUE BÁSICO PADRÃO ^^^^^^^//
          }

        }
        System.out.println("Fim do " + cRounds + "º round");
        System.out.println("##########################################\n");

        if (energiaC <= 0) {
          String Armazem = Criaturas.getClasses(rounds);
          switch (Armazem) {
            case " Assassino ":
              qAssasinos += 1;
              pontuacao += 20 + cDesafios;
              break;

            case " Lutador ":
              qLutadores += 1;
              pontuacao += 18 + cDesafios;
              break;

            case " Mago ":
              qMagos += 1;
              pontuacao += 18 + cDesafios;
              break;

            case " Tanque ":
              qTanques += 1;
              pontuacao += 20 + cDesafios;
              break;
          }

        }
        vida = Person.getVida();
        name = Person.getNome();
        runa = Person.getRuna();
        item = Person.getItem();
        talento = Person.getTalento();
      }
      // STATUS DA BATALHA //

      Person.incrementarVida(0.5f); // Incrementação de 50% de vida a cada desafio.
      System.out.println("===============" + " FIM Do " + cDesafios + "º nível" + "===============");
      desafios++;
      System.out.println("");

      if (this.vida > 0) {
        System.out.println("Você passou por esse nível.");
        try {
          Thread.sleep(400);
        } catch (InterruptedException ex) {
        } // Delay entre DUELOS
        System.out.println("Foram gerados 25 novos monstros!");
        try {
          Thread.sleep(400);
        } catch (InterruptedException ex) {
        } // Delay entre DUELOS
        System.out.println("Começando o próximo nível.");
        try {
          Thread.sleep(2000);
        } catch (InterruptedException ex) {
        } // Delay entre DUELOS
      } else {
        try {
          Thread.sleep(400);
        } catch (InterruptedException ex) {
        } // Delay entre DUELOS
        System.out.println("Você morreu, o ranking será impresso. \n");
        try {
          Thread.sleep(2000);
        } catch (InterruptedException ex) {
        } // Delay entre DUELOS
      }
    }
  }

  public void Ranking() {
    System.out.println("################### RANKING ###################");
    System.out.println(
        "O mago " + this.name + " Equipado com a Runa " + runa + 
        ",\nItem " + item +" E Talento " + talento + 
        ".\nAtingiu o nível "+ desafios +" fez um total de " + pontuacao +" Pontos.\n");
  
    System.out.println("Foram enfrentados: ");
    System.out.println("Total de assasinos abatidos: " + qAssasinos);
    System.out.println("Total de lutadores abatidos: " + qLutadores);
    System.out.println("Total de magos abatidos: " + qMagos);
    System.out.println("Total de tanques abatidos: " + qTanques);
    qBatalha = qAssasinos + qLutadores + qMagos + qTanques;
    System.out.println("Total de criaturas abatidas: " + qBatalha);

    System.out.println("\nTerrenos escolhidos: ");
    System.out.println(Criaturas.getTerritorioAr());

    System.out.println("\nRanking");
    System.out.println("PS  NOME \t PTS  CRIATURAS");
    System.out.println("_____________________________");
    System.out.println("1 | " + this.name + "\t| " + pontuacao + " | " + qBatalha);

    System.out.println("################### RANKING ###################");

  }
}
