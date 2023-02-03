package com.example.travelbee;

public class CurrencyCal {
    protected Double convertUSDToSLruppee(Double amount) {
        Double ans = (amount * 354.87) ;
        return ans;
    }
    protected Double convertEURToSLruppee(Double value) {
        Double ans = (value * 374.13) ;
        return ans;
    }
    protected Double convertAUDToSLruppee(Double value) {
        Double ans = (value * 251.19) ;
        return ans;
    }
    protected Double convertCADToSLruppee(Double value) {
        Double ans = (value * 275.64);
        return ans;
    }
    protected Double convertINRToSLruppee(Double value) {
        Double ans = (value * 4.61) ;
        return ans;
    }
}
