package com.backend.usuarios.backUsuarios.service;

import com.backend.usuarios.backUsuarios.entity.Rol;
import com.backend.usuarios.backUsuarios.exception.DuplicateRolException;

import java.util.List;

public interface IRolesService {

    List<Rol> listaRoles();

    Rol setRoles(Rol rol) throws DuplicateRolException;

    void eliminarRol(Long id) throws DuplicateRolException;

}
