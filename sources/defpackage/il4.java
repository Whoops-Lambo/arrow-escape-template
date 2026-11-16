package defpackage;

import com.google.android.gms.internal.auth.zzfx;
import com.google.android.gms.internal.auth.zzhs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class il4 {
    public final zzfx a;
    public final Object[] b;
    public final int c;

    public il4(zzhs zzhsVar, Object[] objArr) {
        this.a = zzhsVar;
        this.b = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.c = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i2);
            if (cCharAt2 >= 55296) {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.c = i | (cCharAt2 << i3);
                return;
            }
        }
    }
}
