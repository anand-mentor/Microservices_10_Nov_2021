package com.zensar.stock.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/*
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
*/
@Data
@ApiModel("Stock model")
public class Stock {

	@ApiModelProperty("Unique identifier of the stock")
	private int id;
	@ApiModelProperty("Name of the Stock")
	private String name;
	@ApiModelProperty("Market name where stock is registered")
	private String marketName;
	@ApiModelProperty("Current price of the stock")
	private double price;
}
