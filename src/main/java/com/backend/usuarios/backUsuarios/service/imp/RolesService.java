package com.backend.usuarios.backUsuarios.service.imp;

import com.backend.usuarios.backUsuarios.entity.Rol;
import com.backend.usuarios.backUsuarios.exception.DuplicateRolException;
import com.backend.usuarios.backUsuarios.repository.RolRepository;
import com.backend.usuarios.backUsuarios.service.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesService implements IRolesService {
    @Autowired
    RolRepository rolRepository;

    @Override
    public List<Rol> listaRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol setRoles(Rol rol) throws DuplicateRolException {
        Optional<Rol> rolOptional = rolRepository.findByNombre(rol.getNombre());

        if (rolOptional.isPresent()){
            new DuplicateRolException("El rol " + rol.getNombre() + " ya existe");

        }

        return rolRepository.save(rol);
    }

    @Override
    public void eliminarRol(Long id) throws DuplicateRolException {
        rolRepository.findById(id)
                .orElseThrow(() -> new DuplicateRolException("Verificar id: " + id + ", de identificacion"));

        rolRepository.deleteById(id);


    }
}
