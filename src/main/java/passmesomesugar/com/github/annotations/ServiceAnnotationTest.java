package passmesomesugar.com.github.annotations;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceAnnotationTest {

  String name();

  boolean lazyLoad() default false;
}
