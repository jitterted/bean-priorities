package ninja.ranner.beanpriorities.adapter.jpa;

import ninja.ranner.beanpriorities.application.FooEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooJpaRepository extends CrudRepository<FooEntity, Long> {
}
