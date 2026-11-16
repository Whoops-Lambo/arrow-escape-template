package defpackage;

import com.inmobi.media.C4155ka;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class da0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m32 b;

    public /* synthetic */ da0(m32 m32Var, int i) {
        this.a = i;
        this.b = m32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m32 m32Var = this.b;
        switch (i) {
            case 0:
                sr0 sr0Var = (sr0) m32Var.a;
                if (sr0Var != null) {
                    sr0Var.invoke();
                }
                break;
            case 1:
                C4155ka.a(m32Var);
                break;
            default:
                C4155ka.b(m32Var);
                break;
        }
    }
}
