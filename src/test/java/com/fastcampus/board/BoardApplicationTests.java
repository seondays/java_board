package com.fastcampus.board;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardApplicationTests {
	
	 @Autowired
	 private BoardRepository boardRepository;

    @Test
    void contextLoads() {
    	
    }

}
