package com.google.android.recaptcha.internal;

import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.reflect.Proxy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgt implements zzgx {

    @NotNull
    public static final zzgt zza = new zzgt();

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length != 4 && length != 5) {
            y.e(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Integer)) {
            objZza = null;
        }
        Integer num = (Integer) objZza;
        if (num == null) {
            y.e(4, 5, null);
            return;
        }
        int iIntValue = num.intValue();
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num2 = (Integer) objZza2;
        if (num2 == null) {
            y.e(4, 5, null);
            return;
        }
        int iIntValue2 = num2.intValue();
        Object objZza3 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str = (String) objZza3;
        if (str == null) {
            y.e(4, 5, null);
            return;
        }
        String strZza = zzgdVar.zzh().zza(str);
        Object objZza4 = zzgdVar.zzc().zza(zzueVarArr[3]);
        if (true != (objZza4 instanceof String)) {
            objZza4 = null;
        }
        String str2 = (String) objZza4;
        if (str2 == null) {
            y.e(4, 5, null);
            return;
        }
        String strZza2 = zzgdVar.zzh().zza(str2);
        Object objZza5 = length == 5 ? zzgdVar.zzc().zza(zzueVarArr[4]) : null;
        zzfz zzfzVar = new zzfz(iIntValue2);
        try {
            Class clsZza = zzgc.zza(strZza);
            zzgdVar.zzc().zze(iIntValue, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzga(zzfzVar, strZza2, objZza5)));
            zzgdVar.zzc().zze(i, zzfzVar);
        } catch (Exception e) {
            y.e(6, 20, e);
        }
    }

    private zzgt() {
    }
}
