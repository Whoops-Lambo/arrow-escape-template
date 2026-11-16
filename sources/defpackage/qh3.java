package defpackage;

import com.inmobi.media.C4435ub;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4435ub b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ qh3(C4435ub c4435ub, boolean z, String str, int i) {
        this.a = i;
        this.b = c4435ub;
        this.c = z;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        boolean z = this.c;
        C4435ub c4435ub = this.b;
        switch (i) {
            case 0:
                C4435ub.a(c4435ub, z, str);
                break;
            default:
                C4435ub.b(c4435ub, z, str);
                break;
        }
    }
}
