package com.kotak.client.services;

import java.util.List;

import com.kotak.client.entities.Client;


public interface ClientService {
	public void saveClientDetails(Client client);
	public void deleteClient(Long id);
	public List<Client> getAllClients();
	public Client findById(Long id);
	public List<Client> getByKeyword(String keyword);
	public Client updateClientDetails(Long id);
	public Client updateClientSearch(Long id);
	public void deleteClientSearch(Long id);
}
