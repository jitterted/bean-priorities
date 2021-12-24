package ninja.ranner.beanpriorities;

import ninja.ranner.beanpriorities.application.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private final FooRepository fooRepository;

    @Autowired
    public FooController(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @GetMapping("/")
    public String home() {
        return fooRepository.toString();
    }

}
