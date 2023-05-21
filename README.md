# RStringParser
Class to quickly get strings from res/values/strings.xml in Android Studio
# NOTE
**THIS CLASS WHEN YOU CREATE THE INSTANCE IT IMMEDIATELY PARTS THE VALUES THAT ARE IN THE FILE res/values/strings.xml AND INSERT THEM IN THE HASH MAP AND THEREFORE WHEN YOU WANT TO GET A STRING THEN YOU DO NOT PROCESS METHOD getString(int arg) AND JUST TAKE A READY VALUE FROM HASHMAP values**
# INSTRUCTIONS
**1) OPEN FILE RStringParser.java AND EDIT:**
```java
import org.surus.R;
```
**TO YOUR R PACKAGE**
# EXAMPLE
```Java
RStringParser parser = new RStringParser(ExampleActivity.this);
String app_name = parser.values.get("app_name");


```
