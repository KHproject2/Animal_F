package save;

import java.io.Serializable;

public class saveDto implements Serializable {

	private String user_name;	// 등록 이름
	private String user_id;		// 등록 아이디
	private String user_ph;		// 등록 폰넘버

	private String find_date;	// 찾은날짜
	private String find_pleace1;// 찾은 지역 1(도 단위)
	private String find_pleace2;// 찾은 지역 2(상세)

	private String animal_kind;	// 찾은 동물 중류
	private String animal_gender;// 동물 성별

	private String title;		// 게시글 제목
	private String content;		// 게시글 내용
	private String img_name;	// 게시글 첨부이미지 이름
	private String wdate;		// 게시글 작성일
	private int readcount;		// 조회수
	private int seq;			// 게시글 고유번호
	private int del;			// 게시글 삭제 여부

	
}