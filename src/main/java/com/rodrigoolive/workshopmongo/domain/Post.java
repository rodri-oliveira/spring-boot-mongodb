package com.rodrigoolive.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Anotação que indica que esta classe é um documento MongoDB
@Document
public class Post implements Serializable {

    // Serialização padrão para garantir compatibilidade durante a transmissão de dados
    private static final long serialVersionUID = 1L;

    // Anotação que marca este campo como o identificador do documento no MongoDB
    @Id
    private String id;
    
    private Date date;
    private String title;
    private String body;
    
    // Referência ao autor do post
    private User author;

    // Construtor padrão sem argumentos
    public Post() {
    }

    // Construtor com argumentos para inicializar todos os campos
    public Post(String id, Date date, String title, String body, User author) {
        super();
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    // Getter para o campo id
    public String getId() {
        return id;
    }

    // Setter para o campo id
    public void setId(String id) {
        this.id = id;
    }

    // Getter para o campo date
    public Date getDate() {
        return date;
    }

    // Setter para o campo date
    public void setDate(Date date) {
        this.date = date;
    }

    // Getter para o campo title
    public String getTitle() {
        return title;
    }

    // Setter para o campo title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter para o campo body
    public String getBody() {
        return body;
    }

    // Setter para o campo body
    public void setBody(String body) {
        this.body = body;
    }

    // Getter para o campo author
    public User getAuthor() {
        return author;
    }

    // Setter para o campo author
    public void setAuthor(User author) {
        this.author = author;
    }

    // Implementação do método hashCode com base no campo id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Implementação do método equals para comparação entre objetos Post
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Post other = (Post) obj;
        return Objects.equals(id, other.id);
    }
}
