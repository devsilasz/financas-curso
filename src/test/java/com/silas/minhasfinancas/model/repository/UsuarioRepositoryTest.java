package com.silas.minhasfinancas.model.repository;


import com.silas.minhasfinancas.model.entity.Usuario;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class UsuarioRepositoryTest {

    @Autowired
    UsuarioRepository repository;

    @Test
    public void deveVerificarAExistenciaDeUmEmail() {
        //cenário
        Usuario usuario = Usuario.builder().nome("usuario").email("usuario@email.com").build();
        repository.save(usuario);

        //ação /execução
        boolean result = repository.existsByEmail("usuario@email.com");


        //verificação
        Assertions.assertThat(result).isTrue();

    }

    @Test
    public void deveRetornarFalsoQuandoNaoHouverUsuarioCadastradoComOEmail() {

        //cenário
        repository.deleteAll();

        //acao
        boolean result = repository.existsByEmail("usuario@email.com");

        //verificacao
        Assertions.assertThat(result).isFalse();

    }

}
