package com.isg.mx.article;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping(path = "/api/v1/catalogs/articles")
@RestController
@Slf4j
public class ArticleController {


    private ArticleService articleService;


    @GetMapping
    public ResponseEntity<?> getAllArticles() {
        return ResponseEntity.ok(articleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getArticleById(@PathVariable String id) {
        try {
            if(articleService.existById(id)){
                ArticleEntity articleEntity = articleService.findById(id).get();
                return ResponseEntity.ok(articleEntity);
            }else{
                return ResponseEntity.notFound().build();
            }
        }catch (Exception e){
            log.warn(e.toString());
            return ResponseEntity.internalServerError().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateArticleById(@PathVariable String id,@Valid @RequestBody ArticleEntity articleEntity) {
        try {
            return ResponseEntity.ok(articleService.updateById(id, articleEntity));
        }catch (Exception e){
            log.warn(e.toString());
            return ResponseEntity.internalServerError().build();
        }
    }

}
