package ninja.ranner.beanpriorities.application;

import ninja.ranner.beanpriorities.application.FooEntity;
import ninja.ranner.beanpriorities.application.FooRepository;

public class DummyFooRepository implements FooRepository {
    public DummyFooRepository() {
        System.err.println("Dummy Foo created");
    }

    @Override
    public void save(FooEntity foo) {

    }
}
