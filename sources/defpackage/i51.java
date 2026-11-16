package defpackage;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i51 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ i51(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        Context context = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                return InMobiSdk.b(context, str);
            default:
                return InMobiSdk.a(context, str);
        }
    }
}
