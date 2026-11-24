plugins { id("com.android.application") }
android { namespace = "hr.svinjokolja.recepti"; compileSdk = 35
 defaultConfig { applicationId = "hr.svinjokolja.recepti"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "1.0" } }
dependencies { implementation("androidx.webkit:webkit:1.12.1") }
