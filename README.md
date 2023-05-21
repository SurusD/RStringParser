# RStringParser
Class to quickly get strings from res/strings.xml in Android Studio
# INSTRUCTIONS
**1) OPEN FILE RStringParser.java and edit:**
```java
import org.surus.R;
```
**to your R package**
# EXAMPLE
```Java
RStringParser parser = new RStringParser(ExampleActivity.this);
String app_name = parser.values.get("app_name");


```
