package com.google.android.recaptcha.internal;

import defpackage.n8;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzha implements zzgx {

    @NotNull
    public static final zzha zza = new zzha();

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            y.e(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            y.e(4, 5, null);
            return;
        }
        Class[] clsArrZzf = zzgdVar.zzc().zzf(n8.o0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e) {
            y.e(6, 9, e);
        }
    }

    private zzha() {
    }
}
