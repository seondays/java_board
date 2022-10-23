package com.fastcampus.board;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int SEQ;
	
	
	private String TITLE;
	private String WRITER;
	private String CONTENT;
	private int CNT = 0;
	

}
