package defpackage;

import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yr implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ li2 b;

    public /* synthetic */ yr(li2 li2Var, int i) {
        this.a = i;
        this.b = li2Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        li2 li2Var = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                return CleanUpWhenOpportunityExpires.invoke$lambda$2(li2Var, th);
            default:
                li2Var.cancel(null);
                return az2.a;
        }
    }
}
