package com.amandamer.cursosts.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amandamer.cursosts.domain.Pedido;
import com.amandamer.cursosts.repositories.PedidoRepository;
import com.amandamer.cursosts.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) { 
		Optional<Pedido> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName())); 
		} 

	
}