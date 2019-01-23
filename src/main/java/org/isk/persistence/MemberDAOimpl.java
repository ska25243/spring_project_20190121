package org.isk.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.isk.domain.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.isk.mapper.memberMapper";
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);

	}

}
