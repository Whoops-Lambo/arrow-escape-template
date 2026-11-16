package defpackage;

import com.adsurge.adn.E1.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ String c;

    public /* synthetic */ fh3(p pVar, String str, int i) {
        this.a = i;
        this.b = pVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        p pVar = this.b;
        switch (i) {
            case 0:
                pVar.a(str);
                break;
            default:
                pVar.a(str);
                break;
        }
    }
}
