package com.google.android.recaptcha.internal;

import io.p071bidmachine.media3.extractor.ts.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgo implements zzgx {

    @NotNull
    public static final zzgo zza = new zzgo();

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            y.e(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            y.e(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof String)) {
            objZza2 = null;
        }
        String str2 = (String) objZza2;
        if (str2 != null) {
            zzgdVar.zzc().zze(i, str.concat(str2));
        } else {
            y.e(4, 5, null);
        }
    }

    private zzgo() {
    }
}
