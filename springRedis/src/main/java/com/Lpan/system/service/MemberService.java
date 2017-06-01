package com.Lpan.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Lpan.system.dao.MemberDao;
import com.Lpan.system.model.Member;

/**
 * 
 * @author Administrator
 *
 */
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public int insert (Member m){
		return memberDao.insert(m);
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public int update (Member m){
		return memberDao.update(m);
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public void batchinsert (List<Member> m){
		 memberDao.batchinsert(m);
	}
	
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public void batchupdate (List<Member> m){
		 memberDao.batchupdate(m);
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public void batchdelete (List<Member> m){
		 memberDao.batchdelete(m);
	}
	
	
}
