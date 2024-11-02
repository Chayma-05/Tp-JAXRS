package com.tp.JAXRS.repositories;

import com.tp.JAXRS.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
