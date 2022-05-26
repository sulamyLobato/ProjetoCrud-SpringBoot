package com.java.boot;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class CarroController {
 
	CarroRepository repository;
	
	@GetMapping("/carro")
	public List<Carro> geAllCarros(){
		return repository.findAll();
	}
	
	@GetMapping("/carro/{id}")
	public Carro getCarroById(@PathVariable Long id) {
		return repository.getOne(id);
	}

	@PostMapping("/carro")
	public Carro saveCarro(@RequestBody Carro carro) {
		return repository.save(carro);
		
	}
	
	@DeleteMapping("/carro/{id}")
	public void deleteCarro(@PathVariable Long id) {
		repository.deleteById(id);
  }
	@PutMapping("/carro/{id}")
	public Carro updateCarro(@PathVariable Long id, @RequestBody Carro carro) {
		return repository.save(carro);	}
	
}