package mvc.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import mvc.dto.Electronics;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;
import mvc.service.ElectronicsService;
import mvc.service.ElectronicsServiceImpl;
import mvc.view.FailView;
import mvc.view.SuccessView;

/**
 * View와 Model 사이에서 중간 역할 : 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고 호출한 결과를 받아서 결과값에 따라
 * 결과 뷰를 호출해준다.
 */

public class ElectronicsController {
	private ElectronicsService service = ElectronicsServiceImpl.getInstance();

	/**
	 * 전체검색
	 */
	public void selectAll() {
		//service.selectAll();
		List<Electronics> sortList = service.selectAll();
		SuccessView.printAll(sortList);

	}

	/**
	 * 전자제품 등록
	 * 
	 * @throws SearchNotFoundException
	 * @throws ElectronicsArrayBoundsException
	 */

	public void insert(Electronics electronics) {

		try {
			SuccessView.printSearchByModelNo(electronics);
			service.insert(electronics);

		} catch (ElectronicsArrayBoundsException e) {
			FailView.errorMessage(e.getMessage());
		}

	}

	/**
	 * 모델번호에 해당하는 전자제품 검색
	 * 
	 * @param modelNo
	 */
	public void searchByModelNo(int modelNo) {
		// 서비스를 호출하고 그결과를 받아서 성공또는 실패로 이동한다

		try {
			Electronics electronics = service.searchByModelNo(modelNo);
			SuccessView.printSearchByModelNo(electronics);

			service.searchByModelNo(modelNo);
		} catch (SearchNotFoundException e) {
			// 예외가 발생
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 모델번호에 해당하는 전자제품 수정하기
	 * 
	 * @param electronics
	 * 
	 */
	public void update(Electronics electronics) {

		try {
			SuccessView.printSearchByModelNo1(electronics);
		//	SuccessView.printSearchByModelNo(electronics.getModelNo()+"의 내용이 수정되었습니다");

			service.update(electronics);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 모델번호에 해당하는 전자제품 삭제하기
	 * 
	 * @param electronics
	 */
	public void deleteModelNo(int modelNo) {
		try {
			service.delete(modelNo);
			SuccessView.printMessage("삭제 성공");
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(modelNo + "는 없는 번호로 삭제할 수 없습니다");
		}

	}

	/**
	 * 가격을 기준으로 정렬하기 만약, 가격이 같으면 modelNo를 기준으로 정렬한다.
	 * 
	 * @return
	 */
	public void selectSortByPrice() {
		List<Electronics> sortList = service.selectSortByPrice();
		SuccessView.printAll(sortList);

	}
	
	
	
	public void saveObject() {
		
		try {
			service.saveObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
