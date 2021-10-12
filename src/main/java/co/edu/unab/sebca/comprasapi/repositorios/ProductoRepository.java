/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.repositorios;

import co.edu.unab.sebca.comprasapi.modelos.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sebca
 */
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
    
}
