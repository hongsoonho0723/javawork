package test.board;
/*
 *자유게시판에 관련된 Business Logic 담당 
 */

public class FreeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {

		// 기능
		System.out.println(super.getClass().getSimpleName() + "의 insert 기능입니다...");

		return 1;
	}

	@Override
	public boolean update(Board board) {
		// 기능
		System.out.println(super.getClass().getSimpleName() + "의 update 기능입니다...");
		return true;
	}

	@Override
	public Board selectbyBno(int bno) {
		// 기능
		System.out.println(super.getClass().getSimpleName() + "의 selectByBno 기능입니다...");
		return null;
	}

}
