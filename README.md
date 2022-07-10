# Countries, States & Polygons
## General info
This is an offline library that provides information about countries, states and points in the form of polygons in which the states are located.
For a country, you can get its abbreviation and phone code.
For a state, you can get its abbreviation and polygon points.
## How to use it
### Step 1. In your application class add the following lines:
```
override fun onCreate() {
        super.onCreate()
        Coustapol.init(applicationContext)
    }
```
### Step 2. You can use it like this
```
val country = Coustapol.findCountry("Ukraine")
```
## Setup
### Step 1. Add the jitpack repository to your build file
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. Add the dependency to your project
```
dependencies {
		def version = "0.1"
	        implementation 'com.github.lexusshatov:Coustapol:$version'
	}
```
