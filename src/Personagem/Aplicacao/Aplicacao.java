package Personagem.Aplicacao;

import Personagem.PersonBuilder.*;
import Personagem.PersonManager.*;
import Personagem.Personagem.*;

public class Aplicacao {
	public static void main(String args[]) {
		PersonManager gerente = new PersonManager();

		gerente.setConstrutor(new APersonPrincipalBuilder());
		gerente.criador();

		AaPerson Person = gerente.getAaPerson();

		System.out.println(Person.info());
	}
}
