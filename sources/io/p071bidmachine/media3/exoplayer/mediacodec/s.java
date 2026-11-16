package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.text.TextUtils;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class s {
    public final String a;
    public final boolean b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.a, sVar.a) && this.b == sVar.b && this.c == sVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((n30.c(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public s(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
