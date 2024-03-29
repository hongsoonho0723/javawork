package mvc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스 : 싱글톤 클래스로 만든다 (private 생성자 , 자기 자신 맴버에서 생성 , 현재 객체를
 * 리턴하는 static 메소드제공)
 */

public class ElectronicsServiceImpl implements ElectronicsService {

	private static ElectronicsService instance = new ElectronicsServiceImpl();
	private static final int MAX_SIZE = 10;
	List<Electronics> list = new ArrayList<Electronics>();

	/**
	 * 외부에서 객체 생성안됨. InitInfo.properties파일을 로딩하여 List에 추가하여 초기치 데이터를 만든다.
	 * 
	 */
	private ElectronicsServiceImpl() {

		ResourceBundle rb = ResourceBundle.getBundle("mvc.service/InitInfo");
		for (String key : rb.keySet()) {
			String value = rb.getString(key);
			// System.out.println(key+" = "+ value);
			String v[] = value.split(",");// 콤마를 기준으로 분리해서 배열로 리턴
			list.add(new Electronics(Integer.parseInt(v[0]), v[1], Integer.parseInt(v[2]), v[3]));

		}
		System.out.println(list);
	}

	public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public List<Electronics> selectAll() {

		System.out.println(list);

		return list;

	}

	@Override
	public void insert(Electronics electronics) throws ElectronicsArrayBoundsException {

		if (MAX_SIZE > list.size()) {

			list.add(electronics);

		} else {
			throw new ElectronicsArrayBoundsException("배열의 길이를 초과했습니다");
		}
		;

		System.out.println(list.size());
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for (Electronics e : list) {
			if (e.getModelNo() == modelNo) {
				// 찾았다
				return e;
			}

		}
		throw new SearchNotFoundException(modelNo + "는 없는 모델번호로 검색할 수 없습니다");

	}

	// 원래 번호no 바뀔 내용
	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		Electronics el = searchByModelNo(electronics.getModelNo());
		el.setModelDetail(electronics.getModelDetail());

	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		list.remove(searchByModelNo(modelNo));
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		List<Electronics> sortList = new ArrayList<Electronics>(list);

		Collections.sort(sortList, new Comparator<Electronics>() {
			@Override
			public int compare(Electronics o1, Electronics o2) {

				if (o1.getModelPrice() == o2.getModelPrice()) {
					return o1.getModelNo() - o2.getModelNo();
				}
				return o1.getModelPrice() - o2.getModelPrice();
			}
		});

		return sortList;
	}

} // 클래스 끝