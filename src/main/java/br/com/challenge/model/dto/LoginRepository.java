package br.com.challenge.model.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.challenge.model.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
