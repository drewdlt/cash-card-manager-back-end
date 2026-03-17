package example.cashcardmanager.controllers;

import example.cashcardmanager.entities.CashCard;
import example.cashcardmanager.repositories.CashCardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    private final CashCardRepository cashCardRepository;

    public CashCardController(CashCardRepository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @GetMapping
    public List<CashCard> getAllCashCards() {
        return cashCardRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CashCard> getCashCardById(@PathVariable int id) {
        return cashCardRepository.findById((long) id);
    }

}
