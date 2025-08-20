package com.api.produto.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_loja")
public class LojaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String descricao;

}