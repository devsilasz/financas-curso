package com.silas.minhasfinancas.service.impl;

import com.silas.minhasfinancas.model.entity.Usuario;
import com.silas.minhasfinancas.model.repository.UsuarioRepository;
import com.silas.minhasfinancas.service.UsuarioService;
import com.silas.minhasfinancas.service.exception.RegraNegocioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        super();
        this.repository = repository;
    }



    @Override
    public Usuario autenticar(String email, String senha) {


        return null;
    }

    @Override
    @Transactional
    public Usuario salvarUsuario(Usuario usuario) {
        validarEmail(usuario.getEmail());
        return repository.save(usuario);
    }

    @Override
    public void validarEmail(String email) {
        boolean existe = repository.existsByEmail(email);
        if (existe) {
            throw new RegraNegocioException("Já existe um usuário cadastrado com este email.");
        }
    }
}
