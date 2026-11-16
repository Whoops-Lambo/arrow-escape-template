package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcew;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import defpackage.f24;
import defpackage.z14;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzcfe {
    public static z14 a;

    public abstract zzcew a();

    public static synchronized zzcfe b(Context context) {
        try {
            z14 z14Var = a;
            if (z14Var != null) {
                return z14Var;
            }
            Context applicationContext = context.getApplicationContext();
            zzbjr.a(applicationContext);
            com.google.android.gms.ads.internal.util.zzj zzjVarG = com.google.android.gms.ads.internal.zzt.zzh().g();
            zzjVarG.zza(applicationContext);
            applicationContext.getClass();
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            clockZzk.getClass();
            zzcfd zzcfdVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
            zzipn.b(zzcfd.class, zzcfdVarZzD);
            z14 z14Var2 = new z14(applicationContext, clockZzk, zzjVarG, zzcfdVarZzD);
            a = z14Var2;
            zzces zzcesVar = (zzces) z14Var2.c.zzb();
            SharedPreferences sharedPreferences = zzcesVar.b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzcesVar);
            zzcesVar.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.s1)).booleanValue()) {
                zzcesVar.onSharedPreferenceChanged(sharedPreferences, AndroidTcfDataSource.TCF_TCSTRING_KEY);
            } else {
                zzcesVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            final f24 f24Var = (f24) a.e.zzb();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.m1)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                final Map mapZzx = com.google.android.gms.ads.internal.util.zzs.zzx((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.n1));
                Iterator it = mapZzx.keySet().iterator();
                while (it.hasNext()) {
                    f24Var.a((String) it.next());
                }
                zzcfh zzcfhVar = new zzcfh() { // from class: e24
                    @Override // com.google.android.gms.internal.ads.zzcfh
                    public final void zza(String str, String str2) {
                        f24 f24Var2 = f24Var;
                        f24Var2.getClass();
                        Map map = mapZzx;
                        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
                            zzcew zzcewVar = f24Var2.d;
                            zzcewVar.b.a(-1, zzcewVar.a.currentTimeMillis());
                        }
                    }
                };
                synchronized (f24Var) {
                    f24Var.b.add(zzcfhVar);
                }
            }
            return a;
        } catch (Throwable th) {
            throw th;
        }
    }
}
