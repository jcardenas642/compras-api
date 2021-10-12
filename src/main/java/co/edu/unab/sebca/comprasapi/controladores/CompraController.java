/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.controladores;

import co.edu.unab.sebca.comprasapi.modelos.Compra;
import co.edu.unab.sebca.comprasapi.servicios.CompraService;
import java.util.ArrayList;
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
@RequestMapping("/compra")
public class CompraController {
    
    @Autowired
    private CompraService compraService;
    
    @GetMapping(path = "/todos")
    public ArrayList<Compra> getTodos(){
        return compraService.getTodos();
    }
    
    @PostMapping()
    public Compra registrar(@RequestBody Compra miCompra){
        
       return compraService.crear(miCompra);
    }
    
    @GetMapping(path = "/cliente/{id}")
    public ArrayList<Compra> getPorCliente(@PathVariable("id") Long id){
        return compraService.getPorCliente(id);
    }
    
}
