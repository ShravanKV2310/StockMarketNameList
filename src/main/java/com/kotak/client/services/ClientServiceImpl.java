package com.kotak.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotak.client.entities.Client;
import com.kotak.client.repositories.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepo;
	
	@Override
	public void saveClientDetails(Client client) {
		clientRepo.save(client);
	}

	@Override
	public List<Client> getAllClients() {
		List<Client> findAll = clientRepo.findAll();
		return findAll;
	}

	@Override
	public Client updateClientDetails(Long id) {
		Optional<Client> findById = clientRepo.findById(id);
		Client client = findById.get();
		return client;
	}

	@Override
	public void deleteClient(Long id) {
		clientRepo.deleteById(id);
		
	}

	@Override
	public List<Client> getByKeyword(String keyword) {
		return clientRepo.findByKeyword(keyword);
	}

	@Override
	public Client updateClientSearch(Long id) {
		Optional<Client> findById = clientRepo.findById(id);
		Client client = findById.get();
		return client;
	}

	@Override
	public Client findById(Long id) {
		Optional<Client> findById = clientRepo.findById(id);
		Client clientId = findById.get();
		return clientId;
	}

	@Override
	public void deleteClientSearch(Long id) {
		clientRepo.deleteById(id);
	}

}
