package com.google.android.gms.internal.ads;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzqz {
    public boolean a;
    public boolean b;
    public boolean c;

    public final zzra a() {
        if (this.a || !(this.b || this.c)) {
            return new zzra(this);
        }
        e32.i("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
