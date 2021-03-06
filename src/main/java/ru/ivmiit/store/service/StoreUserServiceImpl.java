package ru.ivmiit.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.ivmiit.store.enums.RoleEnum;
import ru.ivmiit.store.form.StoreUserRegistrationForm;
import ru.ivmiit.store.model.StoreUser;
import ru.ivmiit.store.repository.RoleRepository;
import ru.ivmiit.store.repository.StoreUserRepository;

@Service
public class StoreUserServiceImpl implements StoreUserService {

    @Autowired
    private StoreUserRepository storeUserRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveStoreUser(StoreUserRegistrationForm storeUserRegistrationForm) {
        StoreUser storeUser = new StoreUser();
        storeUser.setLogin(storeUserRegistrationForm.getLogin());
        storeUser.setPassword(passwordEncoder.encode(storeUserRegistrationForm.getPassword()));
        storeUser.setRole(roleRepository.findByCode(RoleEnum.USER.getCode()));
        storeUser.setAge(storeUserRegistrationForm.getAge());
        storeUser.setFio(storeUserRegistrationForm.getFio());
        storeUser.setiLikeTelegram(storeUserRegistrationForm.getiLikeTelegram());
        storeUserRepository.save(storeUser);
    }

}
