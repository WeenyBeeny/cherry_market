-- 사용자 지정 테이블
CREATE TABLE members(
	mnum NUMBER PRIMARY KEY,
	mname VARCHAR2(100),
	mid VARCHAR2(100) PRIMARY KEY,
	mpwd VARCHAR2(100) NOT NULL,
	memail VARCHAR2(100),
	mprofile VARCHAR2(100), --프로필 이미지 경로를 저장할 칼럼
	maddr VARCHAR2(100),
	mregdate DATE
);

-- 사용자 시퀀스 설정
CREATE SEQUENCE mems_seq;

--등록된 상품 DB
CREATE TABLE goods(
	gnum NUMBER PRIMARY KEY, --글번호
	mid VARCHAR2(100), --작성자(로그인된 아이디)
	gtitle VARCHAR2(100) NOT NULL, --제목
	gcomment CLOB, --글 내용
	gcount NUMBER, --조회수
	gregdate DATE --글 작성일
);

--게시글의 번호를 얻어낼 시퀀스
CREATE SEQUENCE goods_seq;

-- 업로드된 파일의 정보를 저장할 테이블
CREATE TABLE goods_file(
   gfnum NUMBER PRIMARY KEY,
   mid VARCHAR2(100),
   gtitle VARCHAR2(100) NOT NULL,
   orgFileName VARCHAR2(100) NOT NULL, -- 원본 파일명
   saveFileName VARCHAR2(100) NOT NULL, -- 서버에 실제로 저장된 파일명
   fileSize NUMBER NOT NULL, -- 파일의 크기 
   gfregdate DATE
);

CREATE SEQUENCE goods_seq;

-- 이미지 겔러리를 만들기 위한 테이블 
CREATE TABLE board_gallery(
   num NUMBER PRIMARY KEY,
   writer VARCHAR2(100),
   caption VARCHAR2(100), -- 이미지에 대한 설명
   imagePath VARCHAR2(100), -- 업로드된 이미지의 경로  ex) /upload/xxx.jpg
   regdate DATE -- 이미지 업로드 날짜 
);

CREATE SEQUENCE board_gallery_seq;

