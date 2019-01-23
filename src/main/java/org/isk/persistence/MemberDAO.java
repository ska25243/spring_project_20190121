package org.isk.persistence;

import org.isk.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
