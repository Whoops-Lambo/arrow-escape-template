package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k {
    public static final ThreadLocal a = new ThreadLocal();
    public static final Class b;
    public static final long c;

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    static {
        Class<?> cls;
        long jM;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        b = cls;
        if (cls != null) {
            try {
                if (c9.e) {
                    jM = c9.c.m(cls.getDeclaredField("channel"));
                } else {
                    jM = -1;
                }
            } catch (Throwable unused2) {
            }
        } else {
            jM = -1;
        }
        c = jM;
    }
}
