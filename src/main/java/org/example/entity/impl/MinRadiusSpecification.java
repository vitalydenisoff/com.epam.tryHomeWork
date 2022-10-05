package org.example.entity.impl;

import org.example.entity.Specification;

public class MinRadiusSpecification implements Specification {
    private int minRadius;
    public MinRadiusSpecification (int minRadius) {
        this.minRadius = minRadius();

    }
}
