package com.mybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SessionTemplate {
	
	// mybatis 를 이용해서 DB 에 접근하는 클래스를 제공해주는 매소드
	public static SqlSession getSession() {
		// SqlSession 객체를 생성하는 방법
		// 1. SqlSessionFactoryBuilder 클래스를 생성 -> default 생성자
		//	- build()메소드를 이용 -> SqlSessionFactory 클래스를 가져옴
		//	- build()메소드의 매개변수로 mybatis-config.xml파일 전달
		// 2. SqlSessionFactory 클래스가 제공하는 openSession()메소드 이용
		//	- openSession()매개변수로 true/false -> autoCommit 에 대한 설정	
		SqlSession session = null;
		String configName = "mybatis-config.xml";
		
		try(InputStream is = Resources.getResourceAsStream(configName);){
//			SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
//			SqlSessionFactory sf = sfb.build(is);
//			session = sf.openSession(false);
			// 한줄요약~
			session = new SqlSessionFactoryBuilder().build(is).openSession(false); 
			// environments 에서 default로 설정된 환경으로 접속!!!!
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	
	// environment 에 등록한 default 말고, web session 을 가지고 와주는 메소드 ~! 
	public static SqlSession getSessionWeb() {
		// SqlSession 객체를 생성하는 방법
		// 1. SqlSessionFactoryBuilder 클래스를 생성 -> default 생성자
		//	- build()메소드를 이용 -> SqlSessionFactory 클래스를 가져옴
		//	- build()메소드의 매개변수로 mybatis-config.xml파일 전달
		// 2. SqlSessionFactory 클래스가 제공하는 openSession()메소드 이용
		//	- openSession()매개변수로 true/false -> autoCommit 에 대한 설정	
		SqlSession session = null;
		String configName = "mybatis-config.xml";
		
		try(InputStream is = Resources.getResourceAsStream(configName);){
//			SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
//			SqlSessionFactory sf = sfb.build(is);
//			session = sf.openSession(false);
			// 한줄요약~
			session = new SqlSessionFactoryBuilder().build(is,"web").openSession(false); 
			// environments 에서 default로 설정된 환경으로 접속!!!!
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	
	
}
