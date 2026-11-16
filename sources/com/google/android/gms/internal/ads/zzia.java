package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.C4664b4;
import defpackage.h50;
import defpackage.n30;
import defpackage.nj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzia {
    public static final /* synthetic */ int f = 0;
    public final Uri a;
    public final Map b;
    public final long c;
    public final long d;
    public final int e;

    static {
        zzal.a("media3.datasource");
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        long j = this.c;
        int length2 = String.valueOf(j).length();
        long j2 = this.d;
        int length3 = String.valueOf(j2).length();
        int i = this.e;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        h50.x("DataSpec[GET ", string, sb, ", ");
        sb.append(j);
        n30.x(sb, ", ", j2, ", null, ");
        return nj.l(i, C4664b4.j.e, sb);
    }

    public zzia(Uri uri, Map map, long j, long j2, int i) {
        boolean z;
        boolean z2 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        zzgvz.a(z);
        if (j2 <= 0) {
            if (j2 == -1) {
                j2 = -1;
                z2 = true;
            }
        } else {
            z2 = true;
        }
        zzgvz.a(z2);
        uri.getClass();
        this.a = uri;
        this.b = Collections.unmodifiableMap(new HashMap(map));
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public zzia(Uri uri, long j, long j2) {
        this(uri, Collections.EMPTY_MAP, j, j2, 0);
    }
}
