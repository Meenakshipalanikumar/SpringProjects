package com.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.data.Data;

public class Main {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Data> reflect = Data.class;
		String a = reflect.getTypeName();
		Boolean f = reflect.isInterface();
		Method[] m = reflect.getDeclaredMethods();
		int cl = reflect.getModifiers();
		System.out.println(Modifier.isPublic(cl));
		for (Method mm : m) {
			System.out.println(mm);
		}
		System.out.println(f);
		int q = 10;
		Constructor<Data> cons = reflect.getConstructor(int.class);
		Object cc = cons.newInstance(q);
		
		//To access private method using reflection method
		
		//Object created for Class called "Data"
		Data d = new Data();
		
		//Steps to access private data
		Method meth = Data.class.getDeclaredMethod("two");
		meth.setAccessible(true);
		meth.invoke(d);
	}
}
