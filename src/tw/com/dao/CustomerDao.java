package tw.com.dao;

public interface CustomerDao {

	// 驗證名稱
	public int getUserNameCheck(String username, int i);

	// 驗證密碼
	public int getUserPassCheck(String password, int i);

	// 驗證帳+密
	public int getLoginCheck(String username, String password, int i);
	
}
