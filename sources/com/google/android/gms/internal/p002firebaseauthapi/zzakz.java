package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.h50;
import defpackage.n30;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakz extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    private zzakz(long j, long j2, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbO = h50.o(j, "Pos: ", ", limit: ");
        sbO.append(j2);
        sbO.append(", len: ");
        sbO.append(i);
        this(sbO.toString(), th);
    }

    public zzakz(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    private zzakz(String str, Throwable th) {
        super(n30.y("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public zzakz(int i, int i2, int i3, Throwable th) {
        this(i, i2, i3, th);
    }

    public zzakz() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
