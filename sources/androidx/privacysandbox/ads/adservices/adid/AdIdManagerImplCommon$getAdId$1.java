package androidx.privacysandbox.ads.adservices.adid;

import defpackage.dy;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@t50(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", f = "AdIdManagerImplCommon.kt", l = {40}, m = "getAdId$suspendImpl")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AdIdManagerImplCommon$getAdId$1 extends fy {
    public AdIdManagerImplCommon r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AdIdManagerImplCommon t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManagerImplCommon$getAdId$1(AdIdManagerImplCommon adIdManagerImplCommon, dy dyVar) {
        super(dyVar);
        this.t = adIdManagerImplCommon;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return AdIdManagerImplCommon.b(this.t, this);
    }
}
