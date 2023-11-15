package ma.project.Akherraz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.project.Akherraz.entities.Categorie;
@Repository
public interface CatregorieRepository extends JpaRepository<Categorie, Integer>{

}
