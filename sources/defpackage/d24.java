package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzebf;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d24 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final /* synthetic */ Object c;

    public d24(f24 f24Var, String str) {
        Objects.requireNonNull(f24Var);
        this.c = f24Var;
        this.b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.a) {
            case 0:
                f24 f24Var = (f24) this.c;
                synchronized (f24Var) {
                    try {
                        ArrayList arrayList = f24Var.b;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((zzcfh) obj).zza(this.b, str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                zzebf zzebfVar = (zzebf) this.c;
                String str2 = this.b;
                zzebfVar.i.set(zzac.zzb(zzebfVar.b, str2));
                return;
        }
    }

    public /* synthetic */ d24(zzebf zzebfVar, String str) {
        this.c = zzebfVar;
        this.b = str;
    }
}
