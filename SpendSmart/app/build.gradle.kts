import org.gradle.internal.impldep.bsh.commands.dir

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.spendsmart"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.spendsmart"
        minSdk = 24
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

}

dependencies {

    implementation (platform("com.google.firebase:firebase-bom:31.5.0"))
    implementation ("com.google.android.gms:play-services-auth:20.5.0")


    implementation ("com.android.support.constraint:constraint-layout:1.1.3")
    implementation ("com.android.support:design:28.0.0")
    implementation ("com.android.support:support-v4:28.0.0")
    implementation ("com.android.support:preference-v7:28.0.0")
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("com.android.support.test:runner:1.0.2")
    androidTestImplementation ("com.android.support.test.espresso:espresso-core:3.0.2")
    implementation ("com.android.support:appcompat-v7:28.0.0")
    implementation ("android.arch.lifecycle:extensions:1.1.1")
    implementation ("android.arch.lifecycle:viewmodel:1.1.1")
    implementation (libs.library)

    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0-alpha")
    implementation ("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation ("com.android.support:design:28.0.0")
    implementation (libs.materialcolorpicker.library)

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.database)
    implementation(libs.androidx.annotation)
    implementation(libs.firebase.auth)
    implementation(libs.androidx.lifecycle.viewmodel.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)




}