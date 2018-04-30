package ru.ivmiit.store.dto;

import ru.ivmiit.store.model.StoreUser;
import ru.ivmiit.store.model.Token;

import java.util.Optional;

public class TokenDTO {

    private String storeUserFio;

    private String value;

    public TokenDTO(Token token){

        this.value=token.getValue();
        this.storeUserFio= Optional.of(token).map(Token::getStoreUser).map(StoreUser::getFio).orElse(null);
    }

    public String getStoreUserFio() {
        return storeUserFio;
    }

    public void setStoreUserFio(String storeUserFio) {
        this.storeUserFio = storeUserFio;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
