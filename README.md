# RStringParser
Class to quickly get strings from res/strings.xml in Android Studio
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
