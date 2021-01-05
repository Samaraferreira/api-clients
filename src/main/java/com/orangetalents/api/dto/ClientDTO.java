package com.orangetalents.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.orangetalents.api.validation.annotations.UniqueCpf;
import com.orangetalents.api.validation.annotations.UniqueEmail;
import java.io.Serializable;
import java.time.LocalDate;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.br.CPF;

public class ClientDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank(message = "The field 'cpf' cannot be empty/null")
    @CPF(message = "The field 'cpf' should be valid")
    @UniqueCpf
    private String cpf;

    @NotBlank(message = "The field 'name' cannot be empty/null")
    private String name;

    @NotBlank(message = "The field 'email' cannot be empty/null")
    @Email(message = "The field 'email' should be valid")
    @UniqueEmail
    private String email;

    @NotNull(message = "The field 'birthday' cannot be empty/null")
    @Past(message = "The field 'birthday' should be valid")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthday;

    public ClientDTO() {
    }

    public ClientDTO(@NotEmpty @CPF String cpf, @NotEmpty String name, @NotEmpty @Email String email, @NotEmpty @Past LocalDate birthday) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
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
