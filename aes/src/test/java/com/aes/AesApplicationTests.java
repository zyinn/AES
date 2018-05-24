package com.aes;

import com.aes.service.AesUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AesApplicationTests {

	@Test
	public void contextLoads() {
	}

	/**
	 * 测试
	 */
	public void main() throws Exception {
		//密钥 (需要前端和后端保持一致)
		String KEY = "abcdefgabcdefg12";
		String content = "123";
		System.out.println("加密前：" + content);
		System.out.println("加密密钥和解密密钥：" + KEY);
		String encrypt = AesUtils.aesEncrypt(content, KEY);
		System.out.println("加密后：" + encrypt);
		String decrypt = AesUtils.aesDecrypt(encrypt, KEY);
		System.out.println("解密后：" + decrypt);
		System.exit(0);
	}
}
