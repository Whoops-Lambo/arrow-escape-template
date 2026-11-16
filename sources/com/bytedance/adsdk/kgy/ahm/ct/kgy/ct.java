package com.bytedance.adsdk.kgy.ahm.ct.kgy;

import defpackage.d;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct {
    private static Object kgy(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i - number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(((long) i) - number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i - number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(((double) i) - number.doubleValue());
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return null;
    }

    private static Object kgy(long j, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j - number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(j - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j - number.doubleValue());
            }
            d.u(q63.h(number, "This type of addition operation is not supported"));
            return null;
        }
        return Long.valueOf(j - ((long) number.intValue()));
    }

    private static Object kgy(float f, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f - number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(f - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(((double) f) - number.doubleValue());
            }
            d.u(q63.h(number, "This type of addition operation is not supported"));
            return null;
        }
        return Float.valueOf(f - number.intValue());
    }

    private static Object kgy(double d, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d - number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d - ((double) number.floatValue()));
            }
            if (number instanceof Double) {
                return Double.valueOf(d - number.doubleValue());
            }
            d.u(q63.h(number, "This type of addition operation is not supported"));
            return null;
        }
        return Double.valueOf(d - ((double) number.intValue()));
    }

    public static Object kgy(Number number, Number number2) {
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
            return null;
        }
        return kgy(number.intValue(), number2);
    }
}
