package com.fastcampus.board;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	public List<Board> getList(){
		return (List<Board>) this.boardRepository.findAll();
	}
	
	
	public Board getboard(Integer id) {
		Optional<Board> board = this.boardRepository.findById(id);
        if (board.isPresent()) {
            return board.get();
        } 
        else {
            System.out.println("error");
        }
		return null;
	}
	
	
	public void create(String TITLE,String WRITER,String CONTENT) {
		Board board = new Board();
        board.setTITLE(TITLE);
        board.setWRITER(WRITER);
        board.setCONTENT(CONTENT);
        board.setCNT(0);
        this.boardRepository.save(board);
		
	}
	
	public void update(Board board, String TITLE, String WRITER, String CONTENT) {
		board.setTITLE(TITLE);
		board.setWRITER(WRITER);
		board.setCONTENT(CONTENT);
		this.boardRepository.save(board);
	}

	public void delete(Board board) {
		this.boardRepository.delete(board);
	}
}
