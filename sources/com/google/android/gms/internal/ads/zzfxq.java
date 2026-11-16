package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxq extends zzfxt {
    public static final zzfxq d = new zzfxq();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfxt
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(zzfxr.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((zzfwk) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final void c(boolean z) {
        Iterator it = Collections.unmodifiableCollection(zzfxr.c.a).iterator();
        while (it.hasNext()) {
            zzfyk zzfykVar = ((zzfwk) it.next()).d;
            if (zzfykVar.b.get() != 0) {
                zzfxy.a.a(zzfykVar.c(), "setState", true != z ? "backgrounded" : "foregrounded", zzfykVar.a);
            }
        }
    }

    private zzfxq() {
    }
}
