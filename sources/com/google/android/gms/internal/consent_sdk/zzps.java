package com.google.android.gms.internal.consent_sdk;

import defpackage.h50;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzps extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzps(long j, long j2, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbO = h50.o(j, "Pos: ", ", limit: ");
        sbO.append(j2);
        sbO.append(", len: ");
        sbO.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbO.toString()), th);
    }

    public zzps() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzps(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
