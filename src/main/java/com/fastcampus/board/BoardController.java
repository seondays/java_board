package com.fastcampus.board;

import com.fastcampus.board.dto.PostDto;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


@RequiredArgsConstructor
@Controller
public class BoardController {

	private final BoardService boardService;
	
	Board boardUpdate = new Board();
	
	
	
	// 생성
	
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String createPost(@Valid BoardForm boardForm, BindingResult bindingResult) {
    	if (bindingResult.hasErrors()) {
    		System.out.println("값을 입력하지 않아 에러입니다");
            return "redirect:/";
    	}
    	this.boardService.create(boardForm.getTITLE(),boardForm.getWRITER(),boardForm.getCONTENT());
    	return "redirect:/"; // 추가 후 홈 화면으로
    }
    
    // 메인 리스트
    
    @RequestMapping("/")
    public String ReadAllPost(Model model){
    	List<Board> postList = this.boardService.getList();
    	model.addAttribute("postList", postList);
        return "index";
    }
    
    // 수정
     
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public String updatePost(@Valid BoardForm boardForm, BindingResult bindingResult, Model model){
    	if (bindingResult.hasErrors()) {
    		System.out.println("값을 입력하지 않아 에러입니다");
            return "redirect:/";
        }
    	
    	this.boardService.update(boardUpdate, boardForm.getTITLE(), boardForm.getWRITER(),boardForm.getCONTENT());
    	
    
        return "redirect:/";
        
    }

    // 삭제 
    
    @RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
    public String deletePost(@PathVariable int id){
    	
    	Board board = this.boardService.getboard(id);
    	this.boardService.delete(board);
        return "redirect:/";
    	 
    }


    @RequestMapping(value="/createView")
    public String ViewCreate(Model model){
        model.addAttribute("command", new Board());
        return "create";
    }
        
    @RequestMapping(value="/updateView/{id}")
    public String ViewUpdate(@PathVariable int id, Model model){
    	boardUpdate.setSEQ(id);
        model.addAttribute("command",boardUpdate);
        
        return "update";
    }
}

