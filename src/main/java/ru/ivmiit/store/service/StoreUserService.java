package ru.ivmiit.store.service;

import ru.ivmiit.store.dto.StoreUserDTO;
import ru.ivmiit.store.form.StoreUserRegistrationForm;

import java.util.List;

public interface StoreUserService {

    List<StoreUserDTO> getAllStoreUsers();

    StoreUserDTO findById(Long id);

    void saveStoreUser(StoreUserRegistrationForm storeUserRegistrationForm);
}
