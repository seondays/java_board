package com.fastcampus.board;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class BoardForm {
	@NotEmpty
	private String TITLE;
	
	@NotEmpty
	private String WRITER;
	
	@NotEmpty
	private String CONTENT;

}
