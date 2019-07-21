package ConObj;
/*
 * 创建一个持久化类 成员类 Member
 * 
 **/
public class Member {
	private Integer id; //主键 id
    private String department; //姓名
    private Integer ManageLevel; //描述
    
//    @Override
//    public String toString() {
//        return "Member{" +
//                "id=" + id +
//                ", department='" + department + '\'' +
//                ", ManageLevel='" + ManageLevel + '\'' +
//                '}'+'\n';
//    }
    
    public Integer getId() {
    	return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public Integer getManageLevel() {
        return ManageLevel;
    }

    public void setManageLevel(Integer ManageLevel) {
        this.ManageLevel = ManageLevel;
    }

}
