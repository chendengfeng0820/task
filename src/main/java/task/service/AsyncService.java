package task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: cdf
 * @create: 2020-02-01 00:25
 **/
@Service
public class AsyncService {

//告诉spring这是一个异步方法
	@Async
	public void hello(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("数据处理中 ");
	}
}
