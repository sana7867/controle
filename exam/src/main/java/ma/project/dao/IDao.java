package ma.project.dao;

import java.util.List;

import ma.project.Akherraz.entities.Article;

public interface IDao <T>{
    T create(T o);
    List<T> findAll();
    T update(T o);
    boolean delete(T o);
    T findById(int id);
	
}
