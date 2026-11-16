package com.google.android.gms.internal.auth;

import android.net.Uri;
import defpackage.e32;
import defpackage.k64;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcz {
    public final Uri a;
    public final String b = "";
    public final boolean c;

    public final zzcz a() {
        if (this.b.isEmpty()) {
            return new zzcz(this.a, true, this.c);
        }
        e32.i("Cannot set GServices prefix and skip GServices");
        return null;
    }

    public zzcz(Uri uri, boolean z, boolean z2) {
        this.a = uri;
        this.c = z2;
    }

    public final void b(long j) {
        new k64(this, Long.valueOf(j));
    }

    public final void c(boolean z) {
        new k64(this, Boolean.valueOf(z));
    }
}
