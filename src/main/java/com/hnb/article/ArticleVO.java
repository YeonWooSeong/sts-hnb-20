package com.hnb.article;

import org.springframework.stereotype.Component;

@Component
public class ArticleVO {
int rcdNO;  //글 번호
int GrpNO; // 글 그룹 번호
String UsrName; //작성자 이름
String UsrMail; // 작성자 이메일
String UsrSubject; // 글ㅈ ㅔ목
String UsrContent;//글 내용
String UsrPass; // 글 비번
String UsrFileName; // 업로드 되는 파일 이름
int UsrFileSize; // 파일 크기
String UsrDate; // 작성일 
int UsrRefer;// 글 참조 횟수
int RcdLevel; // 글 레벨
int RcdOrder; // 글 그룹에서의 글의 출력 순서
public int getRcdNO() {
	return rcdNO;
}
public void setRcdNO(int rcdNO) {
	this.rcdNO = rcdNO;
}
public int getGrpNO() {
	return GrpNO;
}
public void setGrpNO(int grpNO) {
	GrpNO = grpNO;
}
public String getUsrName() {
	return UsrName;
}
public void setUsrName(String usrName) {
	UsrName = usrName;
}
public String getUsrMail() {
	return UsrMail;
}
public void setUsrMail(String usrMail) {
	UsrMail = usrMail;
}
public String getUsrSubject() {
	return UsrSubject;
}
public void setUsrSubject(String usrSubject) {
	UsrSubject = usrSubject;
}
public String getUsrContent() {
	return UsrContent;
}
public void setUsrContent(String usrContent) {
	UsrContent = usrContent;
}
public String getUsrPass() {
	return UsrPass;
}
public void setUsrPass(String usrPass) {
	UsrPass = usrPass;
}
public String getUsrFileName() {
	return UsrFileName;
}
public void setUsrFileName(String usrFileName) {
	UsrFileName = usrFileName;
}
public int getUsrFileSize() {
	return UsrFileSize;
}
public void setUsrFileSize(int usrFileSize) {
	UsrFileSize = usrFileSize;
}
public String getUsrDate() {
	return UsrDate;
}
public void setUsrDate(String usrDate) {
	UsrDate = usrDate;
}
public int getUsrRefer() {
	return UsrRefer;
}
public void setUsrRefer(int usrRefer) {
	UsrRefer = usrRefer;
}
public int getRcdLevel() {
	return RcdLevel;
}
public void setRcdLevel(int rcdLevel) {
	RcdLevel = rcdLevel;
}
public int getRcdOrder() {
	return RcdOrder;
}
public void setRcdOrder(int rcdOrder) {
	RcdOrder = rcdOrder;
}
@Override
public String toString() {
	return "ArticleVO [rcdNO=" + rcdNO + ", GrpNO=" + GrpNO + ", UsrName=" + UsrName + ", UsrMail=" + UsrMail
			+ ", UsrSubject=" + UsrSubject + ", UsrContent=" + UsrContent + ", UsrPass=" + UsrPass + ", UsrFileName="
			+ UsrFileName + ", UsrFileSize=" + UsrFileSize + ", UsrDate=" + UsrDate + ", UsrRefer=" + UsrRefer
			+ ", RcdLevel=" + RcdLevel + ", RcdOrder=" + RcdOrder + "]";
}





}
