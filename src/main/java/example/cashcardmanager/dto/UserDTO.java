package example.cashcardmanager.dto;

import example.cashcardmanager.entities.User;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String fullName;
    private String email;

    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.fullName = user.getFirstName() + " " + user.getLastName();
        this.email = user.getEmail();
    }
}
