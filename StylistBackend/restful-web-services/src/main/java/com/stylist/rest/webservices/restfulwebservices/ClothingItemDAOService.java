package com.stylist.rest.webservices.restfulwebservices;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ClothingItemDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public int insert(ClothingItem item){
        entityManager.persist(item);
        return item.getId();
    }
}
