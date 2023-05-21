package org.surus.stringRes;

import android.content.Context;
import android.content.res.Resources;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import org.surus.R;//change this to your R package

public class RStringParser {
	public final HashMap<String, String> values = new HashMap<>();
	public final Context context;

	public RStringParser(Context context) {
		this.context = context;
		init();
	}

	public void init() {
		Class<?> resourcesClass = R.string.class;
		for (Class<?> i = resourcesClass; i != null; i = i.getSuperclass()) {
			Field[] fields = i.getDeclaredFields();
			addStaticFields(fields);
		}
	}

	public void addStaticFields(Field[] fields) {
		if (fields != null) {
			for (Field f : fields) {
				if (f != null) {
					if (RStringParser.isStatic(f)) {
						try {
							String name = f.getName();
							int id = Integer.valueOf(String.valueOf(f.get(null)));
							String value = context.getString(id);
							values.put(name, value);
						} catch (Exception e) {

						}
					}
				}
			}
		}
	}

	public static boolean isStatic(Field field) {
		return Modifier.isStatic(field.getModifiers());
	}

}