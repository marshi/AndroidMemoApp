package marshi.memo.app

import dagger.Component
import dagger.android.AndroidInjector
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@EntryPoint
interface AppComponent : AndroidInjector<App> {

//  @Component.Builder
//  interface Builder {
//    @BindsInstance
//    fun app(app: App): Builder
//
//    fun build(): AppComponent
//  }

//  @Component.Factory
//  interface Factory {
//    fun create(@BindsInstance app: App): AppComponent
//  }
}
