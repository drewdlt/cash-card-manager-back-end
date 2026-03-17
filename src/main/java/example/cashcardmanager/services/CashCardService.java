package example.cashcardmanager.services;

import example.cashcardmanager.dto.CashCardDTO;
import example.cashcardmanager.entities.CashCard;
import org.springframework.stereotype.Service;

@Service
public interface CashCardService {
    public CashCardDTO toDto(CashCard cashCard);

    public CashCardDTO findById(Long id);
}
