package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhz {
    public Uri a;
    public Map b;
    public long c;
    public final long d;
    public int e;

    public final zzia a() {
        zzgvz.h(this.a, "The uri must be set.");
        return new zzia(this.a, this.b, this.c, this.d, this.e);
    }

    public /* synthetic */ zzhz(zzia zziaVar) {
        this.a = zziaVar.a;
        this.b = zziaVar.b;
        this.c = zziaVar.c;
        this.d = zziaVar.d;
        this.e = zziaVar.e;
    }

    public zzhz() {
        this.b = Collections.EMPTY_MAP;
        this.d = -1L;
    }
}
