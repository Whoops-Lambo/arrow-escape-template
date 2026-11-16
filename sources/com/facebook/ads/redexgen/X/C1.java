package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C1 extends AbstractC3075jE {
    public static String[] A08 = {"FXqlzRGtImhOdfWqCRyac46PuEORcVHh", "tin0mHuxCmVFWzwOygyTfmqlJ9Mzxl7D", "VABdh0TJ2eWi98wNTSIP5bEHQKFvO8pS", "n", "wryP", "p7AsImouYb7XdSCXwl9kOcdMHl7Wlu5Y", "TIzINHzpeOxuFps4upXK4j08MllXArTc", "oGk0V5WwsqztiP1ME5WI8pfP"};
    public C2847fT A00;
    public AbstractC2637c3 A01;
    public C2636c2 A02;
    public final SparseBooleanArray A03;
    public final C2055Hi A04;
    public final AbstractC17605h A05;
    public final C2636c2 A06;
    public final boolean A07;

    public C1(AbstractC17605h abstractC17605h, SparseBooleanArray sparseBooleanArray, C2636c2 c2636c2, C2055Hi c2055Hi, C2847fT c2847fT, boolean z) {
        super(abstractC17605h);
        this.A04 = c2055Hi;
        this.A05 = abstractC17605h;
        this.A03 = sparseBooleanArray;
        this.A06 = c2636c2;
        this.A00 = c2847fT;
        this.A07 = z;
    }

    private void A05(InterfaceC3321nG interfaceC3321nG, C3514qT c3514qT, String str, List<C3059iy> list) {
        boolean z = false;
        final boolean z2 = false;
        Iterator<C3059iy> it = list.iterator();
        while (hasUnloggedCard) {
            C3059iy next = it.next();
            boolean hasUnloggedCard = this.A03.get(next.A02());
            if (!hasUnloggedCard) {
                z = true;
            }
            if (next.A02() == 0) {
                z2 = true;
            }
            if (z && z2) {
                break;
            }
        }
        if (!z) {
            return;
        }
        if (this.A02 != null) {
            this.A02.A0V();
            this.A02 = null;
        }
        this.A01 = new C2(this, str, list, c3514qT, interfaceC3321nG);
        this.A02 = new C2636c2(this.A05, 10, new WeakReference(this.A01), this.A04);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A05.setOnAssetsLoadedListener(new InterfaceC3846vp() { // from class: com.facebook.ads.redexgen.X.C3
            @Override // com.facebook.ads.redexgen.X.InterfaceC3846vp
            public final void ADv() {
                this.A00.A0x(z2);
            }
        });
    }

    public final void A0w(InterfaceC3056iv interfaceC3056iv, int i, InterfaceC3321nG interfaceC3321nG, C3183kz c3183kz, C3514qT c3514qT, String str) {
        this.A05.A1u(this.A04, interfaceC3056iv);
        this.A05.setTag(-1593835536, Integer.valueOf(i));
        this.A05.A1p();
        List<C3059iy> listA7q = interfaceC3056iv.A7q();
        if (listA7q != null && !listA7q.isEmpty()) {
            Iterator<C3059iy> it = listA7q.iterator();
            while (it.hasNext()) {
                this.A05.A1v(it.next().A08());
            }
            A05(interfaceC3321nG, c3514qT, str, listA7q);
        }
    }

    public final /* synthetic */ void A0x(boolean z) {
        if (z) {
            C2636c2 c2636c2 = this.A06;
            if (A08[3].length() != 1) {
                throw new RuntimeException();
            }
            A08[3] = "M";
            c2636c2.A0U();
        }
        if (this.A02 != null) {
            this.A02.A0U();
        }
    }
}
