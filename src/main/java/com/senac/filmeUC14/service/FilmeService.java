package com.senac.filmeUC14.service;

import com.senac.filmeUC14.model.Filme;
import com.senac.filmeUC14.repository.FilmeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {
    @Autowired
    FilmeRepository filmeRepository;
    
    public Filme criar(Filme filme) {
        filme.setId(null);
        filmeRepository.save(filme);
        return filme;
    }
    
    public List<Filme> listarTodos() {
        return filmeRepository.findAll();
    }
    
    public Filme buscarPorId(Integer id) {
        return filmeRepository.findById(id).orElseThrow();
    }
}
