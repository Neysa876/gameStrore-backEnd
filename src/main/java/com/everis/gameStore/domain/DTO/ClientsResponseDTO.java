package com.everis.gameStore.domain.DTO;

import java.math.BigInteger;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientsDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientsResponseDTO {

    /** The id client. */
    private BigInteger idClient;

    /** The nickname. */
    private String nickname;

    /** The email. */
    private String email;

    /** The password. */
    private String password;

    /** The token. */
    private String token;

    /** The list acq game. */
    private String listAcquiredGame;

    /** The date acq game. */
    private Timestamp dateAcquiredGame;

    /** The client roles. */
    private String clientRoles;
}