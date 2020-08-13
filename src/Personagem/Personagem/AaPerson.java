package Personagem.Personagem;
import java.util.Random;


public abstract class AaPerson {
	private float vida; 
	private float ataque;
	private float defesa;

	private String sexo;
	private String nome;

	private String runa;
	private String item;;
	private String talento;
	
	public AaPerson(float vida, float ataque, float defesa, String sexo, String nome,
	 String runa, String item, String talento) {
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;

		this.sexo = sexo;
		this.nome = nome;
		this.runa = runa;
		this.item = item;
		this.talento = talento;

	} 

	public String info() {
		String info = "\nNome: "+this.nome
				+"\nSexo: "+this.sexo
				+"\nVida: "+this.vida
				+"\nAtaque: "+this.ataque
				+"\nDefesa: "+this.defesa
				+"\nRuna selecionada: "+this.runa
				+"\nItem selecionado: "+this.item
				+"\nTalento selecionado: "+this.talento;
				//+"\nVida Valor selecionado: "+this.vida_valores
				//+"\nAtaque Valor selecionado: "+this.ataque_valores
				//+"\nDefesa Valor selecionado: "+this.defesa_valores;

		return info;
	}

	public float getVida() {
		return vida;
	}

	public void setVida(float vida) {
		this.vida = vida;
	}
	
	public void incrementarVida(float vida) {
		vida = this.vida += (vida * this.vida);
	}

	public float getAtaque() { 
		Random personGolpesA = new Random();
		float rAtaque = (personGolpesA.nextFloat() * 0.5f) + 0.5f;
		return ataque * rAtaque;
	}
	
	public float getDefesa() {
		Random personGolpesD = new Random();
		float rDefesa = (personGolpesD.nextFloat() * 0.5f) + 0.5f;
		return defesa * rDefesa;
	}

	public String getTalento() {
		return talento;
	}

	public String getNome() {
		return nome;
	}

	public String getRuna() {
		return runa;
	}

	public String getItem() {
		return item;
	}

}
