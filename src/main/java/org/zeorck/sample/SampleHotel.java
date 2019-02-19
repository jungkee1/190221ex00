package org.zeorck.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class SampleHotel {
	@NonNull //Null �ƴҶ� ��ü�� ����� �޶�
	private Chef chef;
	private String name;

	/* @RequiredArgsConstructor�� ������� ������ ���⼭ �����ڸ� ����^
	 * public SampleHotel(Chef chef) { this.chef = chef; }
	 */
	
	
	

}