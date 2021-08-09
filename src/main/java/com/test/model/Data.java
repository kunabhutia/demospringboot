package com.test.model;

public class Data {

    public Data() {

    }


    private Integer Initial;
    private String Primes;

    public Integer getInitial() {
        return Initial;
    }

    public void setInitial(Integer initial) {
        Initial = initial;
    }

    public String getPrimes() {
        return Primes;
    }

    public void setPrimes(String primes) {
        Primes = primes;
    }

    @Override
    public String toString() {
        return "Data{" +
                "Initial=" + Initial +
                ", Primes='" + Primes + '\'' +
                '}';
    }
}