package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class zznn extends IOException {
    private boolean zza;

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zznn(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zznn(String str) {
        super(str);
    }
}
