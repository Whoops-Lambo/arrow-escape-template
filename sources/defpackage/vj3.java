package defpackage;

import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vj3 extends zba {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj3 b;

    public /* synthetic */ vj3(yj3 yj3Var, int i) {
        this.a = i;
        this.b = yj3Var;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public void Y0(Status status) {
        switch (this.a) {
            case 1:
                ((xj3) this.b).setResult(status);
                break;
            default:
                super.Y0(status);
                break;
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public void d1(Status status) {
        switch (this.a) {
            case 0:
                ((wj3) this.b).setResult(status);
                break;
            default:
                super.d1(status);
                break;
        }
    }
}
