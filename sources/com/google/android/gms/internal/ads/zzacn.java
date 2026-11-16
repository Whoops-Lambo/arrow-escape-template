package com.google.android.gms.internal.ads;

import defpackage.jc1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacn extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzacn(Throwable th) {
        String strConcat;
        String simpleName = th.getClass().getSimpleName();
        if (th.getMessage() != null) {
            strConcat = ": ".concat(String.valueOf(th.getMessage()));
        } else {
            strConcat = "";
        }
        super(jc1.o("Unexpected ", simpleName, new StringBuilder(strConcat.length() + simpleName.length() + 11), strConcat), th);
    }
}
