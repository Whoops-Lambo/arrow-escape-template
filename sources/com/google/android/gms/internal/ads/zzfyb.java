package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfyb {
    public static final zzfyb d = new zzfyb();
    public WeakReference a;
    public boolean b = false;
    public boolean c = false;

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(zzfxr.c.a).iterator();
        while (it.hasNext()) {
            zzfyk zzfykVar = ((zzfwk) it.next()).d;
            boolean z3 = z2 || z;
            if (zzfykVar.b.get() != 0) {
                zzfxy.a.a(zzfykVar.c(), "setDeviceLockState", true != z3 ? "unlocked" : "locked");
            }
        }
    }
}
