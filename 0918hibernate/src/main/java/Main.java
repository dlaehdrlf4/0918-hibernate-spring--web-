import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pk.dao.GoodDao;
import com.pk.domain.Good;

public class Main {
	public static void main(String [] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		GoodDao dao = context.getBean(GoodDao.class);
		
//		Good good = new Good();
//		good.setCode(8);
//		good.setName("슬렉스");
//		good.setPrice(17000);
//		good.setDescription("예사롭지않다.");
//		
//		//밑에꺼는 삽입
//		//dao.insertGood(good);
//		// 밑에꺼는 업데이트
//		dao.updateGood(good);
//		
////		// 밑에는 삭제가 
////		dao.deleteGood(good);
////		
//		
	List<Good> list = dao.list();
	
	for(Good good : list) {
		System.out.println(good);
	}
		
	//데이터 1개 가져오기
	System.out.println("================");
	System.out.println(dao.get(1));
	System.out.println(dao.get(12));
	
		context.close();
		
	}
}
