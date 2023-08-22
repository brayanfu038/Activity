package model;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(1);
        inputSet.add(2);
        inputSet.add(3);

        Set<Set<Integer>> powerSet = generatePowerSet(inputSet);

        System.out.println("Conjunto de entrada: " + inputSet);
        System.out.println("Conjunto de potencia: " + powerSet);
    }

    public static <T> Set<Set<T>> generatePowerSet(Set<T> inputSet) {
        Set<Set<T>> powerSet = new HashSet<>();
        powerSet.add(new HashSet<>());  // Agregar el conjunto vacío

        for (T element : inputSet) {
            Set<Set<T>> newSubsets = new HashSet<>();
            for (Set<T> subset : powerSet) {
                Set<T> newSubset = new HashSet<>(subset);
                newSubset.add(element);
                newSubsets.add(newSubset);
            }
            powerSet.addAll(newSubsets);
        }

        return powerSet;
    }
}

