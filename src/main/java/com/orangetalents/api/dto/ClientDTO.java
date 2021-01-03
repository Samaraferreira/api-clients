package com.orangetalents.api.dto;

import java.time.LocalDate;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

public class ClientDTO {

    @NotEmpty(message = "The field 'cpf' cannot be empty/null")
    @CPF
    private String cpf;

    @NotEmpty(message = "The field 'name' cannot be empty/null")
    private String name;

    @NotEmpty(message = "The field 'email' cannot be empty/null")
    @Email(message = "The field 'email' should be valid")
    private String email;
//, message = "The field 'birthday' must be in the format DD/MM/YYYY"

    @NotEmpty(message = "The field 'birthday' cannot be empty/null")
    @Past
    @DateTimeFormat(pattern = "yyyy-MM-DD")
    private LocalDate birthday;

    public ClientDTO() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
