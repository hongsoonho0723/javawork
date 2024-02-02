package test.board;

public class MainApp {
	
	private BoardService boardService; //필드를 이용한 다형성
	private Board board; //필드를 이용한 다형성
	
	public MainApp() {
		//1.QA
		System.out.println("------------1. QA TEST 입니다---------");
		board = new QABoard(1,"java","희정","어렵다",false);
		boardService = new QABoardServiceImpl();
		
		this.test(boardService, board);
		
		//2.Upload
		System.out.println("*************2 Upload TEST 입니다 **************");
		
		board = new UploadBoard(2,"주말이다","삼순이","좋아용","a.jpg");
		boardService = new UploadBoardServiceImpl();
		
		this.test(boardService, board);
		
		//3.Free
		System.out.println("*************3 Free TEST 입니다 **************");
		board = new FreeBoard(30,"다형성","삼순이","어려워요");
		boardService = new FreeBoardServiceImpl();
		
		this.test(boardService, board);
	}
	
	/*
	 * 매개변수를 이용한 다형성
	 */
	public void test(BoardService boardService , Board board) {
		//1.등록
		int result = boardService.insert(board);
		
		//2.수정
		boolean b = boardService.update(board);
		
		//3.검색
		Board searchBoard = boardService.selectbyBno(board.getBno());
		
		
	}
	
	public static void main (String [] args) {
		System.out.println("********* Test Start **************");
		new MainApp();
		
	}
	
}
