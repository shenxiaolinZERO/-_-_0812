package com.xie.pojos;


import java.util.Date;


/**
 * Journal entity. @author MyEclipse Persistence Tools
 */

public class Journal  implements java.io.Serializable {


    // Fields    

     private int jid;
     private Student student;
     private String titel;
     private String detail;
     private Date ltime;


    // Constructors

    /** default constructor */
    public Journal() {
    }

    
    /** full constructor */
    public Journal(Student student, String titel, String detail, Date ltime) {
        this.student = student;
        this.titel = titel;
        this.detail = detail;
        this.ltime = ltime;
    }

   
    // Property accessors

    public int getJid() {
        return this.jid;
    }
    
    public void setJid(int jid) {
        this.jid = jid;
    }

    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    public String getTitel() {
        return this.titel;
    }
    
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDetail() {
        return this.detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getLtime() {
        return this.ltime;
    }
    
    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }
   








}