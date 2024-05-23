package edu.austral.ingsis.math;

// TODO: may convert to a class with holds an object
//  which simply computes the result
public interface BinaryOperation extends Symbol {
    Symbol getFirst();
    Symbol getSecond();
}
