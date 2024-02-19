package com.gk.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.entities.Banque;
import com.gk.repositories.BanqueRepository;
import java.util.*;

@Service
public class BanqueService {

	@Autowired
	BanqueRepository banqueRepository;

	public List<Banque> listBanques() {
		return (List<Banque>) banqueRepository.findAll();
	}
	
	public Banque saveBanque(Banque banque) {  // cette méthode sert aussi bien pour l'ajout ou la modification
		return banqueRepository.save(banque);
	}
	
	public void deleteBanque(int idBanque) {
		banqueRepository.deleteById(idBanque);
	}

}
