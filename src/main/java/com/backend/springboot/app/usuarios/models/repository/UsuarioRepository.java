package com.backend.springboot.app.usuarios.models.repository;

import com.backend.springboot.app.commons.usuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

    // Metodo por defecto
    @RestResource(path = "buscar-username")
    public Usuario findByUsername(@Param("username")String username);

    // Metodo con el query
    @Query("select u from Usuario u where u.username=?1")
    @RestResource(path = "obtener-username")
    public Usuario obtenerPorUsername(@Param("nombre")String username);

    // Metodo para consultas nativas a la BD
    /* @Query(value="SELECT us_usuario FROM tma_usuario", nativeQuery = true)
    public Usuario obtenerPorUsername2(String username); */

}
