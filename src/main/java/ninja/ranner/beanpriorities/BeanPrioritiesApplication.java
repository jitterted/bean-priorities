package ninja.ranner.beanpriorities;

import ninja.ranner.beanpriorities.application.FooRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanPrioritiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanPrioritiesApplication.class, args);
    }

    @Bean
    @ConditionalOnProperty("demo.repository.dummy")
    FooRepository dummyRepository() {
        return new DummyFooRepository();
    }
}
