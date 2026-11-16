package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements Runnable {
    public final /* synthetic */ i a;

    public d(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.a;
        boolean z = iVar.k;
        f fVar = iVar.l;
        if (z) {
            IAlog.a("No user web action detected for : %s blocking.", fVar);
            i iVar2 = this.a;
            String strC = iVar2.l.c();
            String strA = this.a.l.a();
            j1 j1Var = iVar2.g;
            if (j1Var != null) {
                j1Var.a(strC, strA);
            }
            IAlog.d("AD_AUTO_CLICK_DETECTED", new Object[0]);
            this.a.l.b();
            this.a.i();
        } else {
            IAlog.a("User web action detected for: %s", fVar);
            this.a.l.d();
        }
        this.a.l = null;
    }
}
