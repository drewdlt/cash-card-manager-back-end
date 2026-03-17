package example.cashcardmanager.services;

import example.cashcardmanager.dto.CashCardDTO;
import example.cashcardmanager.dto.UserDTO;
import example.cashcardmanager.entities.CashCard;
import example.cashcardmanager.repositories.CashCardRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CashCardServiceImp implements CashCardService {

    private final CashCardRepository cashCardRepository;

    public CashCardServiceImp(CashCardRepository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @Override
    public CashCardDTO toDto(CashCard cashCard) {
        UserDTO userDto = new UserDTO(cashCard.getOwner());

        return new CashCardDTO(cashCard, userDto);
    }

    public CashCardDTO findById(Long id) {
        Optional<CashCard> result = cashCardRepository.findById(id);
        if (result.isPresent()) {
            return toDto(result.get());
        }
        else {
            throw new RuntimeException("CashCard id not found");
        }
    }
}
