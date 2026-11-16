package defpackage;

import com.inmobi.media.De;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s50 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ De b;

    public /* synthetic */ s50(De de, int i) {
        this.a = i;
        this.b = de;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        De de = this.b;
        switch (i) {
            case 0:
                return De.a(de);
            default:
                return De.b(de);
        }
    }
}
