/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.controladores;

import co.edu.unab.sebca.comprasapi.modelos.Producto;
import co.edu.unab.sebca.comprasapi.servicios.ProductoService;
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
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping( path = "/{id}")
    public Optional<Producto> getPorId(@PathVariable("id") Long id){
        return productoService.getPorId(id);
    }
    
    @GetMapping(path = "/todos")
    public ArrayList<Producto> getTodos(){
        return productoService.getTodos();
    }
    
    @PostMapping()
    public Producto registrar(@RequestBody Producto miProducto){
        return productoService.crear(miProducto);
    }
    
}
