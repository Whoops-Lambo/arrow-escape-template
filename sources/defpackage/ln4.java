package defpackage;

import com.google.android.gms.internal.ads.zzavy;
import com.google.android.gms.internal.ads.zzgvq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ln4 implements zzgvq {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn4 b;

    public /* synthetic */ ln4(mn4 mn4Var, int i) {
        this.a = i;
        this.b = mn4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgvq
    public final Object apply(Object obj) {
        int i = this.a;
        mn4 mn4Var = this.b;
        byte[] bArr = (byte[]) obj;
        switch (i) {
            case 0:
                mn4Var.g(new zzavy(), bArr, false);
                break;
            default:
                mn4Var.g(new zzavy(), bArr, true);
                break;
        }
        return null;
    }
}
