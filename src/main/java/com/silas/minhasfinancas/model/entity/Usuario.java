package com.silas.minhasfinancas.model.entity;


import lombok.*;
import javax.persistence.*;

@Entity
@Table( name = "usuario", schema = "financas")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Por ser campo bigserial e estar no PostgreSQL, a melhor opção foi colocar como IDENTITY
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

}


