/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.servicios;


import co.edu.unab.sebca.comprasapi.modelos.Producto;
import co.edu.unab.sebca.comprasapi.repositorios.ProductoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sebca
 */
@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    public Optional<Producto> getPorId(Long id){
        return productoRepository.findById(id);
    }
    
    public ArrayList<Producto> getTodos(){
        return (ArrayList<Producto>) productoRepository.findAll();
    }
    
    public Producto crear(Producto miProducto){
        return productoRepository.save(miProducto);
    }
    
}
