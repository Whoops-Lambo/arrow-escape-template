package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.C4788i2;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzces implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final com.google.android.gms.ads.internal.util.zzg c;
    public String d = C4788i2.f;
    public int e = -1;

    public final void a(String str, int i) {
        Context context;
        boolean z = true;
        boolean z2 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.t1)).booleanValue() && this.b.getInt("IABTCF_gdprApplies", -1) == 0) ? false : true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.q1)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z2) : !(i == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals(C4788i2.f))) && z2))) {
            z = false;
        }
        this.c.zzw(z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.u7)).booleanValue() && z && (context = this.a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.s1)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.a;
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.c;
                if (zEquals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i != zzgVar.zzD()) {
                        zzgVar.zzw(true);
                        com.google.android.gms.ads.internal.util.zzac.zza(context);
                    }
                    zzgVar.zzC(i);
                    return;
                }
                if (Objects.equals(str, AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
                    String string = sharedPreferences.getString(str, C4788i2.f);
                    String strZzB = zzgVar.zzB();
                    zzgVar.zzA(string);
                    if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.t1)).booleanValue() && sharedPreferences.getInt("IABTCF_gdprApplies", -1) == 0) || Objects.equals(string, strZzB)) {
                        return;
                    }
                    zzgVar.zzw(true);
                    com.google.android.gms.ads.internal.util.zzac.zza(context);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", C4788i2.f);
            int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals(C4788i2.f) || this.d.equals(string2)) {
                    return;
                }
                this.d = string2;
                a(string2, i2);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.q1)).booleanValue() || i2 == -1 || this.e == i2) {
                    return;
                }
                this.e = i2;
                a(string2, i2);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }

    public zzces(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = zzgVar;
        this.a = context;
    }
}
