package io.p071bidmachine.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h0 extends Exception {
    private static final String d;
    private static final String e;
    private static final String f;
    private static final String g;
    private static final String h;
    private static final String i;
    public final int a;
    public final long b;
    public final Bundle c;

    static {
        int i2 = x.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
        h = Integer.toString(4, 36);
        i = Integer.toString(5, 36);
    }

    public h0(@Nullable String str, @Nullable Throwable th, int i2, Bundle bundle, long j) {
        super(str, th);
        this.a = i2;
        this.c = bundle;
        this.b = j;
    }
}
