package ninja.ranner.beanpriorities;

import ninja.ranner.beanpriorities.adapter.jpa.FooJpaRepositoryAdapter;
import ninja.ranner.beanpriorities.application.FooRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationWithJpaRepositoryTest {

	@Autowired
	private FooRepository repository;

	@Test
	void loadsJpaAdapterRepository() {
		assertThat(repository)
				.isInstanceOf(FooJpaRepositoryAdapter.class);
	}

}
