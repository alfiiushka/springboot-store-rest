package ru.ivmiit.store.model;


import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name = "store_user_id")
    private StoreUser storeUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StoreUser getStoreUser() {
        return storeUser;
    }

    public void setStoreUser(StoreUser storeUser) {
        this.storeUser = storeUser;
    }
}
