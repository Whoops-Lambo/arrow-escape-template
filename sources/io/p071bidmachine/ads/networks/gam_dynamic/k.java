package io.p071bidmachine.ads.networks.gam_dynamic;

import android.app.Activity;
import com.facebook.login.a0;
import defpackage.h50;
import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.ContextProvider;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.RendererConfiguration;
import io.p071bidmachine.ads.networks.gam.f;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.q0;
import io.p071bidmachine.unified.a;
import io.p071bidmachine.unified.c;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.unified.g;
import io.p071bidmachine.unified.h;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class k extends g {
    public final l a;
    public t b;
    public final /* synthetic */ int c;
    public j d;

    public k(m mVar, int i) {
        this.c = i;
        this.a = mVar;
    }

    @Override // io.p071bidmachine.unified.b
    public final Map a() {
        t tVar = this.b;
        if (tVar != null) {
            return tVar.g;
        }
        return null;
    }

    @Override // io.p071bidmachine.unified.b
    public final void b(ContextProvider contextProvider, c cVar, d dVar, a aVar, NetworkAdUnit networkAdUnit) {
        int i = this.c;
        l lVar = this.a;
        switch (i) {
            case 0:
                h hVar = (h) cVar;
                j jVar = new j(hVar, this);
                this.d = jVar;
                m mVar = (m) lVar;
                p pVarC = mVar.d.c(networkAdUnit);
                if (pVarC == null) {
                    io.p071bidmachine.core.a.b(mVar.a, new f(networkAdUnit, 4));
                    m.b(jVar, null, io.p071bidmachine.utils.a.c("Can't find reserved InternalAd by NetworkAdUnit"));
                } else if (!(pVarC instanceof u)) {
                    m.b(jVar, pVarC, io.p071bidmachine.utils.a.c("InternalAd object has an incompatible ad type"));
                } else {
                    pVarC.i = new WeakReference(jVar);
                    this.b = (u) pVarC;
                    ((AdProcessCallback) ((q0) hVar).a).processLoadSuccess();
                }
                break;
            default:
                h hVar2 = (h) cVar;
                j jVar2 = new j(hVar2, this);
                this.d = jVar2;
                m mVar2 = (m) lVar;
                p pVarC2 = mVar2.d.c(networkAdUnit);
                if (pVarC2 == null) {
                    io.p071bidmachine.core.a.b(mVar2.a, new f(networkAdUnit, 6));
                    m.b(jVar2, null, io.p071bidmachine.utils.a.c("Can't find reserved InternalAd by NetworkAdUnit"));
                } else if (!(pVarC2 instanceof v)) {
                    m.b(jVar2, pVarC2, io.p071bidmachine.utils.a.c("InternalAd object has an incompatible ad type"));
                } else {
                    pVarC2.i = new WeakReference(jVar2);
                    this.b = (v) pVarC2;
                    ((AdProcessCallback) ((q0) hVar2).a).processLoadSuccess();
                }
                break;
        }
    }

    @Override // io.p071bidmachine.unified.b
    public final void c() {
        boolean z = false;
        switch (this.c) {
            case 0:
                this.d = null;
                t tVar = this.b;
                if (tVar != null) {
                    int i = tVar.h;
                    if (i != 0 && h50.C(i) >= 4) {
                        z = true;
                    }
                    tVar.a(z);
                    this.b = null;
                }
                break;
            default:
                this.d = null;
                t tVar2 = this.b;
                if (tVar2 != null) {
                    int i2 = tVar2.h;
                    if (i2 != 0 && h50.C(i2) >= 4) {
                        z = true;
                    }
                    tVar2.a(z);
                    this.b = null;
                }
                break;
        }
    }

    @Override // io.p071bidmachine.unified.b
    public final void d() {
        t tVar = this.b;
        if (tVar != null) {
            tVar.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p071bidmachine.unified.g
    public final void f(ContextProvider contextProvider, h hVar, RendererConfiguration rendererConfiguration) {
        j jVar;
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            io.p071bidmachine.utils.a aVarC = io.p071bidmachine.utils.a.c("Activity is null");
            m mVar = (m) hVar;
            mVar.getClass();
            ((AdProcessCallback) mVar.a).processShowFail(aVarC);
            return;
        }
        t tVar = this.b;
        if (tVar == null) {
            io.p071bidmachine.utils.a aVarC2 = io.p071bidmachine.utils.a.c("Fullscreen object is null");
            m mVar2 = (m) hVar;
            mVar2.getClass();
            ((AdProcessCallback) mVar2.a).processShowFail(aVarC2);
            return;
        }
        if (tVar.h == 6) {
            io.p071bidmachine.utils.a aVarC3 = io.p071bidmachine.utils.a.c("Fullscreen object is expired");
            m mVar3 = (m) hVar;
            mVar3.getClass();
            ((AdProcessCallback) mVar3.a).processShowFail(aVarC3);
            return;
        }
        if (this.b.h == 3) {
            switch (this.c) {
                case 0:
                    jVar = this.d;
                    break;
                default:
                    jVar = this.d;
                    break;
            }
            if (jVar == null) {
                io.p071bidmachine.utils.a aVarC4 = io.p071bidmachine.utils.a.c("Fullscreen listener is null");
                m mVar4 = (m) hVar;
                mVar4.getClass();
                ((AdProcessCallback) mVar4.a).processShowFail(aVarC4);
                return;
            }
            t tVar2 = this.b;
            tVar2.getClass();
            j.l(new a0(28, tVar2, activity, jVar));
            return;
        }
        io.p071bidmachine.utils.a aVarC5 = io.p071bidmachine.utils.a.c("Fullscreen object not loaded");
        m mVar5 = (m) hVar;
        mVar5.getClass();
        ((AdProcessCallback) mVar5.a).processShowFail(aVarC5);
    }
}
