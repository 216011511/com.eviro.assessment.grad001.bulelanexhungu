import java.math.BigDecimal;
import java.util.HashMap;

public class CurrentAccount {
	
	private BigDecimal user3Balance=new BigDecimal("1000");
	private BigDecimal user4Balance=new BigDecimal("-5000");
	private String user3AccountNum="3";
	private String user4AccountNum="4";
	private String user3Id="103";
	private String user4Id="104";
	private BigDecimal user3Overdraft=new BigDecimal("10000");
	private BigDecimal user4Overdraft=new BigDecimal("20000");
	
	CurrentAccount(){
		
	}
	
	CurrentAccount(BigDecimal aUser3Balance,BigDecimal aUser4Balance,String aUser3AccountNum,String aUser4AccountNum,String aUser3Id,String aUser4Id,BigDecimal aUser3Overdraft,BigDecimal aUser4Overdraft){
		
		user3Balance=aUser3Balance;
		user4Balance=aUser4Balance;
		user3AccountNum=aUser3AccountNum;
		user4AccountNum=aUser4AccountNum;
		user3Id=aUser3Id;
		user4Id=aUser4Id;
		user3Overdraft=aUser3Overdraft;
		user4Overdraft=aUser4Overdraft;
		
	}
	void setUser3Balance(BigDecimal user3Bal) {
		user3Balance=user3Bal;
	}
	void setUser4Balance(BigDecimal user4Bal) {
		user4Balance=user4Bal;
	}
	void setUser3AccountNum(String user3AccNum) {
		user3AccountNum=user3AccNum;
	}
	void setUser4AccountNum(String user4AccNum) {
		user4AccountNum=user4AccNum;
	}
	void setUser3Id(String usr3Id) {
		user3Id=usr3Id;
	}
	void setUser4Id(String usr4Id) {
		user4Id=usr4Id;
	}
	void setUser3Overdraft(BigDecimal usr3Overdraft) {
		user3Overdraft=usr3Overdraft;
	}
	void setUser4Overdraft(BigDecimal usr4Overdraft) {
		user4Overdraft=usr4Overdraft;
	}
	BigDecimal getUser3Balance() {
		return user3Balance;
	}
	BigDecimal getUser4Balance() {
		return user4Balance;
	}
	String getUser3AccountNum() {
		return user3AccountNum;
	}
	String getUser4AccountNum() {
		return user4AccountNum;
	}
	String getUser3Id() {
		return user3Id;
	}
	String getUser4Id() {
		return user4Id;
	}
	BigDecimal getUser3Overdrsft() {
		return user3Overdraft;
	}
	BigDecimal getUser4Overdrsft() {
		return user4Overdraft;
	}
	
}
