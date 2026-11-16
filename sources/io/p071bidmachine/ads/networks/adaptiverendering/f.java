package io.p071bidmachine.ads.networks.adaptiverendering;

import io.p071bidmachine.protobuf.rendering.Rendering;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rendering.Phase.ViewComponent.Layout.Constraint.Anchor b;

    public /* synthetic */ f(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor, int i) {
        this.a = i;
        this.b = anchor;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor = this.b;
        switch (i) {
            case 0:
                return "Unsupported SourceAnchor - " + anchor;
            default:
                return "Unsupported Anchor for SideType - " + anchor.name();
        }
    }
}
