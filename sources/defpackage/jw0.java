package defpackage;

import com.inmobi.ads.InMobiNative;
import com.inmobi.media.Hd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jw0 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Hd b;

    public /* synthetic */ jw0(Hd hd, int i) {
        this.a = i;
        this.b = hd;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        Hd hd = this.b;
        InMobiNative inMobiNative = (InMobiNative) obj;
        switch (i) {
            case 0:
                return Hd.a(hd, inMobiNative);
            case 1:
                return Hd.f(hd, inMobiNative);
            case 2:
                return Hd.g(hd, inMobiNative);
            case 3:
                return Hd.b(hd, inMobiNative);
            case 4:
                return Hd.d(hd, inMobiNative);
            case 5:
                return Hd.e(hd, inMobiNative);
            case 6:
                return Hd.c(hd, inMobiNative);
            default:
                return Hd.h(hd, inMobiNative);
        }
    }
}
