package com.everis.gameStore.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class AuthenticationRequestDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationRequestDTO {

    // private String username;
    // private String password;

    /** The nick name. */
    private String nickName;

    /** The password. */
    private String password;

    /** The token. */
    private String token;
}