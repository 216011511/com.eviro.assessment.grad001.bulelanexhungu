import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class SavingsAccount {
	private BigDecimal user1Balance=new BigDecimal("2000");
	private BigDecimal user2Balance=new BigDecimal("5000");
	private String user1AccountNum="1";
	private String user2AccountNum="2";
	private String user1Id="101";
	private String user2Id="102";
	
	SavingsAccount(){
		
	}
	
	SavingsAccount(BigDecimal aUser1Balance,BigDecimal aUser2Balance,String aUser1AccountNum,String aUser2AccountNum,String aUser1Id,String aUser2Id){
		
		user1Balance=aUser1Balance;
		user2Balance=aUser2Balance;
		user1AccountNum=aUser1AccountNum;
		user2AccountNum=aUser2AccountNum;
		user1Id=aUser1Id;
		user2Id=aUser2Id;
		
	}
	void setUser1Balance(BigDecimal user1Bal) {
		user1Balance=user1Bal;
	}
	void setUser2Balance(BigDecimal user2Bal) {
		user2Balance=user2Bal;
	}
	void setUser1AccountNum(String user1AccNum) {
		user1AccountNum=user1AccNum;
	}
	void setUser2AccountNum(String user2AccNum) {
		user2AccountNum=user2AccNum;
	}
	void setUser1Id(String usr1Id) {
		user1Id=usr1Id;
	}
	void setUser2Id(String usr2Id) {
		user2Id=usr2Id;
	}
	BigDecimal getUser1Balance() {
		return user1Balance;
	}
	BigDecimal getUser2Balance() {
		return user2Balance;
	}
	String getUser1AccountNum() {
		return user1AccountNum;
	}
	String getUser2AccountNum() {
		return user2AccountNum;
	}
	String getUser1Id() {
		return user1Id;
	}
	String getUser2Id() {
		return user2Id;
	}


}
