
package io.kubernetes.client.spring.extended.controller.annotation;

import io.kubernetes.client.common.KubernetesObject;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the method is a filter for {@link io.kubernetes.client.informer.EventType#ADDED}
 * from watches.
 *
 * <p>A add-event filter must have the signature as {@link java.util.function.Predicate<ApiType>}
 *
 * @deprecated register the watcher via the {@link
 *     io.kubernetes.client.extended.controller.builder.ControllerBuilder} API
 */
@Deprecated
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AddWatchEventFilter {
  Class<? extends KubernetesObject> apiTypeClass();
}
