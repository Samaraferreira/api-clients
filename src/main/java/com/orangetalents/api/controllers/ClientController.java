package com.orangetalents.api.controllers;

import com.orangetalents.api.dto.ClientDTO;
import com.orangetalents.api.exceptions.ClientNotFoundException;
import com.orangetalents.api.services.ClientService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<ClientDTO> create(@RequestBody @Valid ClientDTO clientDTO) {
        return new ResponseEntity<>(clientService.create(clientDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<ClientDTO> findByCpf(@PathVariable String cpf) throws ClientNotFoundException {
        return new ResponseEntity<>(clientService.findByCpf(cpf), HttpStatus.OK);
    }
}
