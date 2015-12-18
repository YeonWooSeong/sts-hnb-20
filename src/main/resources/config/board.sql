CREATE TABLE BOARD(
RCD_NO NUMBER, --레코드 번호
GRP_NO NUMBER, -- 그룹 번호
THEME_NO NUMBER, -- 테마 번호
USR_NAME VARCHAR2(30),  -- 작성자
USR_MAIL VARCHAR2(30), -- 이메일
USR_SUBJECT VARCHAR2(30), -- 제목
USR_CONTENT VARCHAR2(1000), -- --내용
USR_PASS VARCHAR2(30),  -- 비번
USR_FILE_NAME VARCHAR2(30), -- 파일
USR_FILE_SIZE NUMBER, --파일 크기
USR_DATE VARCHAR2(30), -- 작성일 
USR_REFER NUMBER, -- 참조
RCD_LEVEL NUMBER, -- 레벨
RCD_ORDER NUMBER, -- 순서
CONSTRAINT BOARD_PK PRIMARY KEY(RCD_NO),
CONSTRAINT BOARD_FK_THEME FOREIGN KEY(THEME_NO) REFERENCES THEME(THEME_NO)
);


CREATE TABLE THEME(
THEME_NO NUMBER,
THEME_NAME VARCHAR2(30),
CONSTRAINT THEME_PK PRIMARY KEY(THEME_NO)
);

INSERT INTO THEME(THEME_NO,THEME_NAME)
VALUES (SEQ.NEXTVAL, '회원관리');   --시퀀스 281 
INSERT INTO THEME(THEME_NO,THEME_NAME)
VALUES (SEQ.NEXTVAL, '자유게시판');  -- 시퀀스 282

SELECT * FROM THEME;
--GrpNo= 원 글과 원 글에 딸린 댓글을 구별하기 위한 값으로, 
--원 글만 존재할 경우에는 GRP_NO 는 널 로 주고
-- 만약 , 댓글이 달리면 그 때 원 글에 RCD_NO 와 동일한 값을 부여하는 것으로 한다.
-- 이 때 댓글도 원글과 GRP_NO 는 동일하게 묶는다.

--Rcd_Level 은 이 글이 원 글인지, 댓글인지 , 댓댓글인지 나타내는 값으로
--원 글이면 0, 1단계 댓글이면 1, 2단계 댓글이면 2 이런식으로 추가된다.

--Rcd_Order 는 댓글,원 글, 대댓글이든 시간 순서대로 보여주는 값   + alt x
INSERT INTO BOARD(RCD_NO,THEME_NO,RCD_LEVEL,RCD_ORDER,USR_SUBJECT,USR_CONTENT)
VALUES(SEQ.NEXTVAL,142,0,1,'테스트','자게 첫번째 테스트 글 ㅎㅎ');-- 시퀀스 161
SELECT * FROM BOARD;
SELECT CURRVAL FROM DUAL;
SELECT * FROM TAB;