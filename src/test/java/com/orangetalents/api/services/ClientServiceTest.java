package com.orangetalents.api.services;

import com.orangetalents.api.entities.Client;
import com.orangetalents.api.dto.ClientDTO;
import com.orangetalents.api.repositories.ClientRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.orangetalents.api.utils.ClientUtils.createFakeEntity;
import static com.orangetalents.api.utils.ClientUtils.createFakeDTO;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @Mock
    private ClientRepository clientRepositoryMock;

    @InjectMocks
    private ClientService clientService;

    @Test
    void whenClientInformedThenItShouldBeCreated() {
        ClientDTO clientToSave = createFakeDTO();
        Client expectedSavedClient = createFakeEntity();

        when(clientRepositoryMock.save(any(Client.class))).thenReturn(expectedSavedClient);

        ClientDTO savedClientDTO = clientService.create(clientToSave);

        assertEquals(clientToSave, savedClientDTO);
    }
}
