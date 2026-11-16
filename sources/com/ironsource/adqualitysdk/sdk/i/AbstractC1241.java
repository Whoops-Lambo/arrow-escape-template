package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﹱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC1241 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final /* synthetic */ int f3758 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m891(Context context) {
        Class<?> cls;
        try {
            String strDecrypt = StringFog.decrypt("jHFwaVl8mSrDc3t4V3mfIIJ+cHhXZok/jHF1fFNn0zGCcWB+WGHTHoJ8dXd0Z5IziXx1aEJYnDyM\neHFp\n", "7R8UGzYV/VI=\n");
            String str = AbstractC0951.f2572;
            try {
                cls = Class.forName(strDecrypt);
            } catch (Throwable unused) {
                cls = null;
            }
            return AbstractC0951.m734(cls, StringFog.decrypt("laiczQSQemOcro0=\n", "8s3ohGrjDgI=\n"), Arrays.asList(context)).invoke(null, context);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            return null;
        }
    }

    static {
        StringFog.decrypt("zuLelhDPgurj6d6WD/m95Ozs2pIOzpzk8f78kx39hODw\n", "go2993yN8IU=\n");
    }
}
