package com.java.boot;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//uma entidade da jpa pois será salvo no banco
//uma Data class do lombok para facilitar, 
//AlgaArgsConstructor é um costrutor com todos os parâmetros
// NoArgsConstructor é um construtor sem parâmetros, pois a Jpa precisa


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
	
	 /* Criando as entidades id, string, integer
	 é necessário colocar a anotação @Id
	 necessário também gerar valor de maneira automatica 
	*/
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	long id;
	String marca;
	String modelo;
	Integer ano;

}
