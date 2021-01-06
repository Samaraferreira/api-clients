package com.orangetalents.api.mapper;

import com.orangetalents.api.dto.ClientDTO;
import com.orangetalents.api.entities.Client;
import java.util.Optional;

public class ClientMapper {

    public static ClientMapper get() {
        return new ClientMapper();
    }

    public Client entity(ClientDTO clientDTO) {
        Client client = new Client();

        client.setName(clientDTO.getName());
        client.setCpf(clientDTO.getCpf());
        client.setEmail(clientDTO.getEmail());
        client.setBirthday(clientDTO.getBirthday());

        return client;
    }

    public ClientDTO dto(Client client) {
        ClientDTO dto = new ClientDTO();

        dto.setName(client.getName());
        dto.setCpf(client.getCpf());
        dto.setEmail(client.getEmail());
        dto.setBirthday(client.getBirthday());

        return dto;
    }
}
