package defpackage;

import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.common.util.d;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g63 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ g63(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                str.getClass();
                HashSet hashSet = h63.e;
                l71.k(str2, str, new float[0]);
                break;
            case 1:
                c.a(str2, str);
                break;
            default:
                d.b(str2, str);
                break;
        }
    }
}
