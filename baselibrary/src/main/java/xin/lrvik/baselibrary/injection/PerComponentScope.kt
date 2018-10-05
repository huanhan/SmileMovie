package lrvik.xin.base.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy.RUNTIME
import javax.inject.Scope


@Scope
@Documented
@Retention(RUNTIME)
annotation class PerComponentScope