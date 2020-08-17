package net.wuerl.immutables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.immutables.vavr.encodings.VavrEncodingEnabled;

@Target({ ElementType.PACKAGE, ElementType.TYPE })
@Value.Style(
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PUBLIC,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.SAME,
        defaultAsDefault = true, // default methods do not require the @Value.Default annotation
        // Detect names starting with underscore
        typeAbstract = "_*",
        // Generate without any suffix, just raw detected name
        typeImmutable = "*"
)
@VavrEncodingEnabled
@JsonSerialize
@JsonDeserialize
public @interface ValueStyle {
}
