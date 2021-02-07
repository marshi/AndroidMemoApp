package marshi.memo.app

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import marshi.memo.app.feature.home.AppFragmentDaggerModule

@InstallIn(FragmentComponent::class)
@Module(
    includes = [AppFragmentDaggerModule::class]
)
interface FragmentDaggerModule
