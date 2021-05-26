package com.sidhsuchdev.integerfactorizerbackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.ArrayList;

@SpringBootTest
class IntegerFactorizerBackendApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testFactorizer() {
		BigInteger n1 = new BigInteger("20");
		ArrayList<BigInteger> l1 = new ArrayList<>();
		l1.add(BigInteger.TWO); l1.add(BigInteger.TWO); l1.add(new BigInteger("5"));
		assert(Factorizer.factorize(n1).equals(l1));
	}

}
