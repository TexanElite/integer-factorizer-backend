package com.sidhsuchdev.integerfactorizerbackend;

import java.math.*;
import java.util.*;

public class FactorizedNumber {
    private BigInteger number;
    private List<BigInteger> factors;

    public FactorizedNumber(BigInteger number, List<BigInteger> factors) {
        this.number = number;
        this.factors = factors;
    }

    public BigInteger getNumber() {
        return number;
    }

    public List<BigInteger> getFactors() {
        return factors;
    }
}
