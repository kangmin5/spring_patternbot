package kr.co.patternbot.auth.services;

import kr.co.patternbot.auth.domains.User;
import kr.co.patternbot.auth.repositories.UserRepository;
import kr.co.patternbot.common.dataStructure.Box;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    @Override
    public String login(User user) {
       // return repository.login(user);
        return "";
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
    @Override
    public List<User> findAll(Sort sort) {
        return repository.findAll(sort);
    }
    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
    @Override
    public long count() {
        return repository.count();
    }
    @Override
    public String update(User user) {
    //    repository.update((user));
        return "";
    }
    @Override
    public String delete(User user) {
        repository.delete(user);
        return "";
    }
    @Override
    public String save(User user) {
        repository.save(user);
        return "";
    }
    @Override
    public Optional<User> findById(String userid) {
        return repository.findById(0L); // userid 타입이 다름
    }

    @Override
    public boolean existsById(String userid) {
        return repository.existsById(0L); // userid 타입이 다름
    }

    @Override
    public List<User> listFindByUserName(String name) {
        List<User> ls = repository.findAll();
        Box<String, User> box = new Box<>();
        box.listFindByUserName(name);
        //ls.stream().filter(...)
        return null;
    }

}
