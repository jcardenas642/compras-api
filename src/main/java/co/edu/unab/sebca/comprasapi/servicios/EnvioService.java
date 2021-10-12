/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.servicios;

import co.edu.unab.sebca.comprasapi.modelos.Envio;
import co.edu.unab.sebca.comprasapi.repositorios.EnvioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sebca
 */
@Service
public class EnvioService {
    
    @Autowired
    private EnvioRepository envioRepository;
    
    public Optional<Envio> getPorId(Long id){
        return envioRepository.findById(id);
    }
    
    public ArrayList<Envio> getTodos(){
        return (ArrayList<Envio>) envioRepository.findAll();
    }
    
    public Envio crear(Envio miEnvio){
        return envioRepository.save(miEnvio);
    }
    
}
