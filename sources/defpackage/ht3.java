package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzamv;
import com.google.android.gms.internal.p002firebaseauthapi.zzanh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ht3 {
    public final zzamv a;
    public final String b;
    public final Object[] c;
    public final int d;

    public final zzanh a() {
        int i = this.d;
        if ((i & 1) != 0) {
            return zzanh.a;
        }
        return (i & 4) == 4 ? zzanh.c : zzanh.b;
    }

    public ht3(zzamv zzamvVar, String str, Object[] objArr) {
        this.a = zzamvVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 >= 55296) {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (cCharAt2 << i2);
                return;
            }
        }
    }
}
