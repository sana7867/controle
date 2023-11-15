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
@RestController
@RequestMapping("/app/vi/Aricle")
public class ArticleContoller {
	@Autowired
	private ArticleService bs;
	
	@PostMapping("/save")
	public Article createArticle(@RequestBody Article Article) {
		Article.setId(0);
		return bs.create(Article);
	}
	@GetMapping("/all")
	public List<Article> findAllArticle(){
		return bs.findAll();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Object> findByNoArticle(@PathVariable int id){
		Article Article= bs.findById(id);
		if(Article==null) {
			return new ResponseEntity<Object> ("Article avec noArticle " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
		}else {
			return ResponseEntity.ok(Article);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteArticle(@PathVariable int id){
		Article Article= bs.findById(id);
		if(Article==null) {
			return new ResponseEntity<Object> ("Article avec noArticle " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
		}else {
			bs.delete(Article);
			return ResponseEntity.ok("Article supprimé ");
		}
		
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateArticle(@PathVariable int id,@RequestBody Article newArticle){
		Article Article= bs.findById(id);
		if(Article==null) {
			return new ResponseEntity<Object> ("Article avec noArticle " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
		}else {
			newArticle.setId(0);
			return ResponseEntity.ok(bs.update(newArticle));
		}
		
	}
	@GetMapping("/categorie")
    public List<Article> findArticleByCategorie(@RequestBody Categorie categorie) {
        return bs.findByCategorie(categorie)
        		;
    }
    
	

}
