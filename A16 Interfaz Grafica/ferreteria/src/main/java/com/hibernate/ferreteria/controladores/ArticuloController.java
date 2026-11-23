package com.hibernate.ferreteria.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.ferreteria.Services.ServiceArticle;
import com.hibernate.ferreteria.dto.ArticulosDTO;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    @Autowired
    private ServiceArticle servicio;

    @GetMapping
    public List<ArticulosDTO> listar() {
        return servicio.servConsulta();
    }

    @GetMapping("/{id}")
    public ArticulosDTO buscaId(@PathVariable Long id) {
        return servicio.servBuscaId(id);
    }

    @PostMapping
    public ArticulosDTO insertaArticulo(@RequestBody ArticulosDTO dto) {
        return servicio.servInserta(dto);
    }

    @PutMapping("/{id}")
    public ArticulosDTO actualizaArticulo(@PathVariable Long id, @RequestBody ArticulosDTO dto) {
        return servicio.servActualiza(id, dto);
    }

    @DeleteMapping("/{id}")
    public String borraArticulos(@PathVariable Long id) {
        return servicio.eliminaArticulos(id);
    }
}