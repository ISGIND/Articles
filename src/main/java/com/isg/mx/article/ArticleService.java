package com.isg.mx.article;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository repository;

    public List<ArticleEntity> findAll(){
        return repository.findAll();
    }

    public Boolean existById(String id){
        return repository.existsById(id);
    }

    public Optional<ArticleEntity> findById(String id){
        return repository.findById(id);
    }

    public Optional<ArticleEntity> updateById(String id, ArticleEntity articleup) {
        ArticleEntity articleEntity = null;
        if (repository.existsById(id)) {
            if (repository.findById(id).isPresent()) {
                articleEntity = repository.findById(id).get();
                articleEntity.setDescripcion(articleup.getDescripcion());
                articleEntity.setModelo(articleup.getModelo());
            }
            assert articleEntity != null;
            repository.save(articleEntity);
        }
        return Optional.ofNullable(articleEntity);
    }
}
