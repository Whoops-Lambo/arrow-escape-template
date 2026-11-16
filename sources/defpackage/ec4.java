package defpackage;

import com.google.android.gms.internal.play_billing.zzfx;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ec4 implements zzfx {
    public static final ec4 b = new ec4(0);
    public static final ec4 c = new ec4(1);
    public static final ec4 d = new ec4(2);
    public static final ec4 e = new ec4(3);
    public static final ec4 f = new ec4(4);
    public static final ec4 g = new ec4(5);
    public static final ec4 h = new ec4(6);
    public static final ec4 i = new ec4(7);
    public final /* synthetic */ int a;

    public /* synthetic */ ec4(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final boolean zza(int i2) {
        zzjk zzjkVar;
        switch (this.a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                                break;
                            default:
                                return false;
                        }
                        break;
                }
                return true;
            case 2:
                return zzjd.a(i2) != null;
            case 3:
                if (i2 == 0) {
                    zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i2 == 1) {
                    zzjkVar = zzjk.PURCHASES_UPDATED_ACTION;
                } else if (i2 != 2) {
                    zzjkVar = i2 != 3 ? null : zzjk.ALTERNATIVE_BILLING_ACTION;
                } else {
                    zzjkVar = zzjk.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return zzjkVar != null;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i2 == 0 || i2 == 1;
        }
    }
}
