package ninja.ranner.beanpriorities.adapter.jpa;

import ninja.ranner.beanpriorities.application.FooEntity;
import ninja.ranner.beanpriorities.application.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "demo.repository.dummy", havingValue = "false", matchIfMissing = true)
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
