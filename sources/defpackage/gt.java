package defpackage;

import com.inmobi.ads.InMobiNative;
import com.inmobi.media.Hd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gt implements wr0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt(StringBuilder sb, boolean z) {
        this.c = sb;
        this.b = z;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (ht.a.contains(b) || ht.f.contains(b)) {
                    sb.append((char) bByteValue);
                } else if (z && bByteValue == 32) {
                    sb.append('+');
                } else {
                    sb.append(ht.g(bByteValue));
                }
                return az2.a;
            default:
                return Hd.a(z, (Hd) obj2, (InMobiNative) obj);
        }
    }

    public /* synthetic */ gt(boolean z, Hd hd) {
        this.b = z;
        this.c = hd;
    }
}
