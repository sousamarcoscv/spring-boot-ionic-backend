/**
 * 
 */
package com.marcossousa.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcossousa.domain.Categoria;

/**
 * @author Usuário
 *
 * Nome padrão onde grava as classes controladores REST.... ( Recursos).
 */
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar(){
		Categoria cat1 = new Categoria(1,"Eletronicos");
		Categoria cat2 = new Categoria(1,"Utencilios");
		List<Categoria> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		
		return list;
		
		
	}
	
}
