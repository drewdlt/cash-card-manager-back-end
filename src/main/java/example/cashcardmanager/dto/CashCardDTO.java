package example.cashcardmanager.dto;

import lombok.Data;

@Data
public class CashCardDTO {
    private Double value;
    private UserDTO owner;

    public CashCardDTO(Double value, UserDTO owner) {
        this.value = value;
        this.owner = owner;
    }
}
