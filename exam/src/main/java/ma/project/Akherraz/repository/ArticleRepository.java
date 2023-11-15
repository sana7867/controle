package ma.project.Akherraz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.project.Akherraz.entities.Article;
import ma.project.Akherraz.entities.Categorie;



public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
	List<Article> findByCategorie(Categorie categorie);

}
