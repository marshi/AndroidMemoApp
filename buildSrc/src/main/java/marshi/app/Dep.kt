package marshi.app

object Dep {
  const val daggerVersion = "2.31"
  const val kotlinVersion = "1.4.30"
  const val groupieVersion = "2.8.1"
  const val navVersion = "2.3.3"
  const val roomVersion = "2.2.6"

  object Release {
    const val versionCode = 1
    const val versionName = "1.0"
  }

  const val compileSdkVersion = 30
  const val targetSdkVersion = 30
  const val minSdkVersion = 23
  const val buildToolVersion = "30.0.2"


  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${kotlinVersion}"
  const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.4"
  const val kotlinCoroutinesAndroid = "org.jetbrains.kotlin:kotlinx-coroutines-android:1.3.21"

  const val coreKtx = "androidx.core:core-ktx:1.3.2"
  const val appCompat = "androidx.appcompat:appcompat:1.2.0"
  const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
  const val activityKtx = "androidx.activity:activity-ktx:1.1.0"
  const val fragmentKtx = "androidx.fragment:fragment-ktx:1.3.0"
  const val material = "com.google.android.material:material:1.3.0"
  const val collectionKtx = "androidx.collection:collection-ktx:1.1.0"
  const val lifecycleLiveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:2.3.0-rc01"
  const val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.0-rc01"

  const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
  const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
  const val roomKtx = "androidx.room:room-ktx:$roomVersion"

  const val lifecycleReactiveStreamsKtx =
    "androidx.lifecycle:lifecycle-reactivestreams-ktx:2.3.0-rc01"
  const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-rc01"
  const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0-rc01"
  const val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"
  const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:2.2.0"

  // dagger
  const val daggerHiltAndroid = "com.google.dagger:hilt-android:${daggerVersion}-alpha"
  const val daggerHiltAndroidCompiler =
    "com.google.dagger:hilt-android-compiler:${daggerVersion}-alpha"
  const val daggerHiltLifecycleViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02"
  const val daggerHiltCompiler = "androidx.hilt:hilt-compiler:1.0.0-alpha02"

  const val groupie = "com.xwray:groupie:${groupieVersion}"
  const val groupieViewBinding = "com.xwray:groupie-viewbinding:$groupieVersion"

  const val navigationFragment = "androidx.navigation:navigation-fragment:$navVersion"
  const val navigationUi = "androidx.navigation:navigation-ui:$navVersion"

  // Kotlin
  const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navVersion"
  const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:$navVersion"

  const val junit4 = "junit:junit:4.+"
  const val androidxJunit = "androidx.test.ext:junit:1.1.2"
  const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
}
