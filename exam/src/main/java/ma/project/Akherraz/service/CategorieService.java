package ma.project.Akherraz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.project.Akherraz.entities.Categorie;
import ma.project.Akherraz.repository.CatregorieRepository;
import ma.project.dao.IDao;
@Service
public class CategorieService implements IDao<Categorie> {

	@Autowired
	private CatregorieRepository ar;
	@Override
	public Categorie create(Categorie o) {
		return ar.save(o) ;
	}

	@Override
	public List<Categorie> findAll() {
		return ar.findAll();
	}

	@Override
	public Categorie update(Categorie o) {
		return ar.save(o);
	}

	@Override
	public boolean delete(Categorie o) {
		try {
			ar.delete(o);
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Categorie findById(int id) {
		
		return ar.findById(id).orElse(null) ;
	}

	
	

}
