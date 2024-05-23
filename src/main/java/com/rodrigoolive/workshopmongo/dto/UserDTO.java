package com.rodrigoolive.workshopmongo.dto;

import java.io.Serializable;

import com.rodrigoolive.workshopmongo.domain.User;

// Classe que representa um DTO (Data Transfer Object) para a entidade User
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    // Construtor padrão sem argumentos
    public UserDTO() {
    }

    // Construtor que recebe um objeto User como parâmetro e inicializa os campos correspondentes
    public UserDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();
    }

    // Getter para o campo id
    public String getId() {
        return id;
    }

    // Setter para o campo id
    public void setId(String id) {
        this.id = id;
    }

    // Getter para o campo name
    public String getName() {
        return name;
    }

    // Setter para o campo name
    public void setName(String name) {
        this.name = name;
    }

    // Getter para o campo email
    public String getEmail() {
        return email;
    }

    // Setter para o campo email
    public void setEmail(String email) {
        this.email = email;
    }
}
