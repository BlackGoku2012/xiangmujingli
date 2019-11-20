package tech.aistar.pojo;

import java.util.Date;

public class Student {

//	stuNo number primary key,
	private int stuNo;
//    stuName nvarchar2(10) not null,
	private String stuName;
//    stuBirthday date,
	private Date stuBirthday;
//    stuSex Nchar(1) default '��',
	private String stuSex;
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stuAddress == null) ? 0 : stuAddress.hashCode());
		result = prime * result + ((stuBirthday == null) ? 0 : stuBirthday.hashCode());
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		result = prime * result + stuNo;
		result = prime * result + ((stuSex == null) ? 0 : stuSex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stuAddress == null) {
			if (other.stuAddress != null)
				return false;
		} else if (!stuAddress.equals(other.stuAddress))
			return false;
		if (stuBirthday == null) {
			if (other.stuBirthday != null)
				return false;
		} else if (!stuBirthday.equals(other.stuBirthday))
			return false;
		if (stuName == null) {
			if (other.stuName != null)
				return false;
		} else if (!stuName.equals(other.stuName))
			return false;
		if (stuNo != other.stuNo)
			return false;
		if (stuSex == null) {
			if (other.stuSex != null)
				return false;
		} else if (!stuSex.equals(other.stuSex))
			return false;
		return true;
	}
@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuBirthday=" + stuBirthday + ", stuSex="
				+ stuSex + ", stuAddress=" + stuAddress + "]";
	}
public Student() {
	super();
}
public Student(int stuNo, String stuName, Date stuBirthday, String stuSex, String stuAddress) {
	super();
	this.stuNo = stuNo;
	this.stuName = stuName;
	this.stuBirthday = stuBirthday;
	this.stuSex = stuSex;
	this.stuAddress = stuAddress;
}
//    stuAddress nvarchar2(50)
	private String stuAddress;
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Date getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
}
