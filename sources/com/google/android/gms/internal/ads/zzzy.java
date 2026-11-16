package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.jc1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzzy extends zzat {
    public final zzgzb c;

    public zzzy(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.c = zzgzb.B(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzgzb zzgzbVar = this.c;
        String message = super.getMessage();
        if (zzgzbVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgzbVar);
        return jc1.o(message, "\nsniff failures: ", new StringBuilder(length + 17 + strValueOf.length()), strValueOf);
    }
}
