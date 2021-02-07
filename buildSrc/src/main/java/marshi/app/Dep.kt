package marshi.app

object Dep {
  const val daggerVersion = "2.31"
  const val kotlinVersion = "1.4.30"
  const val groupieVersion = "2.8.1"

  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${kotlinVersion}"
  const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.4"

  const val coreKtx = "androidx.core:core-ktx:1.3.2"
  const val appCompat = "androidx.appcompat:appcompat:1.2.0"
  const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
  const val activityKtx = "androidx.activity:activity-ktx:1.1.0"
  const val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.5"
  const val material = "com.google.android.material:material:1.3.0"
  const val collectionKtx = "androidx.collection:collection-ktx:1.1.0"
  const val lifecycleLiveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:2.3.0-rc01"
  const val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.0-rc01"

  const val lifecycleReactiveStreamsKtx =
    "androidx.lifecycle:lifecycle-reactivestreams-ktx:2.3.0-rc01"
  const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-rc01"
  const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0-rc01"
  const val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"
  const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:2.2.0"

  const val daggerAndroid = "com.google.dagger:dagger-android:${daggerVersion}"
  const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${daggerVersion}"
  const val daggerCompiler = "com.google.dagger:dagger-compiler:${daggerVersion}"
  const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${daggerVersion}"
  const val daggerHiltAndroid = "com.google.dagger:hilt-android:${daggerVersion}-alpha"
  const val daggerHiltAndroidCompiler =
    "com.google.dagger:hilt-android-compiler:${daggerVersion}-alpha"
  const val hiltLifecycleViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02"
  const val hiltCompiler = "androidx.hilt:hilt-compiler:1.0.0-alpha02"

  const val groupie = "com.xwray:groupie:${groupieVersion}"
  const val groupieViewBinding = "com.xwray:groupie-viewbinding:$groupieVersion"

  const val junit4 = "junit:junit:4.+"
  const val androidxJunit = "androidx.test.ext:junit:1.1.2"
  const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
}
