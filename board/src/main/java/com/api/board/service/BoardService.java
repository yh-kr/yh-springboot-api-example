package com.api.board.service;

import java.util.List;

import com.api.board.domain.Board;
import com.api.board.mapper.BoardMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    
    @Autowired
    private BoardMapper boardMapper;
 
    /**
     * 게시글 목록 조회
     * 
     * @return
     * @throws Exception
     */
    public List<Board> getBoardList() throws Exception {
        return boardMapper.getBoardList();
    }
}
