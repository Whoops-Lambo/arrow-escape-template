package com.google.android.recaptcha.internal;

import defpackage.n8;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhg implements zzgx {

    @NotNull
    public static final zzhg zza = new zzhg();

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            y.e(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Method)) {
            objZza = null;
        }
        Method method = (Method) objZza;
        if (method == null) {
            y.e(4, 5, null);
            return;
        }
        Object[] objArrZzg = zzgdVar.zzc().zzg(n8.o0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, method.invoke(null, Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e) {
            y.e(6, 15, e);
        }
    }

    private zzhg() {
    }
}
