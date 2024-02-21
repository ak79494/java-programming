import java.io.*;

class Child {

  public String stu_Name;

  Child(String stu_Name) {
    this.stu_Name = stu_Name;
  }
}

// Non-serializable class
public class Student24 implements java.io.Serializable {

  String stu_Addr;
  int stu_Id;
  Child child;

  public Student24(String stu_Addr, int stu_Id) {
    this.stu_Addr = stu_Addr;
    this.stu_Id = stu_Id;
  }
}
