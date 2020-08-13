package Personagem.PersonManager;

import Personagem.PersonBuilder.*;
import Personagem.Personagem.*;
import AtributosGlobais.*;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PersonManager {
	AtributosPerson Person = new AtributosPerson();

	private APersonBuilder construtor;
	Scanner entrada;

	private float ataque = Person.getPersonDamage();
	private float defesa = Person.getPersonDefense();
	private float vida = Person.getPersonVida();

	public void setConstrutor(APersonBuilder construtor) {
		this.construtor = construtor;
	}

	public void criador() {
		this.entrada = new Scanner(System.in);

		// ########################################################################################//
		// AREA DA ESCOLHA DO *SEXO* DO PERSONAGEM
		String[] sexo = { "Selecione", "Masculino", "Feminino" };
		String _sexo = (String) JOptionPane.showInputDialog(null, "Escolha o sexo do personagem",
				"Criacao do Personagem", JOptionPane.QUESTION_MESSAGE, null, sexo, sexo[0]);
		construtor.setSexo(_sexo);

		String sErr = null;
		// ========================================================================================//
		while (_sexo == null) {
			System.out.print("Saindo do código");
			for (int C = 0; C <= 3; C++) {
				try {
					Thread.sleep(350);
				} catch (InterruptedException ex) {
				}
				System.out.print(".");
			}
			for (int i = 0; i < 100; ++i)
				System.out.println();
			System.exit(0);
		}

		while (_sexo == "Selecione") {
			sErr = (String) JOptionPane.showInputDialog(null, "Escolha o sexo do personagem", "Criacao do Personagem",
					JOptionPane.QUESTION_MESSAGE, null, sexo, sexo[0]);
			System.err.println("Selecione um sexo permitido.");
			_sexo = sErr;

			while (_sexo == null) {
				System.out.print("Saindo do código");
				for (int C = 0; C <= 3; C++) {
					try {
						Thread.sleep(350);
					} catch (InterruptedException ex) {
					}
					System.out.print(".");
				}
				for (int i = 0; i < 100; ++i)
					System.out.println();
				System.exit(0);
			}
		}
		construtor.setSexo(_sexo);
		// ========================================================================================//
		// ########################################################################################//

		// ########################################################################################//
		// AREA DA ESCOLHA DO *NOME* DO PERSONAGEM
		String nome = JOptionPane.showInputDialog(null, "Escolha o nome para o seu personagem", "Criacao do Personagem",
				JOptionPane.QUESTION_MESSAGE);

		String sNome = null;
		// ========================================================================================//
		while (nome.length() <= 1) {
			System.err.println("Nome nao permitido");
			sNome = JOptionPane.showInputDialog(null, "Escolha o nome para o seu personagem", "Criacao do Personagem",
					JOptionPane.QUESTION_MESSAGE);
			nome = sNome;
		}
		construtor.setNome(nome);
		// ========================================================================================//
		// ########################################################################################//

		// ########################################################################################//
		// AREA DA ESCOLHA DA *RUNA* DO PERSONAGEM
		String[] runa = { "Selecione", "Precisao", "Dominacao", "Determinacao" };
		float[] runa_valores = { 0f, 100f, 30f, 20f };
		String _runa = (String) JOptionPane.showInputDialog(null,
				"Escolha uma Runa \nPrecisao => (+100 de Vida) \nDominacao => (+30 de Dano) \nDetermincao => (+10 de Defesa) ",
				"Criacao do Personagem", JOptionPane.QUESTION_MESSAGE, null, runa, runa[0]);
		String sRuna = null;
		// ========================================================================================//
		while (_runa == null) {
			System.out.print("Saindo do código");
			for (int C = 0; C <= 3; C++) {
				try {
					Thread.sleep(350);
				} catch (InterruptedException ex) {
				}
				System.out.print(".");
			}
			for (int i = 0; i < 100; ++i)
				System.out.println();
			System.exit(0);
		}

		while (_runa == "Selecione") {
			System.err.println("Runa nao permitida");
			sRuna = (String) JOptionPane.showInputDialog(null, "Escolha uma Runa  ", "Criacao do Personagem",
					JOptionPane.QUESTION_MESSAGE, null, runa, runa[0]);
			_runa = sRuna;

			while (_runa == null) {
				System.out.print("Saindo do código");
				for (int C = 0; C <= 3; C++) {
					try {
						Thread.sleep(350);
					} catch (InterruptedException ex) {
					}
					System.out.print(".");
				}
				for (int i = 0; i < 100; ++i)
					System.out.println();
				System.exit(0);
			}
		}

		System.out.println("Runa selecionada!");
		// ========================================================================================//
		// ========================================================================================//
		switch (_runa) {
			case "Precisao":
				vida += runa_valores[1];
				break;

			case "Dominacao":
				ataque += runa_valores[2];
				break;

			case "Determinacao":
				defesa += runa_valores[3];
				break;
		}
		construtor.setRuna(_runa);
		// ========================================================================================//
		// ########################################################################################//

		// ########################################################################################//
		// AREA DA ESCOLHA DO *ITEM* DO PERSONAGEM
		String[] item = { "Selecione", "Anel de Doran", "Espada de Doran", "Escudo de Doran" };
		float[] item_valores = { 0f, 0.30f, 0.40f, 0.15f };
		String _item = (String) JOptionPane.showInputDialog(null,
				"Escolha um Item \nAnel de Doran => (+ 30% de Vida) \nEspada de Doran => (+ 40% de Dano) \nEscudo de Doran = (+ 15% de Defesa)",
				"Criacao do Personagem", JOptionPane.QUESTION_MESSAGE, null, item, item[0]);
		String sItem = null;
		// ========================================================================================//
		while (_item == null) {
			System.out.print("Saindo do código");
			for (int C = 0; C <= 3; C++) {
				try {
					Thread.sleep(350);
				} catch (InterruptedException ex) {
				}
				System.out.print(".");
			}
			for (int i = 0; i < 100; ++i)
				System.out.println();
			System.exit(0);
		}

		while (_item == "Selecione") {
			System.out.println("Item nao permitido");
			sItem = (String) JOptionPane.showInputDialog(null, "Escolha um Item", "Criacao do Personagem",
					JOptionPane.QUESTION_MESSAGE, null, item, item[0]);
			_item = sItem;

			while (_sexo == null) {
				System.out.print("Saindo do código");
				for (int C = 0; C <= 3; C++) {
					try {
						Thread.sleep(350);
					} catch (InterruptedException ex) {
					}
					System.out.print(".");
				}
				for (int i = 0; i < 100; ++i)
					System.out.println();
				System.exit(0);
			}
		}

		System.out.println("Item selecionado!");
		// ========================================================================================//
		// ========================================================================================//
		switch (_item) {
			case "Anel de Doran":
				vida += (item_valores[1] * vida);
				break;

			case "Espada de Doran":
				ataque += (item_valores[2] * ataque);
				break;

			case "Escudo de Doran":
				defesa += (item_valores[3] * defesa);
				break;
		}
		construtor.setItem(_item);
		// ========================================================================================//
		// ########################################################################################//

		// ########################################################################################//
		// AREA DA ESCOLHA DO *TALENTO* DO PERSONAGEM
		String[] talento = { "Selecione", "Flash", "Incendiar", "Barreira" };
		String _talento = (String) JOptionPane.showInputDialog(null,
				"Escolha um Talento \nFlash \nIncendiar \nBarreira", "Criacao do Personagem",
				JOptionPane.QUESTION_MESSAGE, null, talento, talento[0]);
		String sTalento = null;

		// ========================================================================================//
		while (_talento == null) {
			System.out.print("Saindo do código");
			for (int C = 0; C <= 3; C++) {
				try {
					Thread.sleep(350);
				} catch (InterruptedException ex) {
				}
				System.out.print(".");
			}
			for (int i = 0; i < 100; ++i)
				System.out.println();
			System.exit(0);
		}

		while (_talento == "Selecione") {
			System.out.println("Talento nao permitido");
			sTalento = (String) JOptionPane.showInputDialog(null, "Escolha um Talento", "Criacao do Personagem",
					JOptionPane.QUESTION_MESSAGE, null, talento, talento[0]);
			_talento = sTalento;

			while (_talento == null) {
				System.out.print("Saindo do código");
				for (int C = 0; C <= 3; C++) {
					try {
						Thread.sleep(350);
					} catch (InterruptedException ex) {
					}
					System.out.print(".");
				}
				for (int i = 0; i < 100; ++i)
					System.out.println();
				System.exit(0);
			}
		}
		System.out.println("Talento selecionado!");
		// ========================================================================================//
		// ========================================================================================//

		construtor.setTalento(_talento);
		// ========================================================================================//
		// ########################################################################################//

		construtor.setAtaque(ataque);
		construtor.setDefesa(defesa);
		construtor.setVida(vida);
	}

	public AaPerson getAaPerson() {
		return construtor.getAaPerson();
	}

}