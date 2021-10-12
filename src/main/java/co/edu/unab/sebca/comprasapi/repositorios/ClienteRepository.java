/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.comprasapi.repositorios;

import co.edu.unab.sebca.comprasapi.modelos.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sebca
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
    @Query(value =  "SELECT * FROM clientes WHERE usuario=?1 AND password=?2", nativeQuery = true)
    public Cliente validar(String usuario, String password);
    
}
