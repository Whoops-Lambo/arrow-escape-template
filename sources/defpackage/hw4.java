package defpackage;

import com.google.android.gms.internal.ads.zzhgt;
import com.google.android.gms.internal.ads.zzhgw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class hw4 extends zzhgt {
    public final String a;
    public final zzhgw b;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.b != zzhgw.e;
    }

    public final String toString() {
        return n30.n("(typeUrl=", this.a, ", outputPrefixType=", this.b.a, ")");
    }

    public /* synthetic */ hw4(String str, zzhgw zzhgwVar) {
        this.a = str;
        this.b = zzhgwVar;
    }
}
