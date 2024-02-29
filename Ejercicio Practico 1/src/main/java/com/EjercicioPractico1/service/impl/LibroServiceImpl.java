package com.EjercicioPractico1.service.impl;
import com.EjercicioPractico1.dao.LibroDao;
import com.EjercicioPractico1.domain.Libro;
import com.EjercicioPractico1.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroDao libroDao;
    @Override
    @Transactional(readOnly=true)
    public List<Libro> getLibros() {
        var lista=libroDao.findAll();
        //if (activos) {
            //lista.removeIf(e -> !e.isActivo());
        //}        
        return lista;
    }
}