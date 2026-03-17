package example.cashcardmanager.services;

import example.cashcardmanager.dto.UserDTO;
import example.cashcardmanager.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO toDto(User user);

    UserDTO findById(Long id);
}
