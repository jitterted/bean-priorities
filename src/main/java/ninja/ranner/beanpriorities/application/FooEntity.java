package ninja.ranner.beanpriorities.application;

import javax.persistence.Entity;

// SMELL - this entity belongs in the adapter.jpa package and there should be a domain entity that's mapped,
//         but that's not really necessary for this example, so ...
@Entity
public class FooEntity {
    @javax.persistence.Id
    Long Id;
}
