package ninja.ranner.beanpriorities.adapter.jpa;

import ninja.ranner.beanpriorities.application.FooEntity;
import ninja.ranner.beanpriorities.application.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class FooJpaRepositoryAdapter implements FooRepository {
    private final FooJpaRepository jpaRepository;

    @Autowired
    public FooJpaRepositoryAdapter(FooJpaRepository jpaRepository) {
        System.err.println("Real Foo repository created with " + jpaRepository);
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void save(FooEntity foo) {
        jpaRepository.save(foo);
    }
}
