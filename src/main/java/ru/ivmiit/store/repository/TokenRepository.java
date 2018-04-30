package ru.ivmiit.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivmiit.store.model.Token;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Optional<Token> findByValue(String value);
}
