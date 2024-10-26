plugins {
    alias(libs.plugins.android.application)
<<<<<<< HEAD
}

android {
    namespace = "com.example.laundry_tracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.laundry_tracker"
        minSdk = 26
=======
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.home_blaundry"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.home_blaundry"
        minSdk = 24
>>>>>>> 62fc972 (Home)
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
<<<<<<< HEAD
=======
    kotlinOptions {
        jvmTarget = "1.8"
    }
>>>>>>> 62fc972 (Home)
}

dependencies {

<<<<<<< HEAD
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
=======
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
>>>>>>> 62fc972 (Home)
}