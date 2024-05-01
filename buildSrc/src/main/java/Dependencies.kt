object Versions {
    //Build tools and SDK
    const val compileSdkVersion = 33
    const val minSdkVersion = 21
    const val targetSdkVersion = 33
    const val versionCode = 2
    const val versionName = "v0.1"
    const val kotlinCompilerVersion = "1.6.10"

    //Android libraries
    const val coreKtx = "1.9.0"
    const val appcompat = "1.4.1"
    const val material = "1.5.0"

    const val retrofit = "2.9.0"
    const val okhttp3 = "4.9.3"
    const val coroutine = "1.4.3"
    const val kotlin = "1.5.0"
    const val lifecycle = "2.5.1"
    const val moshi = "1.13.0"
    const val mmKv = "1.2.12"
    const val startUp = "1.1.1"
    const val coil = "1.4.0"
}

object Moshi {
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiKt = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
}

object AndroidX {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val activityKtx = "androidx.activity:activity-ktx:1.5.0-alpha03"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:1.4.1"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.2.1"
}

object Lifecycle {
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
}


object SquareUp {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val okio = "com.squareup.okio:okio:3.0.0"

    // todo: 全部替换成moshi的converter
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:2.9.0"
}

object Kt {
    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val coroutineAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
}

object Common {
    const val mmKv = "com.tencent:mmkv:${Versions.mmKv}"
    const val startUp = "androidx.startup:startup-runtime:${Versions.startUp}"
    const val coil = "io.coil-kt:coil-compose:${Versions.coil}"
    const val navigationBar = "com.ashokvarma.android:bottom-navigation-bar:2.2.0"
    const val refresh = "com.scwang.smart:refresh-layout-kernel:2.0.3"
    const val refreshHeader = "com.scwang.smart:refresh-header-classics:2.0.3"
    const val refreshFooter = "com.scwang.smart:refresh-footer-classics:2.0.3"
    const val immersionbar = "com.geyifeng.immersionbar:immersionbar:3.2.1"
    const val adapterHelper = "com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.4"
    const val xPopup = "com.github.li-xiaojun:XPopup:2.7.6"
    //扫码
    const val MLKitCore = "com.github.jenly1314.MLKit:mlkit-camera-core:1.0.3"
    const val MLKitBarcode = "com.github.jenly1314.MLKit:mlkit-barcode-scanning:1.0.3"
    const val XXPermissions = "com.github.getActivity:XXPermissions:16.8"


}

// todo: 梳理这些个库的功能
object Other {
    const val ClarityPotion = "com.github.ssseasonnn:ClarityPotion:1.0.2"
}

