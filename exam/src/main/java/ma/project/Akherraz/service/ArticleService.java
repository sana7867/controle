package ma.project.Akherraz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.project.dao.IDao;

import ma.project.Akherraz.entities.*;
import ma.project.Akherraz.repository.*;

@Service
public class ArticleService implements IDao<Article> {

	@Autowired
	private ArticleRepository ar;
	@Override
	public Article create(Article o) {
		return ar.save(o) ;
	}

	@Override
	public List<Article> findAll() {
		return ar.findAll();
	}

	@Override
	public Article update(Article o) {
		return ar.save(o);
	}

	@Override
	public boolean delete(Article o) {
		try {
			ar.delete(o);
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Article findById(int id) {
		
		return ar.findById(id).orElse(null) ;
	}

	public List<Article> findByCategorie(Categorie categorie) {
        return ar.findByCategorie(categorie);
    }
	
	

}
