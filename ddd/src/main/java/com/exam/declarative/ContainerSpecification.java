package com.exam.declarative;

public class ContainerSpecification implements Specification {
    private ContainerFeature requiredFeature;

    public ContainerSpecification(ContainerFeature requiredFeature) {
        this.requiredFeature = requiredFeature;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        if (!(candidate instanceof Container)) {
            return false;
        }
        return ((Container) candidate).getFeatures().contains(requiredFeature);
    }

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
