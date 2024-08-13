package com.imdad.cakestroy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
class CakestroyApplicationTests {

	@Test
	void contextLoads() {
	}
	@GetMapping("admin/categories")
	public String categories(){
		return "categories";
	}
	@GetMapping("/admin/categories/add")
	public String categoriesAdd(){
		return "categoriesAdd";
	}

}
