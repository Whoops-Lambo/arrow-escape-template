package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.C4664b4;
import defpackage.e32;
import defpackage.nj;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class k {
    public final Uri a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final int f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(this.a);
        sb.append(", ");
        sb.append(Arrays.toString((byte[]) null));
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        return nj.l(this.f, C4664b4.j.e, sb);
    }

    public k(Uri uri, long j, long j2, long j3, String str, int i) {
        if (j >= 0) {
            if (j2 >= 0) {
                if (j3 <= 0 && j3 != -1) {
                    e32.a();
                    throw null;
                }
                this.a = uri;
                this.b = j;
                this.c = j2;
                this.d = j3;
                this.e = str;
                this.f = i;
                return;
            }
            e32.a();
            throw null;
        }
        e32.a();
        throw null;
    }
}
