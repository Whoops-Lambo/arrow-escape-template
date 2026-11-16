package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfzm extends zzfzi {
    public final void b(String str) {
        zzfxr zzfxrVar = zzfxr.c;
        if (zzfxrVar != null) {
            for (zzfwk zzfwkVar : Collections.unmodifiableCollection(zzfxrVar.a)) {
                if (this.c.contains(zzfwkVar.g)) {
                    zzfyk zzfykVar = zzfwkVar.d;
                    if (this.e >= zzfykVar.c && zzfykVar.d != 3) {
                        zzfykVar.d = 3;
                        zzfxy.a.a(zzfykVar.c(), "setNativeViewHierarchy", str, zzfykVar.a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        b(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
