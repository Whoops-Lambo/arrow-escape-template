package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC3454pV implements Runnable {
    public final /* synthetic */ C2054Hh A00;
    public final /* synthetic */ InterfaceC3493q8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ int[] A03;

    public RunnableC3454pV(int[] iArr, String str, C2054Hh c2054Hh, InterfaceC3493q8 interfaceC3493q8) {
        this.A03 = iArr;
        this.A02 = str;
        this.A00 = c2054Hh;
        this.A01 = interfaceC3493q8;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            int[] iArr = this.A03;
            iArr[0] = iArr[0] + 1000;
            if (this.A03[0] > 600000) {
                AbstractC3455pW.A01.removeCallbacks(this);
                AbstractC3455pW.A02.remove(this.A02);
            } else {
                if (AbstractC3455pW.A08(this.A00.getPackageManager(), this.A02)) {
                    AbstractC3455pW.A01.removeCallbacks(this);
                    AbstractC3455pW.A02.remove(this.A02);
                    this.A01.AGB(this.A02);
                    return;
                }
                AbstractC3455pW.A01.postDelayed(this, 1000L);
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
