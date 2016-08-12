package com.xie.pojos;


import java.util.HashSet;
import java.util.Set;


/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student  implements java.io.Serializable {


    // Fields    

     private int sid;
     private String name;
     private String sname;
     private String password;
     private String school;
     private int tel;
     private Set journals = new HashSet(0);


    // Constructors

    /** default constructor */
    public Student() {
    }

	/** minimal constructor */
    public Student(String name, String sname, String password, String school, int tel) {
        this.name = name;
        this.sname = sname;
        this.password = password;
        this.school = school;
        this.tel = tel;
    }
    
    /** full constructor */
    public Student(String name, String sname, String password, String school, int tel, Set journals) {
        this.name = name;
        this.sname = sname;
        this.password = password;
        this.school = school;
        this.tel = tel;
        this.journals = journals;
    }

   
    // Property accessors

    public int getSid() {
        return this.sid;
    }
    
    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return this.sname;
    }
    
    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchool() {
        return this.school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }

    public int getTel() {
        return this.tel;
    }
    
    public void setTel(int tel) {
        this.tel = tel;
    }

    public Set getJournals() {
        return this.journals;
    }
    
    public void setJournals(Set journals) {
        this.journals = journals;
    }
   








}