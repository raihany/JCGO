/*
 * @(#) $(JCGO)/goclsp/vm/java/lang/VMMath.java --
 * VM specific native methods for Java "Math" class.
 **
 * Project: JCGO (http://www.ivmaisoft.com/jcgo/)
 * Copyright (C) 2001-2007 Ivan Maidanski <ivmai@ivmaisoft.com>
 * All rights reserved.
 **
 * Class specification origin: GNU Classpath v0.93 vm/reference
 */

/*
 * This is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 **
 * This software is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License (GPL) for more details.
 **
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library. Thus, the terms and
 * conditions of the GNU General Public License cover the whole
 * combination.
 **
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module. An independent module is a module which is not derived from
 * or based on this library. If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so. If you do not wish to do so, delete this
 * exception statement from your version.
 */

package java.lang;

final class VMMath
{

 private VMMath() {}

 static native double sin(double a); /* JVM-core */

 static native double cos(double a); /* JVM-core */

 static native double tan(double a); /* JVM-core */

 static native double asin(double a); /* JVM-core */

 static native double acos(double a); /* JVM-core */

 static native double atan(double a); /* JVM-core */

 static native double atan2(double y, double x); /* JVM-core */

 static native double exp(double a); /* JVM-core */

 static native double log(double a); /* JVM-core */

 static native double sqrt(double a); /* JVM-core */

 static native double pow(double a, double b); /* JVM-core */

 static native double IEEEremainder(double x, double y); /* JVM-core */

 static native double ceil(double a); /* JVM-core */

 static native double floor(double a); /* JVM-core */

 static native double rint(double a); /* JVM-core */

 static native double cbrt(double a); /* JVM-core */

 static native double hypot(double a, double b); /* JVM-core */

 static native double expm1(double a); /* JVM-core */

 static native double log10(double a); /* JVM-core */

 static native double log1p(double a); /* JVM-core */

 static native double sinh(double a); /* JVM-core */

 static native double cosh(double a); /* JVM-core */

 static native double tanh(double a); /* JVM-core */
}
