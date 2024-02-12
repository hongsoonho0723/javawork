package HW0207;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto {
	 public static void main(String[] args) {
	        List<Integer> lottoNumbers = generateLottoNumbers();
	        Collections.sort(lottoNumbers);
	        System.out.println("로또 번호: " + lottoNumbers);
	    }

	    public static List<Integer> generateLottoNumbers() {
	        List<Integer> lottoNumbers = new ArrayList<>();
	        Random random = new Random();

	        while (lottoNumbers.size() < 6) {
	            int randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 숫자 중 랜덤 선택
	           
	            for(Integer list : lottoNumbers) {
	            	if(list.equals(randomNumber)) {
	            		
	            		
	            	}
	            	
	            }
	            
	            
	            
	        }

	        return lottoNumbers;
	    }
	}