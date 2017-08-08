package findanimal;

/*
drop table findanimal
cascade constraint;

create table findanimal(
	SEQ NUMBER(8) PRIMARY KEY,
	READCOUNT NUMBER(8) NOT NULL,
	ID VARCHAR2(50) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	PHONE VARCHAR2(50) NOT NULL,
	WDATE DATE NOT NULL,
	TITLE VARCHAR2(200) NOT NULL,
	CONTENT VARCHAR2(4000) NOT NULL,
	A_NAME VARCHAR2(50) NOT NULL,
	A_IMG VARCHAR2(200) NOT NULL,
	MONEY NUMBER(15),
	L_DATE VARCHAR2(200) NOT NULL,
	L_PALCE VARCHAR2(200) NOT NULL,
	GENDER VARCHAR2(200) NOT NULL
)

*/

import java.io.Serializable;

public class findanimalDto implements Serializable {
	
	private int seq;			// sequence 번호
	private int readcount;		// 조회수
	
	private String id;			// 사용자 ID
	private String name;		// 사용자 이름
	private String phone;		// 사용자가 회원정보창에 등록한 핸드폰 번호
	
	private String wdate;		// 글 작성일
	private String title;		// 글 제목
	private String content;		// 글 내용
	private int del;			// 글 삭제 여부
	
	private String a_name;		// 사용자가 회원정보창에 등록한 동물이름 또는
	private String a_img;		// 등록한 이미지 이름
	private int money;			// 사례금
	private String l_date;		// 동물을 잃어버린 날짜 시간
	private String l_place;		// 동물을 잃어버린 장소 지역명(도시까지는 초이스 그 후는 수기입력)
	private String gender;		// 잃어버린 동물의 성별
	
	public findanimalDto() {}

	public findanimalDto(int seq, int readcount, String id, String name, String phone, String wdate, String title,
			String content, int del, String a_name, String a_img, int money, String l_date, String l_place,
			String gender)
	
	{
		this.seq = seq;
		this.readcount = readcount;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.wdate = wdate;
		this.title = title;
		this.content = content;
		this.del = del;
		this.a_name = a_name;
		this.a_img = a_img;
		this.money = money;
		this.l_date = l_date;
		this.l_place = l_place;
		this.gender = gender;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_img() {
		return a_img;
	}

	public void setA_img(String a_img) {
		this.a_img = a_img;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getL_date() {
		return l_date;
	}

	public void setL_date(String l_date) {
		this.l_date = l_date;
	}

	public String getL_place() {
		return l_place;
	}

	public void setL_place(String l_place) {
		this.l_place = l_place;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "findanimalDto [seq=" + seq + ", readcount=" + readcount + ", id=" + id + ", name=" + name + ", phone="
				+ phone + ", wdate=" + wdate + ", title=" + title + ", content=" + content + ", del=" + del
				+ ", a_name=" + a_name + ", a_img=" + a_img + ", money=" + money + ", l_date=" + l_date + ", l_place="
				+ l_place + ", gender=" + gender + "]";
	}
}
