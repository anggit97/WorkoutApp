import Version.koinAndroid

/**
 * Created by Anggit Prayogo on 4/25/20.
 */
object ApplicationId {
    const val id = "com.anggit97.workoutapp"
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val buildToolsVersion = "29.0.3"
    const val targetSdkVersion = 29
    const val minSdkVersion = 17
    const val renderTargetApi = 29
}

object Version {

    /**
     * Top Level Version
     */
    const val kotlin = "1.3.71"
    const val gradle = "3.6.3"

    /**
     * Android Support Version
     */
    const val support = "1.1.0"
    const val material = "1.1.0"
    const val legacy = "1.0.0"
    const val cardAndRv = "1.0.0"
    const val constraintLayout = "1.1.3"
    const val coreKtx = "1.2.0"

    /**
     * Livecycle Version
     */
    const val lifecycle = "2.1.0-alpha03"

    /**
     * Retrofit Network version
     */
    const val retrofit2 = "2.7.1"
    const val gson = "2.8.6"
    const val okhttpLogging = "3.8.1"
    const val rxjavaAdapter = "1.0.0"

    /**
     * Koin
     */
    const val koinAndroid = "2.1.5"

    /**
     * Room
     */
    const val room = "2.2.0-rc01"

    /**
     * AirBnb
     */
    const val lottie = "2.7.0"

    /**
     * chrisjenx
     */
    const val calligraphy = "3.1.1"
    const val viewbump = "2.0.3"

    /**
     * Karumi
     */
    const val dexter = "6.0.2"

    /**
     * Multidex
     */
    const val multidex = "2.0.1"

    /**
     * Button
     */
    const val fancyButton = "1.8.4"

    /**
     * Coroutine
     */
    const val coroutines = "1.3.0-M2"
    const val coroutinesAdapter = "0.9.2"

    /**
     * Deeplink
     */
    const val deeplink = "4.1.0"

    /**
     * StatusBar
     */
    const val statusBar = "1.5.1"

    /**
     * Jetpack
     */
    const val archLifecycle = "2.0.0"

    /**
     * Lean Cannary
     */
    const val leakCannaryVersion = "2.2"

    /**
     * Glide
     */
    const val glide = "4.11.0"
    const val glideCompiler = "4.11.0"

    /**
     * Test
     */
    const val junit = "4.13"
    const val junitExt = "1.1.1"
    const val mockitoCore = "2.25.0"
    const val androidxTest = "1.3.0-alpha01"
    const val archCore = "2.1.0"
    const val androidxEspressoCore = "3.2.0"
    const val mockitoInline = "2.19.0"
    const val spekVersion = "2.0.6"
    const val spekApiVersion = "1.1.5"
}

object Deps {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val gradle = "com.android.tools.build:gradle:${Version.gradle}"
}

object AndroidSupport {
    const val appCompat = "androidx.appcompat:appcompat:${Version.support}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Version.cardAndRv}"
    const val cardView = "androidx.cardview:cardview:${Version.cardAndRv}"
    const val design = "com.google.android.material:material:${Version.material}"
    const val v4 = "androidx.legacy:legacy-support-v4:${Version.legacy}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
    const val multidex = "com.android.support:multidex:${Version.multidex}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit2}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofit2}"
    const val gson = "com.google.code.gson:gson:${Version.gson}"
    const val rxAdapter = "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:${Version.rxjavaAdapter}"
    const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Version.okhttpLogging}"
    const val coroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Version.coroutinesAdapter}"
}

object Koin{
    const val android = "org.koin:koin-android:$koinAndroid"
}

object Lifecycle {
    const val extentions = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycle}"
}

object Jetpack {
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Version.archLifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Version.archLifecycle}"
}

object Airbnb {
    const val lottie = "com.airbnb.android:lottie:${Version.lottie}"
}

object Font {
    const val calligraphy = "io.github.inflationx:calligraphy3:${Version.calligraphy}"
    const val viewBump = "io.github.inflationx:viewpump:${Version.viewbump}"
}

object Karumi {
    const val dexter = "com.karumi:dexter:${Version.dexter}"
}

object Button {
    val fancyButton = "com.github.medyo:fancybuttons:${Version.fancyButton}"
}

object Coroutines {
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"
    const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.coroutines}"
}

object LeakCannary{
    const val coreAndroid = "com.squareup.leakcanary:leakcanary-android:${Version.leakCannaryVersion}"
}

object Room{
    const val room = "androidx.room:room-runtime:${Version.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.room}"
}

object Glide{
    const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Version.glideCompiler}"
}

object Testing {
    const val junit = "junit:junit:${Version.junit}"
    const val junitExt = "androidx.test.ext:junit:${Version.junitExt}"
    const val mockitoCore = "org.mockito:mockito-core:${Version.mockitoCore}"
    const val rules = "androidx.test:rules:${Version.androidxTest}"
    const val runner = "androidx.test:runner:${Version.androidxTest}"
    const val archCore = "androidx.arch.core:core-testing:${Version.archCore}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.androidxEspressoCore}"
    const val mockitoInline = "org.mockito:mockito-inline:${Version.mockitoInline}"
    const val spekApi = "org.jetbrains.spek:spek-api:${Version.spekApiVersion}"
    const val spekJunitPlatformEngine = "org.jetbrains.spek:spek-junit-platform-engine:${Version.spekApiVersion}"
    const val spekDslJvm = "org.spekframework.spek2:spek-dsl-jvm:${Version.spekVersion}"
    const val spekRunner = "org.spekframework.spek2:spek-runner-junit5:${Version.spekVersion}"
}
