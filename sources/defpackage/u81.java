package defpackage;

import com.ironsource.AbstractC4860m3;
import com.ironsource.Ja;
import com.ironsource.S2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ja b;
    public final /* synthetic */ S2 c;
    public final /* synthetic */ AbstractC4860m3 d;

    public /* synthetic */ u81(Ja ja, S2 s2, AbstractC4860m3 abstractC4860m3, int i) {
        this.a = i;
        this.b = ja;
        this.c = s2;
        this.d = abstractC4860m3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AbstractC4860m3 abstractC4860m3 = this.d;
        S2 s2 = this.c;
        Ja ja = this.b;
        switch (i) {
            case 0:
                Ja.a(ja, s2, abstractC4860m3);
                break;
            default:
                Ja.d.a(ja, s2, abstractC4860m3);
                break;
        }
    }
}
