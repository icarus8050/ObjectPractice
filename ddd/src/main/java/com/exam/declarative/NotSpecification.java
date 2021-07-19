package com.exam.declarative;

public class NotSpecification extends AbstractSpecification {
    private Specification wrapped;

    public NotSpecification(Specification x) {
        this.wrapped = x;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return !wrapped.isSatisfiedBy(candidate);
    }
}
