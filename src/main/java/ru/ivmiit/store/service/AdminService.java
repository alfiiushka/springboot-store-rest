package ru.ivmiit.store.service;

import ru.ivmiit.store.dto.StoreUserDTO;
import ru.ivmiit.store.dto.TokenDTO;

import java.util.List;

public interface AdminService {

    List<StoreUserDTO> getAllStoreUsers();

    StoreUserDTO findById(Long id);

    List<TokenDTO> getAllTokens();

}
