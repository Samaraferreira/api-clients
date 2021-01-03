package com.orangetalents.api.services;

import com.orangetalents.api.dto.ClientRequestDTO;
import com.orangetalents.api.entities.Client;
import com.orangetalents.api.mapper.ClientMapper;
import com.orangetalents.api.repositories.ClientRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    private final ClientMapper clientMapper = ClientMapper.get();

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public ClientRequestDTO create(ClientRequestDTO clientRequestDTO) {
        Client clientToSave = clientMapper.entity(clientRequestDTO);

        clientRepository.save(clientToSave);

        return clientRequestDTO;
    }
}
