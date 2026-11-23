package com.hibernate.ferreteria.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.ferreteria.Mapper.ArticleMapper;
import com.hibernate.ferreteria.Repositories.RepoArticles;
import com.hibernate.ferreteria.dto.ArticulosDTO;
import com.hibernate.ferreteria.entity.Articulos;

@Service
public class ServiceArticle {

    @Autowired
    private RepoArticles repo;

    // Video 40: Consultar todos
    public List<ArticulosDTO> servConsulta() {
        return repo.findAll()
                .stream()
                .map(ArticleMapper::toDTO)
                .collect(Collectors.toList());
    }

    // Video 44: Buscar por ID
    public ArticulosDTO servBuscaId(Long id) {
        Articulos artPorId = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Artículo no encontrado con ID: " + id));
        return ArticleMapper.toDTO(artPorId);
    }

    // Video 41: Insertar
    public ArticulosDTO servInserta(ArticulosDTO dto) {
        Articulos articulo = ArticleMapper.toEntity(dto);
        Articulos insertado = repo.save(articulo);
        return ArticleMapper.toDTO(insertado);
    }

    // Video 42: Actualizar
    public ArticulosDTO servActualiza(Long id, ArticulosDTO dto) {
        Optional<Articulos> existe = repo.findById(id);
        if (existe.isPresent()) {
            Articulos articulo = existe.get();
            articulo.setNombreArticulo(dto.getNombreArticulo());
            articulo.setPrecio(dto.getPrecio());
            articulo.setExistencia(dto.getExistencia());
            Articulos actualizado = repo.save(articulo);
            return ArticleMapper.toDTO(actualizado);
        } else {
            throw new RuntimeException("Artículo no encontrado con ID: " + id);
        }
    }

    // Video 43: Eliminar
    public String eliminaArticulos(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Artículo eliminado correctamente";
        } else {
            return "Artículo: " + id + " no encontrado";
        }
    }
}