package io.p071bidmachine.media3.datasource;

import android.net.Uri;
import com.ironsource.C4664b4;
import com.ironsource.C4887nc;
import defpackage.nj;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.z;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k {
    public static final /* synthetic */ int i = 0;
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    static {
        z.a("media3.datasource");
    }

    public final k a(long j) {
        long j2 = this.f;
        long j3 = j2 != -1 ? j2 - j : -1L;
        if (j == 0 && j2 == j3) {
            return this;
        }
        return new k(this.a, this.b, this.c, this.d, this.e + j, j3, this.g, this.h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i2 = this.b;
        if (i2 == 1) {
            str = C4887nc.a;
        } else if (i2 == 2) {
            str = "POST";
        } else {
            if (i2 != 3) {
                y.b();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        return nj.l(this.h, C4664b4.j.e, sb);
    }

    public k(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        boolean z;
        boolean z2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        if (j >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a.c(z2);
        a.c(j2 > 0 || j2 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i2;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = i3;
    }
}
