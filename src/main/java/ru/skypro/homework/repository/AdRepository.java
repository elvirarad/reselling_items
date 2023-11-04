package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.entity.Ad;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
@Repository
public interface AdRepository extends JpaRepository<Ad, Integer>{
    List<Ad> findAllByUserName(String username);
    List<Ad> findAllByAuthorId(Integer id);
}
