plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.kotlincoroutinesabhay"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kotlincoroutinesabhay"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        buildConfig = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        // Create the new 'staging' build type
        create("staging") {
            // Optional: inherit properties from another build type
            // initWith(getByName("debug"))  // Uncomment if needed

            applicationIdSuffix = ".staging"
            versionNameSuffix = "-staging"
            isDebuggable = true
        }

    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")

    //LifeCycle
    implementation("androidx.lifecycle:lifecycle-common:2.2.0")
    implementation("androidx.lifecycle:lifecycle-runtime:2.2.0")
    implementation("android.arch.lifecycle:extensions:1.1.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")

    //Retrofit
    implementation ("com.google.code.gson:gson:2.8.5")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.0")

    implementation ("com.squareup.okhttp3:okhttp:4.10.0")
    implementation ("com.squareup.okio:okio:2.8.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.0")
//    implementation ("group: 'com.squareup.okhttp3', name: 'logging-interceptor', version: '4.9.0")

    implementation ("com.localebro:okhttpprofiler:1.0.8")

}