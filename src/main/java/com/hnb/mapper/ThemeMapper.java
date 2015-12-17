package com.hnb.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hnb.theme.ThemeVO;

@Repository
public interface ThemeMapper {

public int add(ThemeVO o);  //테마 추가

public int change(ThemeVO o); // 테마 수정

public int remove(String themeName); //테마 삭제

public ThemeVO searchByName(String themeName); //테마 이름으로 검색
 
 public List<ThemeVO> getList(); //모든 테마

}
