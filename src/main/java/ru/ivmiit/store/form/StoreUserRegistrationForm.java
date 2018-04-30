package ru.ivmiit.store.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoreUserRegistrationForm {
    private String login;
    private String password;
    private String fio;
    private Integer age;
    private Boolean iLikeTelegram;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
