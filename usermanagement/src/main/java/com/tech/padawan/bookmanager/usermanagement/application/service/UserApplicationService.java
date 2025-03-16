package com.tech.padawan.bookmanager.usermanagement.application.service;

import com.tech.padawan.bookmanager.usermanagement.application.dto.UserRegister;
import com.tech.padawan.bookmanager.usermanagement.application.dto.UserResponse;
import com.tech.padawan.bookmanager.usermanagement.application.usecases.FindAllUsersCase;
import com.tech.padawan.bookmanager.usermanagement.application.usecases.RegisterUserCase;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;
import com.tech.padawan.bookmanager.usermanagement.domain.repository.UserRepository;
import com.tech.padawan.bookmanager.usermanagement.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserApplicationService implements UserService {
    private final RegisterUserCase registerUserCase;
    private final FindAllUsersCase findAllUsersCase;

    public UserApplicationService(UserRepository repository) {
        this.registerUserCase = new RegisterUserCase(repository);
        this.findAllUsersCase = new FindAllUsersCase(repository);
    }


    @Override
    public List<UserResponse> findAll() {
        return findAllUsersCase.execute();
    }

    @Override
    public Optional<UserResponse> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public UserResponse save(UserRegister user) {

        return registerUserCase.execute(user);
    }


    @Override
    public void delete(User user) {

    }
}
