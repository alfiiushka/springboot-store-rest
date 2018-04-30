package ru.ivmiit.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ivmiit.store.dto.StoreUserDTO;
import ru.ivmiit.store.dto.TokenDTO;
import ru.ivmiit.store.model.StoreUser;
import ru.ivmiit.store.repository.StoreUserRepository;
import ru.ivmiit.store.repository.TokenRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private StoreUserRepository storeUserRepository;

    @Autowired
    private TokenRepository tokenRepository;


    @Override
    public List<StoreUserDTO> getAllStoreUsers() {
        return storeUserRepository.findAll().stream().map(StoreUserDTO::new).collect(Collectors.toList());
    }

    @Override
    public StoreUserDTO findById(Long id) {
        StoreUser storeUser = storeUserRepository.findById(id).orElse(null);
        return storeUser == null ? null : new StoreUserDTO(storeUser);
    }

    @Override
    public List<TokenDTO> getAllTokens() {
        return tokenRepository.findAll().stream().map(TokenDTO::new).collect(Collectors.toList());
    }


}
