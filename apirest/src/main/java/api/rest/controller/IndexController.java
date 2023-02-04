package api.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.model.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<Usuario> init() {

		Usuario usuario = new Usuario();
		usuario.setId(50L);
		usuario.setLogin("lluanps@gmail.com");
		usuario.setNome("Luan Pinheiro da Silva");
		usuario.setSenha("123");
		
		Usuario usuario2 = new Usuario();
		usuario2.setId(50L);
		usuario2.setLogin("lfasluanps@gmail.com");
		usuario2.setNome("Lua Pinheiro da Silva");
		usuario2.setSenha("1223");
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario);
		usuarios.add(usuario2);

		return new ResponseEntity(usuarios, HttpStatus.OK);
	}

}
