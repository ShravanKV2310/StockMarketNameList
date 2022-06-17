package com.kotak.client.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kotak.client.entities.Client;



public interface ClientRepository extends JpaRepository<Client, Long> {
	@Query(value = "select c from Client c where c.name like %:keyword% or c.company like %:keyword% or c.code like %:keyword%")
	public List<Client> findByKeyword(String keyword);
	
}
