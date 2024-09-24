plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.androiddevs.grocerylist"
    compileSdk = 34

    viewBinding {
        this.enable = true
    }

    defaultConfig {
        applicationId = "com.androiddevs.grocerylist"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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


    // Room and Architectural Components
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.legacy:legacy-support-v4:1.0.0") // No new updates, 1.0.0 is the latest
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0") // Lifecycle-extensions is deprecated, you may not need this
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.6") // Latest stable version
    implementation("androidx.room:room-ktx:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3") // Latest stable version of Coroutines Core
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") // Latest stable version for Android

    // New Material Design
    implementation("com.google.android.material:material:1.12.0") // Latest stable version of Material Design

    // ViewModel
     // Latest stable version for Lifecycle components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.6")
    kapt("androidx.lifecycle:lifecycle-compiler:2.8.6")

    // Kodein

    implementation("org.kodein.di:kodein-di-generic-jvm:6.4.0")
    implementation("org.kodein.di:kodein-di-framework-android-x:6.4.0")
}
