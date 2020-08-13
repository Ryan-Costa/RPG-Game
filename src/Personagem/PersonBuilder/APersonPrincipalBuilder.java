package Personagem.PersonBuilder;

import Personagem.Personagem.*;

public class APersonPrincipalBuilder implements APersonBuilder {
	private float vida = 100.0f;
	private float ataque = 50.0f;
	private float defesa = 50.0f;

	private String sexo;
	private String nome;

	private String runa;
	private String item;
	private String talento;

	@Override
	public void setVida(float vida) {
		this.vida = vida;
	}

	@Override
	public void setAtaque(float ataque) {
		this.ataque = ataque;
	}

	@Override
	public void setDefesa(float defesa) {
		this.defesa = defesa;
	}

	@Override
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setRuna(String runa) {
		this.runa = runa;
	}

	@Override
	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public void setTalento(String talento) {
		this.talento = talento;
	}

	@Override
	public AaPerson getAaPerson() {
		return new AaPersonPrincipal(vida, ataque, defesa, sexo, nome, runa, item, talento);
	}

}
