package ninja.ranner.beanpriorities;

import ninja.ranner.beanpriorities.application.FooEntity;
import ninja.ranner.beanpriorities.application.FooRepository;

public class DummyFooRepository implements FooRepository {
    @Override
    public void save(FooEntity foo) {

    }
}
