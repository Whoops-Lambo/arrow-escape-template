package com.mbridge.msdk.foundation.same.net;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class e<T> {
    public com.mbridge.msdk.foundation.same.net.exception.a a = null;
    public com.mbridge.msdk.foundation.same.net.toolbox.a b;
    public T c;

    public static <T> e<T> a(T t, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        return new e<>(t, aVar);
    }

    private e(T t, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.c = t;
        this.b = aVar;
    }
}
