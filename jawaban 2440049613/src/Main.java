import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	private static final Object Usergender = null;
	Scanner scan = new Scanner(System.in);
	Connect con = Connect.getConnection();
	ArrayList<Mask> arrMask= new ArrayList<>();
	Random rand = new Random();
	public void Menu() {
		
			System.out.println("menu");
			System.out.println("1.View All transaction"); 
			System.out.println("2.Buy Mask");	  
			System.out.println("3.Delete Transaction");	  
			System.out.println("4.Exit");	  
			
			int pilihan;
			
			pilihan=scan.nextInt();
			scan.nextLine();
			switch (pilihan) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("program closed");
				break;
			}
			

			
		}
	
	public void Load() {
		String query1 = "SELECT * FROM `organicmask`";
		ResultSet rs1 = con.executeQuery(query1);
		
		
		try {
			while (rs1.next()) {
				int Maskid=rs1.getInt(1);
				String MaskName=rs1.getString(2);
				String Type=rs1.getString(3);
				int MaskPrice=rs1.getInt(4);
				String Variant =rs1.getString(5);
				
				MaskPrice = (int) (MaskPrice - (MaskPrice * 0.05));
				
				
				arrMask.add(new OrganicMask(MaskName, Type, MaskPrice, Maskid, Variant));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		///////////////////////////SHEETMASK////////////////////////////
		
		String query2 = "SELECT * FROM `sheetmask`";
		ResultSet rs2= con.executeQuery(query2);
		
		try {
			while (rs2.next()) {
				int Maskid=rs2.getInt(1);
				String MaskName=rs2.getString(2);
				String Type=rs2.getString(3);
				int MaskPrice=rs2.getInt(4);
				String EssenceName =rs2.getString(5);
				
				MaskPrice = (int) (MaskPrice - (MaskPrice * 0.07));
				
				arrMask.add(new SheetMask(MaskName, Type, MaskPrice, Maskid, EssenceName));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public  void PrintLoad() {
		for (int i = 0; i < arrMask.size(); i++) {
			System.out.println("Item " + (i+1));
			arrMask.get(i).print();
		}
	}
	
	public void buy() {
		
		String username;
		String Gender;
		int Userage;
		
			System.out.println("input username [alphanumeric]: ");
			username = scan.nextLine();
			
			do {
				System.out.println("input gander [male][female] ");
				 Gender = scan.nextLine();
			} while (!Gender.equals("female")&&!Gender.equals("male"));
			
			System.out.println("Input user Age : ");
			Userage = scan.nextInt();
			
			PrintLoad();
			
			int choise = 0;
			do {
				System.out.println("choose mask 1-10");
				choise= scan.nextInt();
			} while (choise <1 || choise >10);
			choise = choise -1;
			int Maskid = arrMask.get(choise).getMaskid();
			int quantity = 0;
			
			do {
				System.out.println("input mask quantity more than 0");
				quantity= scan.nextInt();
	
			} while (quantity<0 || quantity == 0);
			int num = rand.nextInt((999-111)+111);
			String transid = "TR" + num;
			
			
			int totalPrice = quantity * arrMask.get(choise).getMaskPrice();
			Object nickname;
			String query = String.format("INSERT INTO `transaction` ('TransactionID','UserName','UserAge','UserGender')", transid, NickName,UserAge,Usergender);
			con.executeQuery(query);
			
			
	}
	
	
	
	public Main() {
		PrintLoad();
	}
	public static void main(String[] args) {
		
		new Main();
	}

}
