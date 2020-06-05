package tw.com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tw.com.dao.CustomerDao;
import tw.com.dbutils.DBConnectionUtils;

public class CustomerDaoImpl implements CustomerDao {

	//驗證帳+密
	@Override
	public int getLoginCheck(String username, String password, int i) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnectionUtils.getDB().getConnection();
			String sql = "select id from customer where username=? and password=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();

			if (rs.next()) {
				int count = rs.getInt(1);
				if (count > 0)
					i += 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBConnectionUtils.getDB().getclose(rs);
			DBConnectionUtils.getDB().getclose(ps);
			DBConnectionUtils.getDB().getclose(conn);
		}
		return i;
	}

	//驗證名稱
	@Override
	public int getUserNameCheck(String username, int i) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnectionUtils.getDB().getConnection();
			String sql = "select id from customer where username=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();

			if (rs.next()) {
				int count = rs.getInt(1);
				if (count > 0)
					i += 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBConnectionUtils.getDB().getclose(rs);
			DBConnectionUtils.getDB().getclose(ps);
			DBConnectionUtils.getDB().getclose(conn);
		}
		return i;
	}

	//驗證密碼
	@Override
	public int getUserPassCheck(String password, int i) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnectionUtils.getDB().getConnection();
			String sql = "select id from customer where password=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, password);
			rs = ps.executeQuery();

			if (rs.next()) {
				int count = rs.getInt(1);
				if (count > 0)
					i += 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBConnectionUtils.getDB().getclose(rs);
			DBConnectionUtils.getDB().getclose(ps);
			DBConnectionUtils.getDB().getclose(conn);
		}
		return i;
	}

}
