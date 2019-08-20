package com.everis.gameStore.domain.DTO;

import java.sql.Blob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class GamesDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamesRequestDTO {

	/** The game name. */
	private String gameName;

	/** The image. */
	private Blob image;

	/** The value. */
	private Integer value;

	/** The stock. */
	private Integer stock;
}