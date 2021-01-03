package com.orangetalents.api.mapper;

import com.orangetalents.api.dto.ClientRequestDTO;
import com.orangetalents.api.entities.Client;
import java.time.LocalDate;

public class ClientMapper {

    public static ClientMapper get() {
        return new ClientMapper();
    }

    public Client entity(ClientRequestDTO clientRequestDTO) {
        Client client = new Client();

        client.setName(clientRequestDTO.getName());
        client.setCpf(clientRequestDTO.getCpf());
        client.setEmail(clientRequestDTO.getEmail());
        client.setBirthday(clientRequestDTO.getBirthday());

        return client;
    }

    public ClientRequestDTO dto(Client client) {
        ClientRequestDTO dto = new ClientRequestDTO();

        dto.setName(client.getName());
        dto.setCpf(client.getCpf());
        dto.setEmail(client.getEmail());
        dto.setBirthday(client.getBirthday());

        return dto;
    }

}
