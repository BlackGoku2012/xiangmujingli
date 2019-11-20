package tech.aistar.dao;


import tech.aistar.pojo.Student;

import java.util.ArrayList;

public interface IStudentDao {

	/**
	 *   ���ѧ�������ݿ���ӹ���
	 * @param stu  ����ѧ������
	 * @return   true ��ӳɹ�  falseʧ��
	 */
	public boolean insertStudent(Student stu);
	

	/**
	 *   ���ѧ�������ݿ��޸Ĺ���
	 * @param stu  ����ѧ������
	 * @return   true �޸ĳɹ�  falseʧ��
	 */
	public boolean updateStudent(Student stu);
	
	/**
	 * 
	 * @param stuNo ���ָ��ѧԱ��ѧ��ɾ��
	 * @return
	 */
	public boolean deleteStudent(int stuNo);
	
	/**
	 *   �õ����е�ѧ����Ϣ
	 * @return  
	 */
	public ArrayList<Student> getAllStudent();
	
	/**
	 * 
	 * @param stuNo  ����ѧ�ţ��õ�ѧ������
	 * @return
	 */
	public Student getStudentByStuNo(int stuNo);
	
	/**
	 * 
	 * @param sql  sql���
	 * @return  ����ѧ������
	 */
	public ArrayList<Student>  getStudentBySql(String sql);
	
}
