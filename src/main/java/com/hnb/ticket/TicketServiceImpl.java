package com.hnb.ticket;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnb.mapper.TicketMapper;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired private SqlSession sqlSession;
	
	private static TicketService instance = new TicketServiceImpl();
	private TicketServiceImpl() {}
	public static TicketService getInstance(){
		return instance;
	}
	
	

	
	
	@Override
	public List<?> getSeatList(String theater, String room) {
		TicketMapper mapper = sqlSession.getMapper(TicketMapper.class);
		return mapper.getSeatList(theater,room);
	}
}
