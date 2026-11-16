package com.google.android.recaptcha.internal;

import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhb implements zzgx {

    @NotNull
    public static final zzhb zza = new zzhb();

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            y.e(4, 3, null);
            return;
        }
        Class<?> clsZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            y.e(4, 5, null);
            return;
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            y.e(4, 5, null);
            return;
        }
        try {
            zzgdVar.zzc().zze(i, cls.getField(zzgdVar.zzh().zza(str)));
        } catch (Exception e) {
            y.e(6, 10, e);
        }
    }

    private zzhb() {
    }
}
