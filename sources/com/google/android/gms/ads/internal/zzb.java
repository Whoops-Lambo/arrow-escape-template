package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcbo;
import com.google.android.gms.internal.ads.zzcer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;

    @Nullable
    private final zzcer zzc;
    private final zzcbo zzd = new zzcbo(Collections.EMPTY_LIST, false);

    public final void zza() {
        this.zzb = true;
    }

    private final boolean zzd() {
        zzcer zzcerVar = this.zzc;
        return (zzcerVar != null && zzcerVar.zza().f) || this.zzd.a;
    }

    public zzb(Context context, @Nullable zzcer zzcerVar, @Nullable zzcbo zzcboVar) {
        this.zza = context;
        this.zzc = zzcerVar;
    }

    public final boolean zzb() {
        if (zzd() && !this.zzb) {
            return false;
        }
        return true;
    }

    public final void zzc(@Nullable String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcer zzcerVar = this.zzc;
            if (zzcerVar != null) {
                zzcerVar.b(3, str, null);
                return;
            }
            zzcbo zzcboVar = this.zzd;
            if (zzcboVar.a && (list = zzcboVar.b) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.zza;
                        zzt.zzc();
                        com.google.android.gms.ads.internal.util.zzs.zzO(context, "", strReplace);
                    }
                }
            }
        }
    }
}
