package com.sidhsuchdev.integerfactorizerbackend;

import java.math.*;
import java.util.*;

public class Factorizer {

    public static List<BigInteger> factorize(BigInteger number) {
        return trialDivision(number);
    }

    public static List<BigInteger> trialDivision(BigInteger number) {
        ArrayList<BigInteger> factors = new ArrayList<>();
        BigInteger currentFactor = BigInteger.TWO;
        while (currentFactor.multiply(currentFactor).compareTo(number) <= 0) {
            while (number.mod(currentFactor).equals(BigInteger.ZERO)) {
                number = number.divide(currentFactor);
                factors.add(currentFactor);
            }
            currentFactor = currentFactor.add(BigInteger.ONE);
        }
        if (number.compareTo(BigInteger.ONE) >= 1) {
            factors.add(number);
        }
        return factors;
    }

}
