package com.sidhsuchdev.integerfactorizerbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class FactorizedNumberController {
    @GetMapping("/factorize")
    public FactorizedNumber factorizedNumber(@RequestParam(value = "number", defaultValue = "10") String numberString) {
        BigInteger number = new BigInteger(numberString);
        List<BigInteger> factors = Factorizer.factorize(number);
        return new FactorizedNumber(number, factors);
    }
}
