package collections;

public class Employeepojo {


		 private int id;
		 private String name;
		 private float salary;
         private int deptno;
         private String location;
         
         private int getid() {
            return id;
	      }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
}


