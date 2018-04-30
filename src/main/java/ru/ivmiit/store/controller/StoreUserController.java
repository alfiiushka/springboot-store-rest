package ru.ivmiit.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ivmiit.store.form.StoreUserRegistrationForm;
import ru.ivmiit.store.service.StoreUserService;

@RestController
public class StoreUserController {

    @Autowired
    private StoreUserService storeUserService;

    @PostMapping("/save-store-user")
    public void saveStoreUser(@RequestBody StoreUserRegistrationForm storeUserRegistrationForm) {
        storeUserService.saveStoreUser(storeUserRegistrationForm);
    }
}
