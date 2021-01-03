package com.orangetalents.api.controllers;

import com.orangetalents.api.dto.ClientRequestDTO;
import com.orangetalents.api.services.ClientService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/client")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientRequestDTO> create(@RequestBody @Valid ClientRequestDTO clientRequestDTO) {
        return new ResponseEntity<>(clientService.create(clientRequestDTO), HttpStatus.CREATED);
    }
}
