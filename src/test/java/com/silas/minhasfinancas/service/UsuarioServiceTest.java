package com.silas.minhasfinancas.service;

import com.silas.minhasfinancas.model.entity.Usuario;
import com.silas.minhasfinancas.model.repository.UsuarioRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")


public class UsuarioServiceTest {

    @Autowired
    UsuarioService service;

    @Autowired
    UsuarioRepository repository;

    @Test(expected = Test.None.class)
    public void deveValidarEmail() {
        // cenario
        repository.deleteAll();

        //acao
        service.validarEmail("email@email.com");


    }

    @Test
    public void deveLancarErroAoValidarEmailQuandoExistirEmailCadastrado() {
        //cenario
        Usuario usuario = Usuario.builder().nome("usuario").email("email@email.com").build();
        repository.save(usuario);
        //acao
        service.validarEmail("email@email.com");

    }


}
