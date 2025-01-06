package com.backend.usuarios.backUsuarios.service;

import com.backend.usuarios.backUsuarios.dto.input.UsuarioDtoInput;
import com.backend.usuarios.backUsuarios.dto.output.UsuarioDtoOut;
import com.backend.usuarios.backUsuarios.exception.DuplicateDniException;
import com.backend.usuarios.backUsuarios.exception.ResourceNotFoundException;

import java.util.List;

public interface IUsuarioService {

    List<UsuarioDtoOut> listaUsuarios();

    UsuarioDtoOut registarUsuarios(UsuarioDtoInput usuario) throws DuplicateDniException;

    UsuarioDtoOut buscarUsuario(Long id) throws ResourceNotFoundException;

    UsuarioDtoOut actualizarUsuario(Long id, UsuarioDtoInput usuario) throws ResourceNotFoundException;

    void eliminarUsuario(Long id) throws ResourceNotFoundException;
    void eliminarUsuarios() throws ResourceNotFoundException;
    void resetearIds() throws ResourceNotFoundException;

}
