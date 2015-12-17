package com.hnb.article;

import org.springframework.stereotype.Component;

@Component
public class ArticleVO {
int rcdNo;  //글 번호
int grpNO; // 글 그룹 번호
String usrName; //작성자 이름
String usrMail; // 작성자 이메일
String usrSubject; // 글ㅈ ㅔ목
String usrContent;//글 내용
String usrPass; // 글 비번
String usrFileName; // 업로드 되는 파일 이름
int usrFileSize; // 파일 크기
String usrDate; // 작성일 
int usrRefer;// 글 참조 횟수
int rcdLevel; // 글 레벨
int rcdOrder; // 글 그룹에서의 글의 출력 순서
public int getRcdNo() {
	return rcdNo;
}
public void setRcdNo(int rcdNo) {
	this.rcdNo = rcdNo;
}
public int getGrpNO() {
	return grpNO;
}
public void setGrpNO(int grpNO) {
	this.grpNO = grpNO;
}
public String getUsrName() {
	return usrName;
}
public void setUsrName(String usrName) {
	this.usrName = usrName;
}
public String getUsrMail() {
	return usrMail;
}
public void setUsrMail(String usrMail) {
	this.usrMail = usrMail;
}
public String getUsrSubject() {
	return usrSubject;
}
public void setUsrSubject(String usrSubject) {
	this.usrSubject = usrSubject;
}
public String getUsrContent() {
	return usrContent;
}
public void setUsrContent(String usrContent) {
	this.usrContent = usrContent;
}
public String getUsrPass() {
	return usrPass;
}
public void setUsrPass(String usrPass) {
	this.usrPass = usrPass;
}
public String getUsrFileName() {
	return usrFileName;
}
public void setUsrFileName(String usrFileName) {
	this.usrFileName = usrFileName;
}
public int getUsrFileSize() {
	return usrFileSize;
}
public void setUsrFileSize(int usrFileSize) {
	this.usrFileSize = usrFileSize;
}
public String getUsrDate() {
	return usrDate;
}
public void setUsrDate(String usrDate) {
	this.usrDate = usrDate;
}
public int getUsrRefer() {
	return usrRefer;
}
public void setUsrRefer(int usrRefer) {
	this.usrRefer = usrRefer;
}
public int getRcdLevel() {
	return rcdLevel;
}
public void setRcdLevel(int rcdLevel) {
	this.rcdLevel = rcdLevel;
}
public int getRcdOrder() {
	return rcdOrder;
}
public void setRcdOrder(int rcdOrder) {
	this.rcdOrder = rcdOrder;
}
@Override
public String toString() {
	return "ArticleVO [rcdNo=" + rcdNo + ", grpNO=" + grpNO + ", usrName=" + usrName + ", usrMail=" + usrMail
			+ ", usrSubject=" + usrSubject + ", usrContent=" + usrContent + ", usrPass=" + usrPass + ", usrFileName="
			+ usrFileName + ", usrFileSize=" + usrFileSize + ", usrDate=" + usrDate + ", usrRefer=" + usrRefer
			+ ", rcdLevel=" + rcdLevel + ", rcdOrder=" + rcdOrder + "]";
}


}
