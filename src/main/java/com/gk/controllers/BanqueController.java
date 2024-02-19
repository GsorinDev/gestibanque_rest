package com.gk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.entities.Banque;
import com.gk.services.BanqueService;

import java.util.*;

@RequestMapping("/banques")
@RestController
@CrossOrigin("*")
public class BanqueController {

	@Autowired
	BanqueService banqueService;

	@GetMapping("/")
	public List<Banque> getAllBanques() {
		return banqueService.listBanques();
	}

	@PostMapping("/")
	public Banque addBanque(@RequestBody Banque banque) {
		return banqueService.saveBanque(banque);
	}

	@PutMapping("/")
	public Banque updateBanque(@RequestBody Banque banque) {
		return banqueService.saveBanque(banque);
	}

	@DeleteMapping("/{id}")
	public void deleteBanque(@PathVariable int id) {
		banqueService.deleteBanque(id);
	}
	
	@GetMapping("/{id}")
	public Banque getBanque(@PathVariable int id) {
		return banqueService.getBanque(id);
	}
}
