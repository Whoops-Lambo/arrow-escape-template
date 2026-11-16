package defpackage;

import com.google.android.gms.internal.games_v2.zzfv;
import com.google.android.gms.internal.games_v2.zzgz;
import com.google.android.gms.internal.games_v2.zzhh;
import com.google.android.gms.internal.games_v2.zzhj;
import com.google.android.gms.internal.games_v2.zzhw;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class bk4 implements BiConsumer {
    public static final /* synthetic */ bk4 b = new bk4(0);
    public static final /* synthetic */ bk4 c = new bk4(1);
    public static final /* synthetic */ bk4 d = new bk4(2);
    public final /* synthetic */ int a;

    public /* synthetic */ bk4(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((zzgz) obj).b(obj2);
                break;
            case 1:
                zzhw zzhwVar = (zzhw) obj2;
                zzhh zzhhVar = (zzhh) obj;
                zzhhVar.getClass();
                if (!zzhwVar.a.equals(zzhwVar.b)) {
                    zzhhVar.a.add(zzhwVar);
                } else {
                    d.r(zzfv.a("range must not be empty, but was %s", zzhwVar));
                }
                break;
            default:
                zzhj zzhjVar = (zzhj) obj;
                zzhjVar.getClass();
                obj2.getClass();
                zzhjVar.b(obj2);
                break;
        }
    }
}
