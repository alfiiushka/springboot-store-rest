package ru.ivmiit.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ivmiit.store.dto.StoreUserDTO;
import ru.ivmiit.store.form.StoreUserRegistrationForm;
import ru.ivmiit.store.service.StoreUserService;

import java.util.List;

@RestController
public class StoreUserController {

    @Autowired
    private StoreUserService storeUserService;

    @GetMapping("/store-users")
    public List<StoreUserDTO> getAllStoreUsers(){
        return storeUserService.getAllStoreUsers();
    }

    @GetMapping("/store-users/{id}")
    public StoreUserDTO getStoreUser(@PathVariable("id") Long id){
        return storeUserService.findById(id);
    }

    @PostMapping("/store-users")
    public void saveStoreUser(@RequestBody StoreUserRegistrationForm storeUserRegistrationForm){
        storeUserService.saveStoreUser(storeUserRegistrationForm);
    }
}
