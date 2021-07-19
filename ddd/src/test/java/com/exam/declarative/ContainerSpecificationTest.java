package com.exam.declarative;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.exam.declarative.ContainerFeature.*;
import static org.junit.jupiter.api.Assertions.*;

class ContainerSpecificationTest {

    @Test
    void specificationTest() {
        Container container = new Container(Arrays.asList(VENTILATED, ARMORED));
        Specification ventilated = new ContainerSpecification(VENTILATED);
        Specification armored = new ContainerSpecification(ARMORED);
        Specification both = ventilated.and(armored);

        assertTrue(both.isSatisfiedBy(container));
    }
}