package com.Lpan.system.dao;

import java.util.List;

import com.Lpan.system.model.Member;

/**
 * 
 * @author Administrator
 *
 */
public interface MemberDao {
	/**
	 * 
	 * @param m
	 * @return
	 */
	int insert (Member m);
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	int update (Member m);
	
	/**
	 * 
	 * @param lm
	 */
	void batchinsert(List<Member> lm);
	
	/**
	 * 
	 * @param lm
	 */
	void batchupdate(List<Member> lm);
	
	/**
	 * 
	 * @param lm
	 */
	void batchdelete(List<Member> lm);
}
