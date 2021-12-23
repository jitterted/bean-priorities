package ninja.ranner.beanpriorities.adapter.jpa;

import ninja.ranner.beanpriorities.application.FooEntity;
import ninja.ranner.beanpriorities.application.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooJpaRepositoryAdapter implements FooRepository {
    private final FooJpaRepository jpaRepository;

    @Autowired
    public FooJpaRepositoryAdapter(FooJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void save(FooEntity foo) {
        jpaRepository.save(foo);
    }
}
