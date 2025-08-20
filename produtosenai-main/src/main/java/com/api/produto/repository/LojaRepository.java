package com.api.produto.repository;
import com.api.produto.models.LojaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface LojaRepository extends {

    JpaRepository<ProdutoModel, UUID>{

    }


}