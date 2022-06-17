package com.kotak.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kotak.client.entities.Client;
import com.kotak.client.services.ClientService;



@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;

	@RequestMapping("/addClient")
	public String addClient() {
		return "addClient";
	}

	@RequestMapping("/saveClientDetails")
	public String saveClientDetails(@ModelAttribute("client") Client client, ModelMap modelMap) {
		clientService.saveClientDetails(client);
		modelMap.addAttribute("msg", "The details are is Saved");
		return "addClient";
	}

	@RequestMapping("/getAllClients")
	public String getAllClients(ModelMap modelMap) {
		List<Client> clients = clientService.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "getAllClients";
	}

	@RequestMapping("/deleteClient")
	public String deleteClient(@RequestParam("id") Long id, ModelMap modelMap) {
		clientService.deleteClient(id);
		List<Client> clients = clientService.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "getAllClients";
	}

	@RequestMapping("/updateClient")
	public String updateClient(@RequestParam("id") Long id, ModelMap modelMap) {
		Client client = clientService.updateClientDetails(id);
		modelMap.addAttribute("client", client);
		return "updateClient";
	}

	@RequestMapping("/updateClientDetails")
	public String updateClientDetails(@ModelAttribute("client") Client client, ModelMap modelMap) {
		clientService.saveClientDetails(client);
		modelMap.addAttribute("msg", "Client is updated");
		return "updateClient";
	}

	@RequestMapping(path = { "/", "/search" })
	public String home(Client client, ModelMap modelMap, String keyword, Long id) {
		 if (keyword != null) {
			List<Client> list = clientService.getByKeyword(keyword);
			modelMap.addAttribute("list", list);
		} else {
			List<Client> clients = clientService.getAllClients();
			modelMap.addAttribute("clients", clients);
		}
		return "getAllClients";
	}

	@RequestMapping("/updateClientSearch")
	public String updateClientSearch(@RequestParam("id") Long id, ModelMap modelMap) {
		Client client = clientService.updateClientSearch(id);
		modelMap.addAttribute("client", client);
		return "updateClient";
	}
	@RequestMapping("/deleteClientSearch")
	public String deleteClientSearch(@RequestParam("id") Long id,String keyword, ModelMap modelMap) {
		clientService.deleteClientSearch(id);
		if (keyword == null) {
			List<Client> list = clientService.getByKeyword(keyword);
			modelMap.addAttribute("list", list);
		}else {
			List<Client> clients = clientService.getAllClients();
			modelMap.addAttribute("clients", clients);
		}
		return "getAllClients";
	}
	public String findById(Long id,ModelMap modelMap) {
		if (id != null) {
			Client list = clientService.findById(id);
			modelMap.addAttribute("list", list);
			
		}
		return "getAllClients";
	}
}
