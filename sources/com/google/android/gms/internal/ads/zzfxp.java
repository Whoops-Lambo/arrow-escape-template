package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxp implements zzfxs {
    public static final zzfxp e = new zzfxp(new zzfxt());
    public Date a;
    public boolean b;
    public final zzfxt c;
    public boolean d;

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final void zzd(boolean z) {
        if (!this.d && z) {
            Date date = new Date();
            Date date2 = this.a;
            if (date2 == null || date.after(date2)) {
                this.a = date;
                if (this.b) {
                    Iterator it = Collections.unmodifiableCollection(zzfxr.c.b).iterator();
                    while (it.hasNext()) {
                        zzfyk zzfykVar = ((zzfwk) it.next()).d;
                        Date date3 = this.a;
                        zzfykVar.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.d = z;
    }

    public zzfxp(zzfxt zzfxtVar) {
        this.c = zzfxtVar;
    }
}
