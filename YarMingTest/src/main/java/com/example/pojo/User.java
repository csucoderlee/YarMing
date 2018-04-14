package com.example.pojo;

public class User {
    private Integer empid;
    private String ename;
    private String hiredate;
    private int photo;

    public User() {

    }

    public User(Integer empid, String ename, String hiredate, int photo) {
        this.empid = empid;
        this.ename = ename;
        this.hiredate = hiredate;
        this.photo = photo;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", photo=" + photo +
                '}';
    }
}
