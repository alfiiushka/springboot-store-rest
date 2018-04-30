package ru.ivmiit.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ivmiit.store.dto.TokenDTO;
import ru.ivmiit.store.form.SignInForm;
import ru.ivmiit.store.service.SignInService;

@RestController
public class SignInController {

    @Autowired
    private SignInService signInService;

    @PostMapping("/signIn")
    public TokenDTO signIn(@RequestBody SignInForm signInForm){
        return signInService.signIn(signInForm);
    }
}
