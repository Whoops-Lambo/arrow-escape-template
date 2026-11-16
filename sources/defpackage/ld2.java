package defpackage;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ld2 extends fy {
    public nd2 r;
    public SettingsInitializationParameters s;
    public /* synthetic */ Object t;
    public final /* synthetic */ nd2 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld2(nd2 nd2Var, fy fyVar) {
        super(fyVar);
        this.u = nd2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, this);
    }
}
