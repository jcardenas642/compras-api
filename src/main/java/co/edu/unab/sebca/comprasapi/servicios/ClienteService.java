/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.servicios;

import co.edu.unab.sebca.comprasapi.modelos.Cliente;
import co.edu.unab.sebca.comprasapi.repositorios.ClienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sebca
 */
@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    public Optional<Cliente> getPorId(Long id){
        
        return clienteRepository.findById(id);
        
    }
    
    public Cliente registrar(Cliente miCliente){
        
        return clienteRepository.save(miCliente);
    }
    
    public Cliente validar(String usuario, String password){
        return clienteRepository.validar(usuario, password);
    } 
    
}
