package com.facebook.ads.redexgen.X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C7S extends AbstractC2073Ia {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC3075jE> A0A = new ArrayList<>();
    public ArrayList<AbstractC3075jE> A07 = new ArrayList<>();
    public ArrayList<C3031iU> A09 = new ArrayList<>();
    public ArrayList<C3030iT> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC3075jE>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C3031iU>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C3030iT>> A03 = new ArrayList<>();
    public ArrayList<AbstractC3075jE> A00 = new ArrayList<>();
    public ArrayList<AbstractC3075jE> A04 = new ArrayList<>();
    public ArrayList<AbstractC3075jE> A06 = new ArrayList<>();
    public ArrayList<AbstractC3075jE> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final void A0H() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C3031iU c3031iU = this.A09.get(size);
            View view = c3031iU.A04.A0H;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            A0U(c3031iU.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0V(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC3075jE abstractC3075jE = this.A07.get(size3);
            abstractC3075jE.A0H.setAlpha(1.0f);
            A0T(abstractC3075jE);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A00(this.A08.get(size4));
        }
        this.A08.clear();
        if (A0M()) {
            for (int size5 = this.A05.size() - 1; size5 >= 0; size5--) {
                ArrayList<C3031iU> arrayList = this.A05.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C3031iU c3031iU2 = arrayList.get(size6);
                    View view2 = c3031iU2.A04.A0H;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    A0U(c3031iU2.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A05.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A01.size() - 1; size7 >= 0; size7--) {
                ArrayList<AbstractC3075jE> arrayList2 = this.A01.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AbstractC3075jE abstractC3075jE2 = arrayList2.get(size8);
                    abstractC3075jE2.A0H.setAlpha(1.0f);
                    A0T(abstractC3075jE2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A01.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A03.size() - 1; size9 >= 0; size9--) {
                ArrayList<C3030iT> arrayList3 = this.A03.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    A00(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.A03.remove(arrayList3);
                    }
                }
            }
            A03(this.A06);
            A03(this.A04);
            A03(this.A00);
            A03(this.A02);
            A0G();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final void A0I() {
        boolean z = !this.A0A.isEmpty();
        boolean z2 = !this.A09.isEmpty();
        boolean z3 = !this.A08.isEmpty();
        boolean z4 = !this.A07.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<AbstractC3075jE> it = this.A0A.iterator();
            while (it.hasNext()) {
                A01(it.next());
            }
            this.A0A.clear();
            if (z2) {
                ArrayList<C3031iU> arrayList = new ArrayList<>();
                arrayList.addAll(this.A09);
                this.A05.add(arrayList);
                this.A09.clear();
                RunnableC3022iL runnableC3022iL = new RunnableC3022iL(this, arrayList);
                if (z) {
                    AbstractC2977hb.A0E(arrayList.get(0).A04.A0H, runnableC3022iL, A0D());
                } else {
                    runnableC3022iL.run();
                }
            }
            if (z3) {
                ArrayList<C3030iT> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.A08);
                this.A03.add(arrayList2);
                this.A08.clear();
                RunnableC3023iM runnableC3023iM = new RunnableC3023iM(this, arrayList2);
                if (z) {
                    AbstractC2977hb.A0E(arrayList2.get(0).A05.A0H, runnableC3023iM, A0D());
                } else {
                    runnableC3023iM.run();
                }
            }
            if (z4) {
                ArrayList<AbstractC3075jE> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.A07);
                this.A01.add(arrayList3);
                this.A07.clear();
                RunnableC3024iN runnableC3024iN = new RunnableC3024iN(this, arrayList3);
                if (!z && !z2 && !z3) {
                    runnableC3024iN.run();
                    return;
                }
                if (A0C[0].charAt(3) == 'S') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[4] = "oGS3g0YSOogxL8fDiPQ9wWzcLRV8E0qu";
                strArr[3] = "UwBhVdK7HoWqzQqehBBKiWd5H5AJwN9O";
                AbstractC2977hb.A0E(arrayList3.get(0).A0H, runnableC3024iN, Math.max(z2 ? A0C() : 0L, z3 ? A0B() : 0L) + (z ? A0D() : 0L));
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC2073Ia
    public final boolean A0Z(AbstractC3075jE abstractC3075jE, int i, int i2, int i3, int i4) {
        View view = abstractC3075jE.A0H;
        int translationX = i + ((int) abstractC3075jE.A0H.getTranslationX());
        int translationY = i2 + ((int) abstractC3075jE.A0H.getTranslationY());
        A02(abstractC3075jE);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            A0U(abstractC3075jE);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.A09.add(new C3031iU(abstractC3075jE, translationX, translationY, i3, i4));
        return true;
    }

    private void A00(C3030iT c3030iT) {
        if (c3030iT.A05 != null) {
            A05(c3030iT, c3030iT.A05);
        }
        if (c3030iT.A04 != null) {
            A05(c3030iT, c3030iT.A04);
        }
    }

    private void A01(AbstractC3075jE abstractC3075jE) {
        View view = abstractC3075jE.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(abstractC3075jE);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A0D());
        animation.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new C3025iO(this, abstractC3075jE, viewPropertyAnimatorAnimate, view)).start();
    }

    private void A02(AbstractC3075jE abstractC3075jE) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC3075jE.A0H.animate().setInterpolator(A0B);
        A0L(abstractC3075jE);
    }

    private final void A03(List<AbstractC3075jE> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A04(List<C3030iT> list, AbstractC3075jE abstractC3075jE) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C3030iT changeInfo = list.get(size);
            if (A05(changeInfo, abstractC3075jE) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A05(C3030iT c3030iT, AbstractC3075jE abstractC3075jE) {
        boolean z = false;
        if (c3030iT.A04 == abstractC3075jE) {
            c3030iT.A04 = null;
        } else if (c3030iT.A05 == abstractC3075jE) {
            c3030iT.A05 = null;
            z = true;
        } else {
            return false;
        }
        abstractC3075jE.A0H.setAlpha(1.0f);
        abstractC3075jE.A0H.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        abstractC3075jE.A0H.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        A0W(abstractC3075jE, z);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final void A0L(AbstractC3075jE abstractC3075jE) {
        View view = abstractC3075jE.A0H;
        view.animate().cancel();
        for (int i = this.A09.size() - 1; i >= 0; i--) {
            if (this.A09.get(i).A04 == abstractC3075jE) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                A0U(abstractC3075jE);
                this.A09.remove(i);
            }
        }
        A04(this.A08, abstractC3075jE);
        if (this.A0A.remove(abstractC3075jE)) {
            view.setAlpha(1.0f);
            A0V(abstractC3075jE);
        }
        if (this.A07.remove(abstractC3075jE)) {
            view.setAlpha(1.0f);
            A0T(abstractC3075jE);
        }
        for (int i2 = this.A03.size() - 1; i2 >= 0; i2--) {
            ArrayList<C3030iT> arrayList = this.A03.get(i2);
            A04(arrayList, abstractC3075jE);
            if (arrayList.isEmpty()) {
                this.A03.remove(i2);
            }
        }
        for (int j = this.A05.size() - 1; j >= 0; j--) {
            ArrayList<C3031iU> arrayList2 = this.A05.get(j);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                if (arrayList2.get(size).A04 == abstractC3075jE) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int i3 = str.charAt(9);
                    if (i3 == str2.charAt(9)) {
                        A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                        A0U(abstractC3075jE);
                        arrayList2.remove(size);
                        if (!arrayList2.isEmpty()) {
                            break;
                        }
                        this.A05.remove(j);
                        break;
                    }
                    throw new RuntimeException();
                }
            }
        }
        int size2 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i4 = size2 - 1; i4 >= 0; i4--) {
            ArrayList<AbstractC3075jE> arrayList3 = this.A01.get(i4);
            if (arrayList3.remove(abstractC3075jE)) {
                view.setAlpha(1.0f);
                A0T(abstractC3075jE);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i4);
                }
            }
        }
        this.A06.remove(abstractC3075jE);
        this.A00.remove(abstractC3075jE);
        this.A02.remove(abstractC3075jE);
        this.A04.remove(abstractC3075jE);
        A0b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final boolean A0M() {
        ArrayList<ArrayList<C3030iT>> arrayList;
        if (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty()) {
            boolean zIsEmpty = this.A04.isEmpty();
            String[] strArr = A0C;
            if (strArr[2].charAt(18) != strArr[5].charAt(18)) {
                String[] strArr2 = A0C;
                strArr2[4] = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw";
                strArr2[3] = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5";
                if (zIsEmpty && this.A06.isEmpty()) {
                    boolean zIsEmpty2 = this.A00.isEmpty();
                    String[] strArr3 = A0C;
                    if (strArr3[2].charAt(18) != strArr3[5].charAt(18)) {
                        A0C[7] = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk";
                        if (zIsEmpty2) {
                            if (this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty()) {
                                arrayList = this.A03;
                                if (A0C[7].charAt(30) != 'w') {
                                    throw new RuntimeException();
                                }
                                A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
                                if (!arrayList.isEmpty()) {
                                    return false;
                                }
                            }
                        }
                    } else if (zIsEmpty2) {
                        if (this.A02.isEmpty()) {
                            arrayList = this.A03;
                            if (A0C[7].charAt(30) != 'w') {
                                throw new RuntimeException();
                            }
                            A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
                            if (!arrayList.isEmpty()) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final boolean A0S(AbstractC3075jE abstractC3075jE, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0S(abstractC3075jE, payloads);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2073Ia
    public final boolean A0X(AbstractC3075jE abstractC3075jE) {
        A02(abstractC3075jE);
        abstractC3075jE.A0H.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.A07.add(abstractC3075jE);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2073Ia
    public final boolean A0Y(AbstractC3075jE abstractC3075jE) {
        A02(abstractC3075jE);
        this.A0A.add(abstractC3075jE);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2073Ia
    public final boolean A0a(AbstractC3075jE abstractC3075jE, AbstractC3075jE abstractC3075jE2, int i, int i2, int i3, int i4) {
        if (abstractC3075jE == abstractC3075jE2) {
            return A0Z(abstractC3075jE, i, i2, i3, i4);
        }
        float translationX = abstractC3075jE.A0H.getTranslationX();
        float translationY = abstractC3075jE.A0H.getTranslationY();
        float prevTranslationY = abstractC3075jE.A0H.getAlpha();
        A02(abstractC3075jE);
        float prevTranslationX = i3 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i4 - i2;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC3075jE.A0H.setTranslationX(translationX);
        abstractC3075jE.A0H.setTranslationY(translationY);
        abstractC3075jE.A0H.setAlpha(prevTranslationY);
        if (abstractC3075jE2 != null) {
            A02(abstractC3075jE2);
            float prevTranslationX3 = -deltaY;
            abstractC3075jE2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC3075jE2.A0H.setTranslationY(prevTranslationX4);
            abstractC3075jE2.A0H.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.A08.add(new C3030iT(abstractC3075jE, abstractC3075jE2, i, i2, i3, i4));
        return true;
    }

    public final void A0b() {
        if (!A0M()) {
            A0G();
        }
    }

    public final void A0c(C3030iT c3030iT) {
        View view;
        AbstractC3075jE holder = c3030iT.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC3075jE holder2 = c3030iT.A04;
        View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A0B());
            this.A02.add(c3030iT.A05);
            oldViewAnim.translationX(c3030iT.A02 - c3030iT.A00);
            oldViewAnim.translationY(c3030iT.A03 - c3030iT.A01);
            oldViewAnim.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new C3028iR(this, c3030iT, oldViewAnim, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(c3030iT.A04);
            viewPropertyAnimatorAnimate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(A0B()).alpha(1.0f).setListener(new C3029iS(this, c3030iT, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public final void A0d(AbstractC3075jE abstractC3075jE) {
        View view = abstractC3075jE.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(abstractC3075jE);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A0A());
        animation.setListener(new C3026iP(this, abstractC3075jE, view, viewPropertyAnimatorAnimate)).start();
    }

    public final void A0e(AbstractC3075jE abstractC3075jE, int i, int i2, int i3, int i4) {
        View view = abstractC3075jE.A0H;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i6 != 0) {
            view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(abstractC3075jE);
        viewPropertyAnimatorAnimate.setDuration(A0C()).setListener(new C3027iQ(this, abstractC3075jE, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }
}
