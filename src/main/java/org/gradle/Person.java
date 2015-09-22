package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;

    public Person(final String name) {
        this.name = name;
        new GrowthList();
    }

    public final String getName() {
        return name;
    }
}
