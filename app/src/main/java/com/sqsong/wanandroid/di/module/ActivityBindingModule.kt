package com.sqsong.wanandroid.di.module

import com.sqsong.wanandroid.di.scope.ActivityScope
import com.sqsong.wanandroid.ui.home.activity.KnowledgeActivity
import com.sqsong.wanandroid.ui.home.activity.MainActivity
import com.sqsong.wanandroid.ui.home.di.ChildKnowledgeModule
import com.sqsong.wanandroid.ui.home.di.MainModule
import com.sqsong.wanandroid.ui.login.LoginActivity
import com.sqsong.wanandroid.ui.login.RegisterActivity
import com.sqsong.wanandroid.ui.login.di.LoginModule
import com.sqsong.wanandroid.ui.login.di.RegisterModule
import com.sqsong.wanandroid.ui.splash.SplashActivity
import com.sqsong.wanandroid.ui.splash.di.SplashModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun contributeSplashActiivity(): SplashActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun contributeLoginActivity(): LoginActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [RegisterModule::class])
    abstract fun contributeRegisterActivity(): RegisterActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun contributeHomeActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ChildKnowledgeModule::class])
    abstract fun contributeKnowledgeActivity(): KnowledgeActivity

}