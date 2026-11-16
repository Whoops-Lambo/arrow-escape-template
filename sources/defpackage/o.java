package defpackage;

import com.inmobi.media.AbstractC3950d;
import com.ironsource.A;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr0 b;

    public /* synthetic */ o(sr0 sr0Var, int i) {
        this.a = i;
        this.b = sr0Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        sr0 sr0Var = this.b;
        switch (i) {
            case 0:
                return A.b(sr0Var);
            default:
                return AbstractC3950d.b(sr0Var);
        }
    }
}
