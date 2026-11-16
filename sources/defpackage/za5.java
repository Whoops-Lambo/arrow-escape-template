package defpackage;

import com.google.android.gms.internal.measurement.zzvr;
import com.google.android.gms.internal.measurement.zzwd;
import com.google.android.gms.internal.measurement.zzwu;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class za5 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ za5(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        zzwu zzwuVar = (zzwu) obj;
        switch (this.a) {
            case 0:
                zzvr zzvrVar = zzwd.g;
                zzwuVar.zza();
                break;
            default:
                zzwuVar.zza();
                break;
        }
    }
}
