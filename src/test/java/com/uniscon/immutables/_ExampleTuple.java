package com.uniscon.immutables;

import org.immutables.value.Value;

@Value.Immutable
@TupleStyle
public interface _ExampleTuple {
    String name();

    int count();
}
