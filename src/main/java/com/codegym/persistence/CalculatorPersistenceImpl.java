package com.codegym.persistence;

public class CalculatorPersistenceImpl implements CalculatorPersistence {

    @Override
    public float converter(float usd) {
        return usd*23000;
    }
}
