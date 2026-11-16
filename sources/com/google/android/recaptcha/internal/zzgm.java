package com.google.android.recaptcha.internal;

import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgm implements zzgx {

    @NotNull
    public static final zzgm zza = new zzgm();

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        boolean z = true;
        if (zzueVarArr.length != 1) {
            y.e(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            y.e(4, 5, null);
            return;
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzgdVar.zzh().zza((String) objZza);
                }
                zzge zzgeVarZzc = zzgdVar.zzc();
                try {
                    zzgc.zza(objZza);
                } catch (zzce e) {
                    if (e.zzb() == 8 || e.zzb() == 6) {
                        z = false;
                    } else if (e.zzb() != 47) {
                        throw e;
                    }
                }
                zzgeVarZzc.zze(i, Boolean.valueOf(z));
            } catch (zzce e2) {
                throw e2;
            }
        } catch (Exception e3) {
            y.e(6, 8, e3);
        }
    }

    private zzgm() {
    }
}
