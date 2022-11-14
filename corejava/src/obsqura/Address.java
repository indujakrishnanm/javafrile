package obsqura;
public class Address {
String add="abc street ";
	void getaddress() {
		System.out.println("student address "+add);
	}

	public static void main(String[] args) {
		 Address  address=new  Address(); 
		 Student student =new Student();//Aggregation
		 student.getdata();
		 address.getaddress();
	

	}

}
