# Android-Flag-Kit
[![](https://jitpack.io/v/KaKaVip/Android-Flag-Kit.svg)](https://jitpack.io/#KaKaVip/Android-Flag-Kit)

Free Resource from https://dribbble.com/shots/2828120-All-Flags-Freebie-Flag-Kit

####  Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

#### Step 2. Add the dependency

```groovy
	dependencies {
	        compile 'com.github.KaKaVip:Android-Flag-Kit:v0.1'
	}
```

#### Step 3. Using

in XML

```xml
<com.haipq.android.flagkit.FlagImageView
        android:id="@+id/flagView"
        android:layout_width="70dp"
        android:layout_height="wrap_content"
        app:countryCode="US"
        tools:src="@drawable/flag_us" />  // To Show in Preview
```

in Java Code

```
FlagImageView flagImageView = (FlagImageView) findViewById(R.id.flagView);

flagImageView.setCountryCode("VN"); // with text code

flagImageView.setCountryCode(Locale.CANADA); //  with Locale

flagImageView.defaultLocal(); // Show current device

```

