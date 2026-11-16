package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.ar4;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzz {
    public String a;
    public Uri b;
    public final List c;
    public final w d;
    public final zzai e;

    public final zzak a() {
        Uri uri = this.b;
        zzag zzagVar = uri != null ? new zzag(uri, this.c, this.d) : null;
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return new zzak(str, new zzac(), zzagVar, new zzaf(), zzan.C, this.e);
    }

    public zzz() {
        new zzaa();
        ar4 ar4Var = zzgzb.b;
        w wVar = w.e;
        this.c = Collections.EMPTY_LIST;
        this.d = w.e;
        new zzae();
        this.e = zzai.a;
    }
}
