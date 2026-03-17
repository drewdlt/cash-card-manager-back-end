package example.cashcardmanager.dto;

import example.cashcardmanager.entities.CashCard;
import lombok.Data;

@Data
public class CashCardDTO {
    private Double value;
    private UserDTO owner;

    public CashCardDTO(CashCard cashCard, UserDTO userDTO) {
        this.value = cashCard.getValue();
        this.owner = userDTO;
    }
}
