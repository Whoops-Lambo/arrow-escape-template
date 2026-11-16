package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbmi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vy3 implements zzbmi {
    public final /* synthetic */ SharedPreferences a;

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final String a(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final Double b(String str, double d) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final Boolean c(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final Long d(long j, String str) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Long.valueOf(sharedPreferences.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }

    public vy3(zzbjp zzbjpVar, SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }
}
