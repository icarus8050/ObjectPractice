package com.exam.declarative;

public abstract class AbstractSpecification implements Specification {

    @Override
    public Specification and(Specification other) {
        return new AndSpecification(this, other);
    }

    @Override
    public Specification or(Specification other) {
        return new OrSpecification(this, other);
    }

    @Override
    public Specification not() {
        return new NotSpecification(this);
    }
}
