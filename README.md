# Introduction to JUnit Testing in Java

## What is JUnit?

JUnit is a widely-used testing framework for Java that plays a crucial role in automated unit testing. It provides annotations and assertions to simplify the testing process and ensure that code behaves as expected.

## Basic JUnit Annotations

### `@Test`

The `@Test` annotation marks a method as a test method.

Example:

```java
import org.junit.Test;

public class MyTest {

    @Test
    public void myTestMethod() {
        // Your test logic here
    }
}
