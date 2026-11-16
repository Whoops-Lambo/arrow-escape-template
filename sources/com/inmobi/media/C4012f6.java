package com.inmobi.media;

import com.singular.sdk.internal.UserDetailsUtils;
import java.io.File;

/* JADX INFO: renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4012f6 {
    public final String a;
    public final long[] b;
    public boolean c;
    public C3984e6 d;
    public final /* synthetic */ C4096i6 e;

    public C4012f6(C4096i6 c4096i6, String str) {
        this.e = c4096i6;
        this.a = str;
        this.b = new long[c4096i6.h];
    }

    public final File a(int i) {
        return new File(this.e.b, this.a + UserDetailsUtils.UserDetailsLiterals.DOT + i);
    }

    public final File b(int i) {
        return new File(this.e.b, this.a + UserDetailsUtils.UserDetailsLiterals.DOT + i + ".tmp");
    }
}
