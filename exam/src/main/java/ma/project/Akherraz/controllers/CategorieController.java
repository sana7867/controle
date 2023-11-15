package ma.project.Akherraz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.project.Akherraz.entities.Article;
import ma.project.Akherraz.entities.Categorie;
import ma.project.Akherraz.service.ArticleService;
import ma.project.Akherraz.service.CategorieService;
@RestController
@RequestMapping("/app/vi/Categorie")
public class CategorieController {
@Autowired
private CategorieService bs;
@Autowired
private ArticleService articleService;

@PostMapping("/save")
public Categorie createCategorie(@RequestBody Categorie Categorie) {
	Categorie.setId(0);
	return bs.create(Categorie);
}
@GetMapping("/{id}/articles")
public ResponseEntity<Object> findArticlesByCategorie(@PathVariable int id) {
	CategorieService categorieService;
    Categorie categorie = bs.findById(id);

    if (categorie == null) {
        return new ResponseEntity<>("Categorie avec noCategorie " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
    } else {
        List<Article> articles = articleService.findByCategorie(categorie);
        return ResponseEntity.ok(articles);
    }
}

@GetMapping("/all")
public List<Categorie> findAllCategorie(){
	return bs.findAll();
}
@GetMapping("/{id}")
public ResponseEntity<Object> findByNoCategorie(@PathVariable int id){
	Categorie Categorie= bs.findById(id);
	if(Categorie==null) {
		return new ResponseEntity<Object> ("Categorie avec noCategorie " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
	}else {
		return ResponseEntity.ok(Categorie);
	}
	
}
@DeleteMapping("/{id}")
public ResponseEntity<Object> deleteCategorie(@PathVariable int id){
	Categorie Categorie= bs.findById(id);
	if(Categorie==null) {
		return new ResponseEntity<Object> ("Categorie avec noCategorie " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
	}else {
		bs.delete(Categorie);
		return ResponseEntity.ok("Categorie supprimé ");
	}
	
}

@PutMapping("/{id}")
public ResponseEntity<Object> updateCategorie(@PathVariable int id,@RequestBody Categorie newCategorie){
	Categorie Categorie= bs.findById(id);
	if(Categorie==null) {
		return new ResponseEntity<Object> ("Categorie avec noCategorie " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
	}else {
		newCategorie.setId(0);
		return ResponseEntity.ok(bs.update(newCategorie));
	}
	
}


}
