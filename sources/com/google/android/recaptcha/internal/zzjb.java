package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.dt1;
import defpackage.qh1;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjb {
    @NotNull
    public static final Map zza() {
        LinkedHashMap linkedHashMapZ = qh1.Z(new dt1(-4, zzba.zzo), new dt1(-12, zzba.zzp), new dt1(-6, zzba.zzk), new dt1(-11, zzba.zzm), new dt1(-13, zzba.zzq), new dt1(-14, zzba.zzr), new dt1(-2, zzba.zzl), new dt1(-7, zzba.zzs), new dt1(-5, zzba.zzt), new dt1(-9, zzba.zzu), new dt1(-8, zzba.zzE), new dt1(-15, zzba.zzn), new dt1(-1, zzba.zzv), new dt1(-3, zzba.zzx), new dt1(-10, zzba.zzy));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            linkedHashMapZ.put(-16, zzba.zzw);
        }
        if (i >= 27) {
            linkedHashMapZ.put(1, zzba.zzA);
            linkedHashMapZ.put(2, zzba.zzB);
            linkedHashMapZ.put(0, zzba.zzC);
            linkedHashMapZ.put(3, zzba.zzD);
        }
        if (i >= 29) {
            linkedHashMapZ.put(4, zzba.zzz);
        }
        return linkedHashMapZ;
    }
}
