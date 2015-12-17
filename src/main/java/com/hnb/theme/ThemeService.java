package com.hnb.theme;

import java.util.List;

import com.hnb.theme.ThemeVO;

public interface ThemeService {
	public int add(ThemeVO o);	//테마추가
	public int change(ThemeVO o); //테마수정
	public int remove(String themeName); //테마 삭제
	public ThemeVO searchByName(String themeName); //제목으로 검색
	public List<ThemeVO> getList(); //전체 테마목록
}
