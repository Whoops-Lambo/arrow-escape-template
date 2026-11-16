package defpackage;

import com.google.android.gms.internal.measurement.zzabz;
import com.google.android.gms.internal.measurement.zzadz;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzin;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class am3 implements zzadz {
    public static final am3 b = new am3(0);
    public static final am3 c = new am3(1);
    public static final am3 d = new am3(2);
    public static final am3 e = new am3(3);
    public static final am3 f = new am3(4);
    public static final am3 g = new am3(5);
    public static final am3 h = new am3(6);
    public static final am3 i = new am3(7);
    public static final am3 j = new am3(8);
    public static final am3 k = new am3(9);
    public static final am3 l = new am3(10);
    public static final am3 m = new am3(11);
    public static final am3 n = new am3(12);
    public static final am3 o = new am3(13);
    public static final am3 p = new am3(14);
    public final /* synthetic */ int a;

    public /* synthetic */ am3(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzadz
    public final boolean zza(int i2) {
        switch (this.a) {
            case 0:
                return zzabz.a(i2) != null;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 2:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                return zzga.a(i2) != 0;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1;
            case 10:
                return i2 == 1 || i2 == 2;
            case 11:
                return zzin.a(i2) != null;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
