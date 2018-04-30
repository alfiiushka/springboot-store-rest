package ru.ivmiit.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ivmiit.store.dto.StoreUserDTO;
import ru.ivmiit.store.dto.TokenDTO;
import ru.ivmiit.store.service.AdminService;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin/store-users")
    public List<StoreUserDTO> getAllStoreUsers() {
        return adminService.getAllStoreUsers();
    }

    @GetMapping("/admin/store-users/{id}")
    public StoreUserDTO getStoreUser(@PathVariable("id") Long id) {
        return adminService.findById(id);
    }

    @GetMapping("/admin/tokens")
    public List<TokenDTO> getAllTokens() {
        return adminService.getAllTokens();
    }


}
