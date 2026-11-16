package androidx.privacysandbox.ads.adservices.appsetid;

import defpackage.dy;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@t50(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", l = {38}, m = "getAppSetId$suspendImpl")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AppSetIdManagerImplCommon$getAppSetId$1 extends fy {
    public AppSetIdManagerImplCommon r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AppSetIdManagerImplCommon t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManagerImplCommon$getAppSetId$1(AppSetIdManagerImplCommon appSetIdManagerImplCommon, dy dyVar) {
        super(dyVar);
        this.t = appSetIdManagerImplCommon;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return AppSetIdManagerImplCommon.b(this.t, this);
    }
}
