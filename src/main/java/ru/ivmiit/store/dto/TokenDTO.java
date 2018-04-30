package ru.ivmiit.store.dto;

import ru.ivmiit.store.model.Token;

public class TokenDTO {

    private String value;

    public TokenDTO(Token token){
        this.value=token.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
