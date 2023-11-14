
package com.proyectoconstruccion.proyectoconstruccion.repo;

import com.proyectoconstruccion.proyectoconstruccion.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jonathan
 */
@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer>{
    
}
