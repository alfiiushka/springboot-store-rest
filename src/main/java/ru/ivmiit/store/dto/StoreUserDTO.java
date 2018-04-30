package ru.ivmiit.store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ivmiit.store.model.StoreUser;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreUserDTO {

    private String fio;
    private Integer age;
    private Boolean iLikeTelegram;

    public StoreUserDTO(StoreUser storeUser){
        this.fio=storeUser.getFio();
        this.age=storeUser.getAge();
        this.iLikeTelegram=storeUser.getiLikeTelegram();
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getiLikeTelegram() {
        return iLikeTelegram;
    }

    public void setiLikeTelegram(Boolean iLikeTelegram) {
        this.iLikeTelegram = iLikeTelegram;
    }
}
