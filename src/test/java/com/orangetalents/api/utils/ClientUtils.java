package com.orangetalents.api.utils;

import com.orangetalents.api.dto.ClientDTO;
import com.orangetalents.api.entities.Client;
import com.orangetalents.api.mapper.ClientMapper;
import java.time.LocalDate;

public class ClientUtils {

    private static final long ID = 1L;
    private static final String NAME = "Rodrigo";
    private static final String CPF = "36933387879";
    private static final String EMAIL = "Rodrigo@gmail.com";
    public static final LocalDate BIRTHDAY = LocalDate.of(2010, 10, 1);

    public static ClientDTO createFakeDTO() {
        return ClientMapper.get().dto(createFakeEntity());
    }

    public static Client createFakeEntity() {
        return new Client(ID, CPF, NAME, EMAIL, BIRTHDAY);
    }

}
