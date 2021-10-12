/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.servicios;

import co.edu.unab.sebca.comprasapi.modelos.Compra;
import co.edu.unab.sebca.comprasapi.repositorios.CompraRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sebca
 */
@Service
public class CompraService {
    
    @Autowired
    private CompraRepository compraRepository;
    
    public Optional<Compra> getPorId(Long id){
        return compraRepository.findById(id);
    }
    
    public ArrayList<Compra> getTodos(){
        return (ArrayList<Compra>) compraRepository.findAll();
    }
    
    public Compra crear(Compra miCompra){
        return compraRepository.save(miCompra);
    }
    
    public ArrayList<Compra> getPorCliente(Long id){
        return compraRepository.getPorCliente(id);
    }
    
}
