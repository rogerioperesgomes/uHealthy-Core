package br.com.uhealthy.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uhealthy.core.models.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
