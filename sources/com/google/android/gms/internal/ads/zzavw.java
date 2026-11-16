package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzavw extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzavw(zzavv zzavvVar, zzavt zzavtVar, long j) {
        int i = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i];
        objArr[0] = Long.valueOf(zzavvVar.a);
        objArr[1] = Long.valueOf(zzavtVar.a);
        int i2 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j);
        objArr[i2] = lValueOf;
        super(String.format(locale, zzawl.a("bk3t6gFTc30="), objArr));
        Optional.of(zzavtVar);
        Optional.of(lValueOf);
    }

    public zzavw(zzavv zzavvVar, Throwable th) {
        super(String.format(Locale.US, zzawl.a("bk0="), Long.valueOf(zzavvVar.a)), th);
        Optional.empty();
        Optional.empty();
    }
}
