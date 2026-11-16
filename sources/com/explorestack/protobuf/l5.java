package com.explorestack.protobuf;

import com.google.android.exoplayer2.C;
import defpackage.dr0;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class l5 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b = Charset.forName(C.ISO88591_NAME);
    public static final byte[] c;
    public static final ByteBuffer d;

    static {
        byte[] bArr = new byte[0];
        c = bArr;
        d = ByteBuffer.wrap(bArr);
        r.g(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        defpackage.d.w(str);
    }

    public static MessageLite b(Class cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", null);
            return (MessageLite) method.invoke(method, null);
        } catch (Exception e) {
            dr0.q("Failed to get default instance for ", cls, e);
            return null;
        }
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
