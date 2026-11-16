package defpackage;

import com.google.android.gms.internal.ads.zzeht;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzeht b;

    public /* synthetic */ cd4(zzeht zzehtVar, int i) {
        this.a = i;
        this.b = zzehtVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzeht zzehtVar = this.b;
        switch (i) {
            case 0:
                zzehtVar.a();
                break;
            default:
                zzehtVar.a();
                break;
        }
    }
}
