package com.api.produto.services;


import com.api.produto.dtos.LojaDto;
import com.api.produto.models.LojaModel;
import com.api.produto.repository.LojaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LojaService {
    private LojaRepository lojaRepository;
    public LojaService(LojaRepository lojaRepository) {
        this.lojaRepository = lojaRepository;
    }

    public LojaModel create(LojaDto dto) {

        LojaModel loja = new LojaModel();
        loja.setNome(dto.getNome());
        loja.setDescricao(dto.getDescricao());


        return lojaRepository.save(loja);
    }

}