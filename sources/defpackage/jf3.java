package defpackage;

import com.inmobi.media.AbstractC4230n1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC4230n1 b;

    public /* synthetic */ jf3(AbstractC4230n1 abstractC4230n1, int i) {
        this.a = i;
        this.b = abstractC4230n1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AbstractC4230n1 abstractC4230n1 = this.b;
        switch (i) {
            case 0:
                AbstractC4230n1.c(abstractC4230n1);
                break;
            default:
                AbstractC4230n1.b(abstractC4230n1);
                break;
        }
    }
}
