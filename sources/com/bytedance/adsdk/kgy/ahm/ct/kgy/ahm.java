package com.bytedance.adsdk.kgy.ahm.ct.kgy;

import defpackage.d;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ahm {
    private static boolean kgy(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j) == number.doubleValue();
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return false;
    }

    private static boolean kgy(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i) == number.doubleValue();
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return false;
    }

    private static boolean kgy(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f) == number.doubleValue();
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return false;
    }

    private static boolean kgy(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d == number.doubleValue();
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return false;
    }

    public static boolean kgy(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return kgy(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return kgy(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return kgy(number.doubleValue(), number2);
            }
            d.u(q63.h(number, "This type of addition operation is not supported"));
            return false;
        }
        return kgy(number.intValue(), number2);
    }
}
