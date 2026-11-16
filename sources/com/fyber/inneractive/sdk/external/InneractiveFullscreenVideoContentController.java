package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;
import com.fyber.inneractive.sdk.renderers.x;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class InneractiveFullscreenVideoContentController extends u0 {
    public void setControlledRenderer(x xVar) {
        new WeakReference(xVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        if (inneractiveAdSpot.getAdContent() instanceof t0) {
            return true;
        }
        return false;
    }
}
