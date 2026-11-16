package com.fyber.inneractive.sdk.config;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class s implements com.fyber.inneractive.sdk.network.f0 {
    public final /* synthetic */ v a;

    public s(v vVar) {
        this.a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        r rVar = (r) obj;
        if (rVar != null) {
            v vVar = this.a;
            if (rVar.equals(vVar.b)) {
                return;
            }
            vVar.d = true;
            vVar.b = rVar;
            com.fyber.inneractive.sdk.util.r.a.execute(new t(vVar));
        }
    }
}
