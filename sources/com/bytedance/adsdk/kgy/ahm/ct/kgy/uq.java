package com.bytedance.adsdk.kgy.ahm.ct.kgy;

import defpackage.d;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class uq {
    public static Object kgy(Object obj, Number number) {
        if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return kgy(((Number) obj).intValue(), number);
        }
        if (obj instanceof Long) {
            return kgy(((Long) obj).longValue(), number);
        }
        if (obj instanceof Float) {
            return kgy(((Float) obj).floatValue(), number);
        }
        if (obj instanceof Double) {
            return kgy(((Double) obj).doubleValue(), number);
        }
        if (!(obj instanceof String)) {
            d.u(obj.getClass().getName().concat("This type of addition operation is not supported"));
            return null;
        }
        try {
            return kgy(Float.parseFloat((String) obj), number);
        } catch (NumberFormatException unused) {
            d.u(obj.getClass().getName().concat("This type of addition operation is not supported"));
            return null;
        }
    }

    private static Object kgy(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j < ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j) < number.doubleValue());
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return null;
    }

    private static Object kgy(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f < ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f < ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f) < number.doubleValue());
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return null;
    }

    private static Object kgy(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d < ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d < ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d < ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d < number.doubleValue());
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return null;
    }

    private static Object kgy(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i < number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i) < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i) < number.doubleValue());
        }
        d.u(q63.h(number, "This type of addition operation is not supported"));
        return null;
    }
}
