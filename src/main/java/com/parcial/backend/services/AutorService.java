package com.parcial.backend.services;

import com.parcial.backend.entities.Autor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AutorService extends BaseService<Autor,Long>{
    List<Autor> searchJPQLnombrado(String filtro) throws Exception;

    Page<Autor> searchJPQLnombrado(String filtro, Pageable pageable) throws Exception;
}
