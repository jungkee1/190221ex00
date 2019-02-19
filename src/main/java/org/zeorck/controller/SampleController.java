package org.zeorck.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;



@Controller
@RequestMapping("/sample/*") //sample�� Ÿ�� ���� ����
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class); //lombok log ������ ��ӳ��� homeController���� �����ͼ� �̸��� �ٲ�
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		logger.info(""+dto);
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(String name, int age) {
		logger.info("name:" + name);
		logger.info("age:" + age);
		return "ex02";
	}
	
	@GetMapping("/ex021")
	public String ex021(@RequestParam("name") String names, int age) { //���� �޴� �������� ���� �Ë� �̸��̶� ��ġ�ؾ߸� �ڵ����� ������ �׷��� �ٸ��� �������� @RequestParam�� �������
		logger.info("name:" + names);
		logger.info("age:" + age);
		return "ex021";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(String[] ids) { //String[] ids ==> ArrayList<String> ids �� ���� ���� �ִ� 
		logger.info("ids:" + ids);
		for(int i=0;i<ids.length;i++) {
			logger.info("ids" + i + ":" + ids[i]);
		}
		return "ex02List";
	}
	
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, int page) { //dto�� �ִ� ��ü�� ���⼭ "Model model" �޾Ƽ� model.addAttribute("dto",dto)�� �Ƚᵵ jsp���ϱ��� ���� �Ѿ�� �θ��� ù���ڸ� �ҹ��ڷ� �θ����. page�� �ȸ��� �ȳѾ����(����� �ѱ� �� ����)
		logger.info(""+dto); 			//"" ���� �տ� ���߸� ���� ������ �𸣰�����
		logger.info("page:" + page);
		return "ex04";
	}
	
	@GetMapping("/ex041")
	public String ex041(SampleDTO dto, @ModelAttribute("page")int page) { //ex04�� ����� �̷��� �׳� �ٷ� @ModelAttibute�ؼ� "page"�� ���� �� ����
		logger.info(""+dto); 			
		logger.info("page:" + page);
		return "ex04";
	}
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {  //@ResponseBody�� ���� ����� return�� �ѱ����� ��ü(JSON)�� ���� �� �ִ�(JACKSON databind�� maven repository���� �����ͼ� �߰��ϰ� �ؾ� JSONó�� ����)
		SampleDTO dto = new SampleDTO();
		dto.setAge(20);
		dto.setName("ȫ�浿");
		return dto; 		//return dto; �̷��� return�ϰ� �Ǹ� dto.jsp�� ���⶧���� ������ �׷��� ���� @ResponseBody ����
	}
	
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07() {  //ResponseEntity �߰����� ������ �� �� �� ����Ѵ�.. OK �� ���� ���� ������ "�˻�"�ؼ� network ���� header�� ���� ǥ�õ�
		logger.info("/ex07........");
		//{"name":"ȫ�浿"}
		String msg = "{\"name\":\"ȫ�浿\"}"; // "" �� ���� \�� �ϰ� ����� "��ü�� ��� ����
		HttpHeaders header = new HttpHeaders();
		header.add("Content-type","application/json;charset=UTF-8"); //�ѱ� encoding 
		return new ResponseEntity<>(msg,header,HttpStatus.OK); 		//return dto; �̷��� return�ϰ� �Ǹ� dto.jsp�� ���⶧���� ������ �׷��� ���� @ResponseBody ����
	}

}
