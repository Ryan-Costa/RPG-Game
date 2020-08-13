package Personagem.PersonBuilder;

import Personagem.Personagem.*;

public interface APersonBuilder {
	public void setVida(float vida);

	public void setAtaque(float ataque);

	public void setDefesa(float defesa);

	public void setSexo(String sexo);

	public void setNome(String nome);

	public void setRuna(String runa);

	public void setItem(String item);

	public void setTalento(String talento);

	public AaPerson getAaPerson();
}
