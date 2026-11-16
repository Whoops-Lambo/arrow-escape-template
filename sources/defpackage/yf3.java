package defpackage;

import com.ironsource.C4922pb;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4922pb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yf3(C4922pb c4922pb, boolean z, int i) {
        this.a = i;
        this.b = c4922pb;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i = this.a;
        boolean z = this.c;
        C4922pb c4922pb = this.b;
        switch (i) {
            case 0:
                C4922pb.b(c4922pb, z);
                break;
            case 1:
                C4922pb.c(c4922pb, z);
                break;
            default:
                C4922pb.a(c4922pb, z);
                break;
        }
    }
}
