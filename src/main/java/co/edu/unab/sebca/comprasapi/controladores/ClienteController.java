/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.controladores;

import co.edu.unab.sebca.comprasapi.modelos.Cliente;
import co.edu.unab.sebca.comprasapi.servicios.ClienteService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sebca
 */
@RestController
@CrossOrigin
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping( path = "/{id}")
    public Optional<Cliente> getPorId(@PathVariable("id") Long id){
        return clienteService.getPorId(id);
    }
    
    @PostMapping(path = "/validar")
    public Cliente validar(@RequestBody Cliente miCliente){
        return clienteService.validar(miCliente.getUsuario(), miCliente.getPassword());
    }
    
    @PostMapping()
    public Cliente registrar(@RequestBody Cliente miCliente){
        return clienteService.registrar(miCliente);
    }
    
}
