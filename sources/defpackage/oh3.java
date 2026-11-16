package defpackage;

import com.inmobi.media.C4435ub;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4435ub b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ oh3(C4435ub c4435ub, String str, String str2, int i) {
        this.a = i;
        this.b = c4435ub;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        C4435ub c4435ub = this.b;
        switch (i) {
            case 0:
                C4435ub.a(c4435ub, str2, str);
                break;
            case 1:
                C4435ub.c(c4435ub, str2, str);
                break;
            case 2:
                C4435ub.b(c4435ub, str2, str);
                break;
            case 3:
                C4435ub.d(c4435ub, str2, str);
                break;
            case 4:
                C4435ub.e(c4435ub, str2, str);
                break;
            default:
                C4435ub.f(c4435ub, str2, str);
                break;
        }
    }
}
