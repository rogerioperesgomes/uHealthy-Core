package br.com.uhealthy.core.repositories.security;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uhealthy.core.models.security.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{

}
