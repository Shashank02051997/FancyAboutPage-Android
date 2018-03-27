# FancyAboutPage-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/Shashank02051997/FancyAboutPage-Android.svg)](https://jitpack.io/#Shashank02051997/FancyAboutPage-Android)

<a href="https://play.google.com/store/apps/details?id=com.shashank.sony.fancylibrarybyshashank">
    <img alt="Get it on Google Play"
        height="80"
        src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" />
</a>

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	compile 'com.github.Shashank02051997:FancyAboutPage-Android:2.6'
}
```
# Fancy About Page
This library allows to generate beautiful About Pages with less effort, it's fully customizable and supports opening specific intent

<img src="https://github.com/Shashank02051997/FancyAboutPage-Android/blob/master/Screenshot/20180214_221311.gif" height="420" width="240">

# Usage

First of all, need add AboutPage to your xml layout.

```xml
<ScrollView
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FFFFFF">
    <com.shashank.sony.fancyaboutpagelib.FancyAboutPage
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/fancyaboutpage">
        <com.mikhaellopez.circularimageview.CircularImageView
            android:layout_width="140dp"
            android:layout_height="140dp"
            android:layout_marginTop="180dp"
            android:layout_alignParentRight="true"
            android:layout_marginRight="10dp"
            android:src="@drawable/yourprofileimg"
            app:civ_border_color="#40FFFFFF"
            app:civ_border_width="10dp"
            android:id="@+id/circularImageView" />
    </com.shashank.sony.fancyaboutpagelib.FancyAboutPage>
    </RelativeLayout>
</ScrollView>

```

Second of all, intract with code in java.
```java
        FancyAboutPage fancyAboutPage=findViewById(R.id.fancyaboutpage);
        //fancyAboutPage.setCoverTintColor(Color.BLUE);  //Optional
        fancyAboutPage.setCover(R.drawable.coverimg); //Pass your cover image
        fancyAboutPage.setName("Shashank Singhal");
        fancyAboutPage.setDescription("Google Certified Associate Android Developer | Android App, Game, Web and Software Developer.");
        fancyAboutPage.setAppIcon(R.drawable.cakepop); //Pass your app icon image
        fancyAboutPage.setAppName("Cake Pop Icon Pack");
        fancyAboutPage.setVersionNameAsAppSubTitle("1.2.3");
        fancyAboutPage.setAppDescription("Cake Pop Icon Pack is an icon pack which follows Google's Material Design language.\n\n" +
                "This icon pack uses the material design color palette given by google. Every icon is handcrafted with attention to the smallest details!\n\n"+
                "A fresh new take on Material Design iconography. Cake Pop offers unique, creative and vibrant icons. Spice up your phones home-screen by giving it a fresh and unique look with Polycon.");
        fancyAboutPage.addEmailLink("shashanksinghal02@gmail.com");     //Add your email id    
        fancyAboutPage.addFacebookLink("https://www.facebook.com/shashanksinghal02");  //Add your facebook address url
        fancyAboutPage.addTwitterLink("https://twitter.com/shashank020597");
        fancyAboutPage.addLinkedinLink("https://www.linkedin.com/in/shashank-singhal-a87729b5/");
        fancyAboutPage.addGitHubLink("https://github.com/Shashank02051997");

```

## Screenshots

**Please click the image below to enlarge.**


<img src="https://github.com/Shashank02051997/FancyAboutPage-Android/blob/master/Screenshot/Screenshot_2018-02-14-22-12-27.png" height="420" width="240" hspace="20"><img src="https://github.com/Shashank02051997/FancyAboutPage-Android/blob/master/Screenshot/Screenshot_2018-02-14-22-12-33.png" height="420" width="240" hspace="20">



## Dependencies

This project use this libraries ~ Thanks to them.

  * [Squint](https://github.com/IntruderShanky/Squint)
  * [CircularImageView](https://github.com/lopspower/CircularImageView)


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/Shashank02051997/FancyAboutPage-Android/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Contact - Let's become friend
- [Twitter](https://twitter.com/shashank020597)
- [Github](https://github.com/Shashank02051997)
- [Linkedin](https://www.linkedin.com/in/shashank-singhal-a87729b5/)
- [Facebook](https://www.facebook.com/shashanksinghal02)

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2018 Shashank Singhal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
