package org.isk.web;

import javax.inject.Inject;

import org.isk.domain.MemberVO;
import org.isk.persistence.MemberDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}	
			)
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setId("user02");
		vo.setEmail("111@naver.com");
		vo.setPassword("123");
		vo.setUser_name("11111111");
		
		dao.insertMember(vo);
	}
}


