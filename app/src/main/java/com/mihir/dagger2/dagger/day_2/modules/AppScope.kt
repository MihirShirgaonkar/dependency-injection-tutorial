package com.mihir.dagger2.dagger.day_2.modules

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope


@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class AppScope()
