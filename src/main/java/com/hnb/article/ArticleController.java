package com.hnb.article;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hnb.global.Command;
import com.hnb.global.CommandFactory;


@Controller
@RequestMapping("/article")
public class ArticleController {
	@Autowired ArticleServiceImpl articleService;
	@Autowired ArticleVO article;
	private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

	
	@RequestMapping("/list/{themeNo}/{pageNo}")
	public @ResponseBody List<ArticleVO> getList(
			@PathVariable("pageNo") String pageNo,String themeNo, Model model,@RequestBody Command command) {
		logger.info("ArticleController : getList 들어감");
		int pageNum = command.getPageNo();
		int themeNum = command.getThemeNo();
		logger.info("넘어온 페이지번호 : {}", command.getPageNo());
		logger.info("넘어온 페이지번호 : {}", command.getThemeNo());
		
		List<ArticleVO>list = articleService.getList(CommandFactory.boardList(pageNo, themeNo));
		logger.info("검색한 게시판 글 수 : {}",list.size());
		return list;
	}

	@RequestMapping("/list")
	public String goList() {
		logger.info("ArticleController : goList 들어감");
		return "article/list.tiles";
	}

	@RequestMapping("/write")
	public String write(){
		logger.info("ArticleController : write 들어감");
		return "article/write.jsp";
		
	}
	@RequestMapping("/save")
	public String save(
			@RequestBody ArticleVO artice){
		logger.info("ArticleController save()");
		return "article/write.jsp";
	}
	
}
