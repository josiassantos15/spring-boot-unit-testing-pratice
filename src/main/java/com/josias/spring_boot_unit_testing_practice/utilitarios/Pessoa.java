package com.josias.spring_boot_unit_testing_practice.utilitarios;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getSobrenome() {
//        return sobrenome;
//    }
//
//    public void setSobrenome(String sobrenome) {
//        this.sobrenome = sobrenome;
//    }
//
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
