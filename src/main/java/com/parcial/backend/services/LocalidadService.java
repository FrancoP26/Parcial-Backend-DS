package com.parcial.backend.services;

import com.parcial.backend.entities.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long>{
    List<Localidad> searchJPQLnombrado(String filtro) throws Exception;
    Page<Localidad> searchJPQLnombrado(String filtro, Pageable pageable) throws Exception;
}
