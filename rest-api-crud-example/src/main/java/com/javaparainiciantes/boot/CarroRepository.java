package com.javaparainiciantes.boot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}

// O repositorio é uma interface e extendeu 

// o Id é do tipo Long