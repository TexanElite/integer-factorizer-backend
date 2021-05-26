package com.sidhsuchdev.integerfactorizerbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class FactorizedNumberController {
    @GetMapping("/api/{numberString}/factors")
    public FactorizedNumber factorizedNumber(@PathVariable String numberString) {
        BigInteger number = new BigInteger(numberString);
        List<BigInteger> factors = Factorizer.factorize(number);
        return new FactorizedNumber(number, factors);
    }
}
