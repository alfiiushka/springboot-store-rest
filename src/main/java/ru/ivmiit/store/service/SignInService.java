package ru.ivmiit.store.service;

import ru.ivmiit.store.dto.TokenDTO;
import ru.ivmiit.store.form.SignInForm;

public interface SignInService {

    TokenDTO signIn(SignInForm signInForm);
}
