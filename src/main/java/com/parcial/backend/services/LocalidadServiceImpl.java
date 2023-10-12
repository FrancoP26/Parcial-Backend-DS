package com.parcial.backend.services;


import com.parcial.backend.entities.Localidad;
import com.parcial.backend.repositories.BaseRepository;
import com.parcial.backend.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Localidad> searchJPQLnombrado(String filtro) throws Exception {
        try {
            List<Localidad> localidades = localidadRepository.searchLocalidad(filtro);
            return localidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Localidad> searchJPQLnombrado(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Localidad> localidades = localidadRepository.searchLocalidad(filtro, pageable);
            return localidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

