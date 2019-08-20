package com.everis.gameStore.domain.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class Games.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "games")
public class Games implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Column(name = "id")
	private BigInteger id;

	/** The game name. */
	@Column(name = "game_name")
	private String gameName;

	/** The image. */
	@Column(name = "image")
	private Blob image;

	/** The activation code. */
	@Column(name = "activation_code")
	private String activationCode;

	/** The value. */
	@Column(name = "value")
	private Integer value;

	/** The stock. */
	@Column(name = "stock")
	private Integer stock;

	/** The id clients. */
	@Column(name = "id_clients")
	private BigInteger idClients;
}