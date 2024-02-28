package app.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.mvc.common.DBManager;
import app.mvc.dto.BoardDTO;
import app.mvc.dto.ReplyDTO;
import app.mvc.exception.DMLException;
import app.mvc.exception.SearchWrongException;

public class BoardDAOImpl implements BoardDAO {
	
	private static BoardDAO instance = new BoardDAOImpl();
	
	private BoardDAOImpl() {}
	
	public static BoardDAO getInstance() {
		return instance;
	}
	

	@Override
	public List<BoardDTO> boardSelectAll() throws SearchWrongException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BoardDTO> list = new ArrayList();
		
		String sql = "select * from board order by board_no desc";
		
		try {
			con =DBManager.getConnection();
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardDTO board = new BoardDTO(
						rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				
				list.add(board);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SearchWrongException("DB에 문제가 있어 다시 진행해 주세요 ");
		}finally {
			DBManager.dbClose(con, ps, rs);
		}
		
		
		return list;
	}
//select * from board where subject like ?
	@Override
	public List<BoardDTO> boardSelectBySubject(String keyWord) throws SearchWrongException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BoardDTO> list = new ArrayList();
		
		String sql = "select * from board where subject like ?";
		try {
			con =DBManager.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, keyWord);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardDTO board = new BoardDTO(
						rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				
				list.add(board);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SearchWrongException("찾는 제목이 없습니다 ");
		}finally {
			DBManager.dbClose(con, ps, rs);
		}
		
		
		return list;
	}
		
//select * from board where board_no = ? 
	@Override
	public BoardDTO boardSelectByNo(int boardNo) throws SearchWrongException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from board where board_no = ? ";
		BoardDTO board = null;
		try {
			
			con= DBManager.getConnection();
			ps= con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			rs= ps.executeQuery();
			if(rs.next()) {
				board = new BoardDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				
				
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.dbClose(con, ps, rs);
		}
		return board;
			}
//insert into board (board_no, subject, writer, content, board_date) values (board_seq.nextval, ?, ?, ?, sysdate)

	@Override
	public int boardInsert(BoardDTO boardDTO) throws DMLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into board (board_no, subject, writer, content, board_date) values (board_seq.nextval, ?, ?, ?, sysdate)";
		
		
		
		
		return 0;
	}

	@Override
	public int boardUpdate(BoardDTO boardDTO) throws DMLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int boardDelete(int boardNo) throws DMLException {
		return 0;
	}

	@Override
	public int replyInsert(ReplyDTO replyDTO) throws DMLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardDTO replySelectByParentNo(int boardNo) throws SearchWrongException {
		return null;
	}
	
	
	/***
	 * 부모글에 해당하는 댓글정보 가져오기
	 * */
	private List<ReplyDTO> replySelect(Connection con ,int boardNo)throws SQLException{
		
		return null;
	}

}













