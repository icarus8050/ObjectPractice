package com.exam.declarative;

public class OrSpecification extends AbstractSpecification {
    private Specification one;
    private Specification other;

    public OrSpecification(Specification x, Specification y) {
        this.one = x;
        this.other = y;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return one.isSatisfiedBy(candidate) ||
                other.isSatisfiedBy(candidate);
    }
}
