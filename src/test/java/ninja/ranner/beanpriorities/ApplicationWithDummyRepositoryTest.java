package ninja.ranner.beanpriorities;

import ninja.ranner.beanpriorities.application.DummyFooRepository;
import ninja.ranner.beanpriorities.application.FooRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("dummy")
public class ApplicationWithDummyRepositoryTest {

    @Autowired
    private FooRepository repository;

    @Test
    public void loadsDummyRepository() {
        assertThat(repository)
                .isInstanceOf(DummyFooRepository.class);
    }

}
