package test.board;
/*
 * 자료실에 관련된 비지니스 로직 담당...
 */
public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("UploadBoardServiceImpl의 insert call");
		return 1;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("UploadBoardServiceImpl의 update call");
		return true;
	}

	@Override
	public Board selectbyBno(int bno) {
		System.out.println("UploadBoardServiceImpl의 selectbyBno call");
		return null;
	}

}
