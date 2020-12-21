package com.oop.movie.model.entity;

import java.util.Calendar;

/**
 * @실습문제1 : 영화클래스 만들기
- 클래스명 : com.oop.movie.model.entity.Movie.java
- 멤버변수 : 반드시 캡슐화를 적용할 것
    - movieTitle : String                   //영화제목
    - director : String                     //감독이름
    - casting : String[]                    //출연배우 최대5명까지
    - release : Calendar                    //개봉일
- 각 멤버변수별 getter, setter
- 영화정보를 담은 information():String
- 파라미터 생성자.
    1. movieTitle
    2. movieTitle, director
    3. movieTitle, director, casting
    4. movieTitle, director, casting, release
생성자간 생성자호출 this()를 활용할 것.
영화4편을 각각의 생성자를 통해 생성한 후에 출력한다.
 *
 */
public class Movie {
	private String movieTitle;
	private String director;
	private String[] casting;
	private Calendar release;
	
	
	public String information() {
		
		Calendar cal = Calendar.getInstance();
		String str = "";
		
		if(movieTitle != null) {
			str += "제목 : " + movieTitle;
		}
		if(director != null) {
			str += " / 감독 : " + director;
		}
		if(casting != null) {
			str += " / 출연진 : ";
			for(int i = 0; i < casting.length; i++) {
				str += casting[i] + " ";
			}
		}
		if(release != null) {
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int day = cal.get(Calendar.DAY_OF_MONTH);
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			int min = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			
			str += " / 개봉일 : " + year + "년 " + month + "월 " + day + "일";
		}
		
		return str;
	}
	
	public Movie() {
		
	}
	
	public Movie(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	public Movie(String movieTitle, String director) {
		this(movieTitle);
		this.director = director;
	}

	public Movie(String movieTitle, String director, String[] casting) {
		this(movieTitle, director);
		this.casting = casting;
	}
	
	public Movie(String movieTitle, String director, String[] casting, Calendar release) {
		this(movieTitle, director, casting);
		this.release = release;
	}
	
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String[] getCasting() {
		return casting;
	}
	public void setCasting(String[] casting) {
		this.casting = casting;
	}
	public Calendar getRelease() {
		return release;
	}
	public void setRelease(Calendar release) {
		this.release = release;
	}
	
	
	
}

