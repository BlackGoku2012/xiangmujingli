package tech.aistar.dao;


import tech.aistar.pojo.User;

public interface IUserDao {

	/**
	 * 
	 * @param userName  ��¼��
	 * @param userPwd   ����
	 * @return userΪnull��ʾû�в鵽�����Է���user����
	 */
	public User getUser(String userName, String userPwd);
	
}
