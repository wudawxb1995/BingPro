package ConObj;
/*
 * ����һ���־û��� ��Ա�� Member
 * 
 **/
public class Member {
	private Integer id; //���� id
    private String department; //����
    private Integer ManageLevel; //����
    
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
