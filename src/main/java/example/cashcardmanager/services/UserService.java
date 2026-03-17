package example.cashcardmanager.services;

import example.cashcardmanager.dto.UserDTO;
import example.cashcardmanager.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public UserDTO toDto(User user);

    public UserDTO findById(Long id);
}
