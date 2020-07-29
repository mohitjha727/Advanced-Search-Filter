# Advanced-Search-Filter-Library
<br/>
 You can search the substring of a string also.
 
<br/>
<br/>
This is the advance search filter for android.
The standard text view adapter only seems to search from the beginning of whole words 
so using this library can make it possible to search 
for parts of the arbitrary string we want.

## Implementation

##### Step 1. Add it in your root build.gradle(project) at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
##### Step 2. Add the dependency in your build.gradle(module).
```
dependencies {
	        implementation 'com.github.mohitjha727:Advanced-Search-Filter:0.0.1'
	}
```

## Usage
Now you can use this SearchableAdapter class instead of Arrayadapter class in your project.<br/>

```
SearchableAdapter adapter = 
                            new SearchableAdapter(Context, List<String);
```

