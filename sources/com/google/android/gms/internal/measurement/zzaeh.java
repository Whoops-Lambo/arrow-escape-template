package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzaeh extends IOException {
    private boolean a;

    public final void d() {
        this.a = true;
    }

    public final boolean f() {
        return this.a;
    }

    public zzaeh(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzaeh(String str) {
        super(str);
    }

    public zzaeh(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
