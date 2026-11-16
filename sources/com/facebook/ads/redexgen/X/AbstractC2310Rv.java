package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2310Rv implements InterfaceC2373Uj {
    public Looper A00;
    public Timeline A01;
    public QD A02;
    public final ArrayList<InterfaceC2372Ui> A05 = new ArrayList<>(1);
    public final HashSet<InterfaceC2372Ui> A06 = new HashSet<>(1);
    public final C2384Uu A04 = new C2384Uu();
    public final C2304Rp A03 = new C2304Rp();

    public abstract void A09();

    public abstract void A0A(InterfaceC2205Ni interfaceC2205Ni);

    public final QD A00() {
        return (QD) AbstractC2159Ln.A02(this.A02);
    }

    public final C2304Rp A01(C2299Rk c2299Rk) {
        return this.A03.A00(0, c2299Rk);
    }

    public final C2384Uu A02(C2299Rk c2299Rk) {
        return this.A04.A02(0, c2299Rk, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<InterfaceC2372Ui> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AH8(this, timeline);
        }
    }

    public final void A06(InterfaceC2372Ui interfaceC2372Ui) {
        boolean z = !this.A06.isEmpty();
        this.A06.remove(interfaceC2372Ui);
        if (z) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(InterfaceC2372Ui interfaceC2372Ui) {
        AbstractC2159Ln.A01(this.A00);
        boolean zIsEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC2372Ui);
        if (zIsEmpty) {
            A04();
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public final void A08(InterfaceC2372Ui interfaceC2372Ui, InterfaceC2205Ni interfaceC2205Ni, QD qd) {
        boolean z;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.A00;
        if (looper != null) {
            Looper looper2 = this.A00;
            if (looper2 == looperMyLooper) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        AbstractC2159Ln.A07(z);
        this.A02 = qd;
        Timeline timeline = this.A01;
        this.A05.add(interfaceC2372Ui);
        Looper looper3 = this.A00;
        if (looper3 == null) {
            this.A00 = looperMyLooper;
            this.A06.add(interfaceC2372Ui);
            A0A(interfaceC2205Ni);
        } else {
            if (timeline == null) {
                return;
            }
            A07(interfaceC2372Ui);
            interfaceC2372Ui.AH8(this, timeline);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2373Uj
    public final void A4P(Handler handler, InterfaceC2385Uv interfaceC2385Uv) {
        AbstractC2159Ln.A01(handler);
        AbstractC2159Ln.A01(interfaceC2385Uv);
        this.A04.A04(handler, interfaceC2385Uv);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2373Uj
    public final void AIK(InterfaceC2372Ui interfaceC2372Ui, InterfaceC2205Ni interfaceC2205Ni) {
        A08(interfaceC2372Ui, interfaceC2205Ni, QD.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2373Uj
    public final void AIz(InterfaceC2372Ui interfaceC2372Ui) {
        this.A05.remove(interfaceC2372Ui);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            A09();
            return;
        }
        A06(interfaceC2372Ui);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2373Uj
    public final void AJj(InterfaceC2385Uv interfaceC2385Uv) {
        this.A04.A0D(interfaceC2385Uv);
    }
}
