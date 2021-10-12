/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.controladores;

import co.edu.unab.sebca.comprasapi.modelos.Envio;
import co.edu.unab.sebca.comprasapi.servicios.EnvioService;
import java.util.ArrayList;
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
@RequestMapping("/envio")
public class EnvioController {
    
    @Autowired
    private EnvioService envioService;
    
    @GetMapping( path = "/{id}")
    public Optional<Envio> getPorId(@PathVariable("id") Long id){
        return envioService.getPorId(id);
    }
    
    @GetMapping(path = "/todos")
    public ArrayList<Envio> getTodos(){
        return envioService.getTodos();
    }
    
    @PostMapping()
    public Envio registrar(@RequestBody Envio miEnvio){
        return envioService.crear(miEnvio);
    }
    
}
