//package book;
//
//
//
//import javax.print.DocFlavor.STRING;
//
//public class Book {
//	String Book_id;
//	String Book_name;
//	String Book_author;
//	String Book_press;
//	String Book_total;
//	int Total;
//	String rest;
//	String[] Brw_person;
//	String[] Brw_state;
//	//String Remark;
//	//String location;
//
//	public Book(String bnumber,String bname,String bauthor,String bpress,String btotal,
//			String brest,String bremark/*,String blocation*/) {
//		Book_id=bnumber;
//		Book_name=bname;
//		Book_author=bauthor;
//		Book_press=bpress;
//		Book_total=btotal;
//		rest=brest;
//		//Remark=bremark;
//		//location=blocation;
//
//	}
//	public Book() {
//
//	}
//	public void setBook(String bnumber,String bname,String bauthor,String bpress,String btotal,
//			String brest,String bremark) {
//		Book_id=bnumber;
//		Book_name=bname;
//		Book_author=bauthor;
//		Book_press=bpress;
//		Book_total=btotal;
//		rest=brest;
//		//Remark=bremark;
//
//
//	}
//	public void setBook(String[][] x,int i) {
//		Book_id=x[i][0];
//		Book_name=x[i][1];
//		Book_author=x[i][2];
//		Book_press=x[i][3];
//		Book_total=x[i][4];
//		rest=x[i][5];
//		//Remark=x[i][6];
//
//	}
//	public void setBook(String[] x) {
//		Book_id=x[0];
//		Book_name=x[1];
//		Book_author=x[2];
//		Book_press=x[3];
//		Book_total=x[4];
//		rest=x[5];
//		//Remark=x[6];
//
//	}
//	public Book(String[] x) {
//		Book_id=x[0];
//		Book_name=x[1];
//		Book_author=x[2];
//		Book_press=x[3];
//		Book_total=x[4];
//		rest=x[5];
//		//Remark=x[6];
//
//
//	}
//	public Book(String[][] x,int i) {
//		Book_id=x[i][0];
//		Book_name=x[i][1];
//		Book_author=x[i][2];
//		Book_press=x[i][3];
//		Book_total=x[i][4];
//		rest=x[i][5];
//		//Remark=x[i][6];
//
//	}
//	public void getbook(String[] x) {
//		x[0]=Book_id;
//		x[1]=Book_name;
//		x[2]=Book_author;
//		x[3]=Book_press;
//		x[4]=Book_total;
//		x[5]=rest;
//		//x[6]=Remark;
//
//	}
//	public void getbook(String[][] x,int i) {
//		x[i][0]=Book_id;
//		x[i][1]=Book_name;
//		x[i][2]=Book_author;
//		x[i][3]=Book_press;
//		x[i][4]=Book_total;
//		x[i][5]=rest;
//		//x[i][6]=Remark;
//
//	}
//
//}
//
