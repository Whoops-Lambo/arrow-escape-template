package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzavd extends zzaua {
    private final Object zza;

    @Nullable
    @GuardedBy
    private final zzauf zzb;

    @Override // com.google.android.gms.internal.ads.zzaua
    public final zzaug zzr(zzatw zzatwVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzatwVar.b;
            Map map = zzatwVar.c;
            String str3 = C.ISO88591_NAME;
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(G5.N)) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzatwVar.b);
        }
        return new zzaug(str, zzaux.a(zzatwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzauf zzaufVar;
        synchronized (this.zza) {
            zzaufVar = this.zzb;
        }
        zzaufVar.zza(str);
    }

    public zzavd(int i, String str, zzauf zzaufVar, zzaue zzaueVar) {
        super(i, str, zzaueVar);
        this.zza = new Object();
        this.zzb = zzaufVar;
    }
}
