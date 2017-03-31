package com.crud.nichos;

import java.util.Arrays;
import java.util.List;

import com.crud.nichos.model.Usuario;

public class GeradorDeUsuarios {

	public static void main(String[] args) {

		Usuario primeiro = new Usuario("Alessandro", "ale@gmail.com");
		Usuario segundo = new Usuario("Patricia", "paty@yahoo.com.br");
		Usuario terceiro = new Usuario("Ester", "ester@yahoo.com.br");
		
		List<Usuario> usuarios = Arrays.asList(primeiro, segundo, terceiro);
				
		for (Usuario usuario : usuarios) {
			System.out.println("Usuário: " + usuario);
		}
				
	}

}
