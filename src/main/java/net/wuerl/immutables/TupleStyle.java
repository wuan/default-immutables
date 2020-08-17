package net.wuerl.immutables;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS) // Make it class retention for incremental compilation
@Value.Style(allParameters = true, // all attributes will become constructor parameters
        // as if they are annotated with @ValueStyle.Parameter
        visibility = Value.Style.ImplementationVisibility.PUBLIC, // Generated class will be always public
        defaults = @Value.Immutable(builder = false), // Disable copy methods and builder
        defaultAsDefault = true, // default methods do not require the @Value.Default annotation
        typeAbstract = "_*", // Detect names starting with underscore
        typeImmutable = "*") // Generate without any suffix, just raw detected name
@JsonSerialize
@JsonDeserialize
public @interface TupleStyle {
}
