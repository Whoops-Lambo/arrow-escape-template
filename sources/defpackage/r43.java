package defpackage;

import com.mbridge.msdk.config.component.vc.VCCpt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VCCpt b;

    public /* synthetic */ r43(VCCpt vCCpt, int i) {
        this.a = i;
        this.b = vCCpt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        VCCpt vCCpt = this.b;
        switch (i) {
            case 0:
                vCCpt.m();
                break;
            default:
                vCCpt.l();
                break;
        }
    }
}
