package com.api.produtos.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class LojaDto {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;
    private String descricao;
}