package com.yash.springcore.assignments.Ques4;

public class Department {
    int dId;
    String dName;

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Department [dId=" + dId + ", dName=" + dName + "]";
    }
}
