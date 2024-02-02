package test.board;

public class UploadBoard extends Board {

	
	private String fileName;// 첨부파일

	
	public UploadBoard() {};
	
	public UploadBoard(int bno, String subject, String writer, String content, String fileName) {
		super(bno, subject, writer, content);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UploadBoard [fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}


	
	
	
	
	
}
