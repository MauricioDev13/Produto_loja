package com.api.produto.services;


import com.api.produto.dtos.LojaDto;
import com.api.produto.models.LojaModel;
import com.api.produto.repository.LojaRepository;
import com.api.produto.services.LojaService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/loja")
public class LojaController{
    private final LojaRepository lojaRepository;
    private final LojaService lojaService;

    public LojaController(LojaService lojaService, LojaRepository lojaRepository){

        this.lojaService = lojaService;
        this.lojaRepository = lojaRepository;
    }

    @PostMapping("/salvar")
    public ResponseEntity<?> salvar(
            @RequestBody @Valid LojaDto dto){
                LojaModel lojaSalvar = lojaService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(lojaSalvar);

    }







}

