package jpa.repository;

import jpa.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by E6430 on 06/08/17.
 */
@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {
}
