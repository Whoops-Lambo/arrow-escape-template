package defpackage;

import com.google.android.gms.internal.ads.zziet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ux4 extends le1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux4(zziet zzietVar, int i) {
        super(zzietVar);
        this.f = i;
    }

    @Override // defpackage.le1, java.util.Iterator
    public Object next() {
        switch (this.f) {
            case 1:
                return b().f;
            default:
                return super.next();
        }
    }
}
