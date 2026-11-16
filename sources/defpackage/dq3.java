package defpackage;

import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzgwa;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dq3 implements zzgwa {
    public static final /* synthetic */ dq3 b = new dq3(0);
    public static final /* synthetic */ dq3 c = new dq3(1);
    public static final /* synthetic */ dq3 d = new dq3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ dq3(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwa
    public final /* synthetic */ boolean zza(Object obj) {
        switch (this.a) {
            case 0:
                zzaki zzakiVar = (zzaki) obj;
                return zzakiVar.b.equals("com.apple.iTunes") && zzakiVar.c.equals("iTunSMPB");
            case 1:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
