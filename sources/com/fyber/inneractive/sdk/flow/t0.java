package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class t0 extends w {
    public com.fyber.inneractive.sdk.player.t i;
    public boolean j;

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean b() {
        com.fyber.inneractive.sdk.config.y0 y0Var;
        com.fyber.inneractive.sdk.config.x0 x0Var = this.d;
        if (x0Var == null || (y0Var = ((com.fyber.inneractive.sdk.config.w0) x0Var).f) == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", IAlog.a(this), this.d);
            return false;
        }
        UnitDisplayType unitDisplayType = y0Var.j;
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        return this.i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.player.n nVar;
        int i = 0;
        if (this.g != null && b()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.g;
            v0Var.y = true;
            v0Var.D = false;
            v0Var.b.g.remove(v0Var);
            v0Var.i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.g = null;
        }
        com.fyber.inneractive.sdk.player.t tVar = this.i;
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.b bVar = tVar.a;
            if (bVar != null && (nVar = bVar.b) != null) {
                nVar.i = true;
                IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                nVar.a();
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar.u.b.a();
                if (bVarA != null) {
                    bVarA.destroy();
                }
                if (nVar.a != null) {
                    IAlog.a("%s : destroy() : playerController being destroyed", InneractiveMediationDefs.GENDER_FEMALE);
                    nVar.a.a();
                    nVar.a = null;
                }
                nVar.l = null;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.u;
                if (kVar != null) {
                    com.fyber.inneractive.sdk.flow.endcard.m mVar = kVar.b;
                    ArrayList arrayList = mVar.a;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((com.fyber.inneractive.sdk.flow.endcard.b) obj).destroy();
                    }
                    mVar.a.clear();
                    mVar.b.clear();
                    mVar.c = -1;
                }
                com.fyber.inneractive.sdk.player.ui.remote.g gVar = nVar.v;
                if (gVar != null) {
                    gVar.a.a();
                }
                com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = nVar.w;
                if (bVar2 != null) {
                    bVar2.a.a();
                    bVar2.a();
                    bVar2.e = null;
                    bVar2.h.clear();
                }
            }
            this.i = null;
        }
    }

    public t0(com.fyber.inneractive.sdk.config.x0 x0Var, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(x0Var, rVar);
        this.j = false;
        this.b = gVar;
        this.a = inneractiveAdRequest;
    }
}
