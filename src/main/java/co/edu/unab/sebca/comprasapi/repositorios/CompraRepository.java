/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.repositorios;

import co.edu.unab.sebca.comprasapi.modelos.Compra;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sebca
 */
@Repository
public interface CompraRepository extends CrudRepository<Compra, Long>{
    
    @Query(value =  "SELECT * FROM compras WHERE cliente_id=?1", nativeQuery = true)
    public ArrayList<Compra> getPorCliente(Long id);
}
