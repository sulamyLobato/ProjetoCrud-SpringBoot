package com.javaparainiciantes.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


//RestController ele é um controller do spring MVC que já
//vem com a anotação ResponseBory.

//Vamos fazer uma Crud e para isso usamos 
//listar todos os carros , listar os carros por Id,  salvar o carro, deletar o carro

@RestController
@AllArgsConstructor

public class CarroController {
    // quando fazer fazer o GetMapping("/carro") vou retornar uma lista de carros
	// quem tem todos os carros é o repositório dos carros então vou injetar o CarroRepository repository;
	// vou injetar colocando a anotaçao @Autowired
	//findAll() pega todos os carros
	
	
	@Autowired
	CarroRepository repository;
	
	@GetMapping("/carro")
	public List<Carro> geAllCarros(){
		return repository.findAll();
	}
	// @PathVariable variável do Path
	
	@GetMapping("/carro{id}")
	public Carro getCarroById(@PathVariable Long id) {
		return repository.getOne(id);
	}
	// para adcionar eu vou usar a anotação @PostMapping("/carro)
	// carro com parâmetro vem de lá do http @RequestBory no formato Json.
	//return repository.save(carro) - peço para o repositorio salvar o carro
	@PostMapping("/carro")
	public Carro saveCarro(@RequestBory Carro carro) {
		return repository.save(carro);
		
	}
	
	@DeleteMapping("/carro/{id}")
	public void deleteCarro(@PathVariable Long id) {
		repository.deleteById(id);
  }