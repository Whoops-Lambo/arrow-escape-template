package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.q0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.y0;
import com.fyber.inneractive.sdk.factories.h;
import com.fyber.inneractive.sdk.flow.g0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.r0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class InneractiveAdViewUnitController extends s0 implements g0, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;
    public final HashSet a;
    public boolean b;
    public ViewGroup c;
    public final int d;
    protected int mAdContentHeight;
    protected int mAdContentWidth;

    public final void a() {
        this.b = true;
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.a.clear();
        this.c = null;
        super.destroy();
    }

    public void refreshAd() {
        IAlog.a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) v.a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof r0)) {
            return;
        }
        ((r0) inneractiveAdSpot).a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return true;
    }

    public int getAdContentHeight() {
        int iN;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (iN = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).n()) > 0) {
                return iN;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int iD;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (iD = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).d()) > 0) {
                return iD;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        com.fyber.inneractive.sdk.interfaces.f fVarB;
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) v.a(this.mAdSpot);
        for (com.fyber.inneractive.sdk.factories.g gVar : h.a.a) {
            if (gVar.a(inneractiveAdSpot)) {
                fVarB = gVar.b(inneractiveAdSpot);
                this.a.add(fVarB);
                return fVarB;
            }
        }
        fVarB = null;
        this.a.add(fVarB);
        return fVarB;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).p();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.interfaces.d dVar;
        Iterator it = new HashSet(this.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (dVar != null) {
            dVar.a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof h0) {
                int i = IAlog.a;
                IAlog.d("%s %s", "AD_REFRESH", ((h0) inneractiveAdSpot).h.d.b());
            }
        } catch (Exception unused) {
        }
        IAlog.a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void unbindView(View view) {
        if (this.c != view) {
            IAlog.f("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.c, view);
        } else {
            this.c = null;
        }
        IAlog.a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(view)) {
                    IAlog.a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    dVar.s();
                    this.a.remove(dVar);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.d = i;
        } else {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
            this.d = 30;
        }
    }

    public void bindView(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.interfaces.d dVarA;
        IAlog.a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(viewGroup)) {
                    dVar.l();
                    IAlog.a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), dVar);
                    return;
                }
            }
        }
        this.c = viewGroup;
        Iterator it = com.fyber.inneractive.sdk.factories.b.a.a.iterator();
        while (true) {
            if (it.hasNext()) {
                com.fyber.inneractive.sdk.factories.a aVar = (com.fyber.inneractive.sdk.factories.a) it.next();
                if (aVar.a(adSpot)) {
                    dVarA = aVar.a();
                    break;
                }
            } else {
                dVarA = null;
                break;
            }
        }
        int i = this.d;
        if (i != 0) {
            dVarA.a(i);
        }
        if (dVarA != null) {
            dVarA.initialize(adSpot);
            selectContentController();
            dVarA.a(viewGroup);
            this.a.add(dVarA);
            IAlog.a("%sPPPP bindView created renderer %s", logPrefix(), dVarA);
            return;
        }
        IAlog.f("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!((InneractiveAdRenderer) it.next()).canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            a();
        } else {
            r.b.post(new e(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        w0 w0Var = (w0) inneractiveAdSpot.getAdContent().d;
        if (w0Var.e != null) {
            return false;
        }
        q0 q0Var = w0Var.c;
        if (q0Var != null) {
            if (UnitDisplayType.BANNER.equals(q0Var.b) || UnitDisplayType.MRECT.equals(q0Var.b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(q0Var.b)) {
                if (inneractiveAdSpot.getCurrentProcessedRequest() == null || !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen()) {
                    return false;
                }
                return true;
            }
        }
        y0 y0Var = w0Var.f;
        if (y0Var == null || (!UnitDisplayType.LANDSCAPE.equals(y0Var.j) && !UnitDisplayType.SQUARE.equals(y0Var.j) && !UnitDisplayType.MRECT.equals(y0Var.j))) {
            return false;
        }
        return true;
    }

    public void unbindFullscreenRenderer(com.fyber.inneractive.sdk.interfaces.f fVar) {
        WeakReference<i0> weakReference;
        IAlog.a("%sremoving full screen ad renderer %s", logPrefix(), fVar);
        HashSet hashSet = this.a;
        if (hashSet != null) {
            hashSet.remove(fVar);
        }
        if (!this.b) {
            for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.a)) {
                if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                    ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).q();
                    if (this.mEventsListener != null && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                        ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                    }
                }
            }
        }
    }

    public InneractiveAdViewUnitController() {
        this.b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.d = 0;
        this.a = new HashSet();
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.d = -1;
        }
    }
}
