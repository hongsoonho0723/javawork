package test.board;

/*
 * 모든 게시판이 공통으로 사용하게될 메소드 정의(규격서)
 */

public interface BoardService {
	/*
	 * 등록하기
	 * @return : 0이면 실패, 1이상이면 등록성공.
	 * @param : QABoard or UploadBoard or FreeBoard 전달
	 */
	int insert(Board board); // QABoard , UploadBoard, FreeBoard 전부가능
	
	/*
	 * 수정하기(글번호에 해당하는 제목, 내용을 수정한다)
	 * @return : true이면 수정완료 ,false이면 수정 실패
	 * @param : QABoard or UploadBoard or FreeBoard 전달
	 */
	boolean update(Board board);
	
	  
	
	/*
	 * 글번호에 해당하는 게시물 조회하기
	 * @parm : 글번호
	 * @raturn :조회된 QABoard or UploadBoard or FreeBoard 전달
	 * 			조회된 결과가 없으면 null 리턴
	 */

	Board selectbyBno(int bno); //Board board도 가능 1개이기때문에 객체보다 int bno를 사용
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
