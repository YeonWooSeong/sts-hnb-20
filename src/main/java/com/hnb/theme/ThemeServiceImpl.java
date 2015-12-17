package com.hnb.theme;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnb.mapper.MovieMapper;
import com.hnb.mapper.ThemeMapper;
import com.hnb.movie.MovieVO;


@Service
public class ThemeServiceImpl implements ThemeService {
	private static final Logger logger = LoggerFactory.getLogger(ThemeController.class);
	@Autowired private SqlSession sqlSession;
	
	@Override
	public int add(ThemeVO o) {
		logger.info("themeserviceimpl : add()");
		ThemeMapper mapper = sqlSession.getMapper(ThemeMapper.class);
		return mapper.add(o);
	}

	@Override
	public int change(ThemeVO o) {
		logger.info("themeserviceimpl : change()");
		ThemeMapper mapper = sqlSession.getMapper(ThemeMapper.class);
		return mapper.change(o);
	}

	@Override
	public int remove(String themeName) {
		logger.info("themeserviceimpl : remove()");
		ThemeMapper mapper = sqlSession.getMapper(ThemeMapper.class);
		return mapper.remove(themeName);
	}

	@Override
	public ThemeVO searchByName(String themeName) {
		logger.info("themeserviceimpl : searchByName()");
		ThemeMapper mapper = sqlSession.getMapper(ThemeMapper.class);
		return mapper.searchByName(themeName);
	}

	@Override
	public List<ThemeVO> getList() {
		logger.info("themeserviceimpl : getList()");
		ThemeMapper mapper = sqlSession.getMapper(ThemeMapper.class);
		return mapper.getList();
	}

}
