package com.google.android.gms.internal.ads;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzrh {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d = 0;

    public final zzri a() {
        if (this.a || !(this.b || this.c)) {
            return new zzri(this);
        }
        e32.i("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        return null;
    }
}
