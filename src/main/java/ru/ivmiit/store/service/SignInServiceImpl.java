package ru.ivmiit.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.ivmiit.store.dto.TokenDTO;
import ru.ivmiit.store.form.SignInForm;
import ru.ivmiit.store.model.StoreUser;
import ru.ivmiit.store.model.Token;
import ru.ivmiit.store.repository.StoreUserRepository;
import ru.ivmiit.store.repository.TokenRepository;
import org.apache.commons.lang.RandomStringUtils;

import java.util.Optional;

@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    private TokenRepository tokenRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private StoreUserRepository storeUserRepository;


    @Override
    public TokenDTO signIn(SignInForm signInForm) {
        Optional<StoreUser> storeUserOptional = storeUserRepository.findOneByLogin(signInForm.getLogin());
        if (storeUserOptional.isPresent()) {
            StoreUser storeUser = storeUserOptional.get();
            if (passwordEncoder.matches(signInForm.getPassword(), storeUser.getPassword())) {
                Token token = new Token();
                token.setStoreUser(storeUser);
                token.setValue(RandomStringUtils.random(10, true, true));
                tokenRepository.save(token);
                return new TokenDTO(token);
            }
        }
        throw new IllegalArgumentException("Not found Store user");
    }
}
