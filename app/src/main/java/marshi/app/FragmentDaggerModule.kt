package marshi.app

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import marshi.app.feature.home.AppFragmentDaggerModule

@InstallIn(FragmentComponent::class)
@Module(
    includes = [AppFragmentDaggerModule::class]
)
interface FragmentDaggerModule
