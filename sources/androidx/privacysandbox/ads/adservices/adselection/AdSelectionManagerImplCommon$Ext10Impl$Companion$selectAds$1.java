package androidx.privacysandbox.ads.adservices.adselection;

import defpackage.dy;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@t50(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", l = {231}, m = "selectAds")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 extends fy {
    public Object r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, dy dyVar) {
        super(dyVar);
        this.t = companion;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(null, null, this);
    }
}
