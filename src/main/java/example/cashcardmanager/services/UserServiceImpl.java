package example.cashcardmanager.services;

import example.cashcardmanager.dto.UserDTO;
import example.cashcardmanager.entities.User;
import example.cashcardmanager.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO toDto(User user) {
        return new UserDTO(user);
    }

    @Override
    public UserDTO findById(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return toDto(user.get());
        }
        else {
            throw new RuntimeException("User not found");
        }
    }
}
