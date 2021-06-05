/**
 * 
 */
package com.marcossousa.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Usuário
 *
 * Nome padrão onde grava as classes controladores REST.... ( Recursos).
 */
@RestController
@RequestMapping(value="/index")
public class testResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "<body>"
				+"<p> Rest está funcionando<p>"
				+ "<img src=https://www.w3schools.com/images/w3schools_green.jpg></body>";
	}
	
	
}
