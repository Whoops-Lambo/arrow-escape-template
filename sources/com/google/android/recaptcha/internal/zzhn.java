package com.google.android.recaptcha.internal;

import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhn implements zzgx {

    @NotNull
    public static final zzhn zza = new zzhn();

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 3) {
            y.e(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            y.e(4, 5, null);
            return;
        }
        try {
            field.set(zzgdVar.zzc().zza(zzueVarArr[1]), zzgdVar.zzc().zza(zzueVarArr[2]));
        } catch (Exception e) {
            y.e(6, 11, e);
        }
    }

    private zzhn() {
    }
}
