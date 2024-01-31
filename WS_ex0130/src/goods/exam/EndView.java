package goods.exam;
/**
  요청 결과를 출력할 view
*/
public class EndView{
   /**
     성공여부 메시지를 출력하는 메소드 
   */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
     전체검색 결과를 출력하는 메소드
   */
   public static void printSelectAll(Goods [] arr){//service에 있는 주소가 전달되었다.
	  System.out.println("------상품LIST("+GoodsService.count+")개---------");
	   for(int i=0; i < GoodsService.count ; i++ ) {
		  Goods goods = arr[i];
		  System.out.print(goods.getCode() +" | ");
		  System.out.print(goods.getName() +" | ");
		  System.out.print(goods.getPrice() +" | ");
		  System.out.print(goods.getExplain() +"\n");
	  }
	   System.out.println();

   }

   /**
     상품코드에 해당하는 상세정보 출력하는 메소드 
   */
   public static void printSelectByCode(Goods goods){
	      System.out.println("*******"+goods.getCode() +"의 상품 정보입니다.^^ ");
		  System.out.print(goods.getName() +" | ");
		  System.out.print(goods.getPrice() +" | ");
		  System.out.print(goods.getExplain() +"\n");
   }


}