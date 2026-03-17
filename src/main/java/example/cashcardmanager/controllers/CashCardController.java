package example.cashcardmanager.controllers;

import example.cashcardmanager.dto.CashCardDTO;
import example.cashcardmanager.entities.CashCard;
import example.cashcardmanager.repositories.CashCardRepository;
import example.cashcardmanager.services.CashCardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cash-cards")
public class CashCardController {

    private final CashCardService cashCardService;
    private final CashCardRepository cashCardRepository;

    public CashCardController(CashCardService cashCardService, CashCardRepository cashCardRepository) {
        this.cashCardService = cashCardService;
        this.cashCardRepository = cashCardRepository;
    }

    @GetMapping
    public List<CashCard> getAllCashCards() {
        return cashCardRepository.findAll();
    }

    @GetMapping("/{id}")
    public CashCardDTO getCashCardById(@PathVariable Long id) {
        return cashCardService.findById(id);
    }

}
