package com.uniscon.immutables;

import org.immutables.value.Value;

@Value.Immutable
@ValueStyle
public interface _ExampleValue {
    String getName();

    int counter();
}
