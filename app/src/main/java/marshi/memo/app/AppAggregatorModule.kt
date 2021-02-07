package marshi.memo.app

import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module(
  includes = [
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    FragmentDaggerModule::class
  ]
)
interface AppAggregatorModule
