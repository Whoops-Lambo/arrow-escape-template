package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class Pz {
    public static String[] A06 = {"KJd4SIX9bFdOLKLE1j6Vag6lDPyxnKMM", "RQBlrOEc0ryI432moAmJKoCYD4hA7KSo", "e7rXMFN", "g7Wk7vPQofzQ3IT20EMjl4", "uRIv26KPiTMcDh", "Kt7e4scKpUDR", "Io8mfv0", "Fj3WcjTMYLJcnKYH"};
    public C2299Rk A00;
    public C2299Rk A01;
    public C2299Rk A02;
    public AbstractC18519l<C2299Rk> A03 = AbstractC18519l.A03();
    public AbstractC2404Vq<C2299Rk, Timeline> A04 = AbstractC2404Vq.A04();
    public final UM A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2299Rk A00(LQ lq, AbstractC18519l<C2299Rk> abstractC18519l, C2299Rk c2299Rk, UM um) {
        Object obj;
        int i;
        Timeline timelineA8H = lq.A8H();
        int iA8D = lq.A8D();
        Object objA0M = timelineA8H.A0N() ? null : timelineA8H.A0M(iA8D);
        int iA07 = (lq.ABL() || timelineA8H.A0N()) ? -1 : timelineA8H.A0H(iA8D, um).A07(N1.A0O(lq.A8F()) - um.A0C());
        for (int i2 = 0; i2 < abstractC18519l.size(); i2++) {
            C2299Rk c2299Rk2 = abstractC18519l.get(i2);
            if (A04(c2299Rk2, objA0M, lq.ABL(), lq.A89(), lq.A8A(), iA07)) {
                return c2299Rk2;
            }
        }
        if (abstractC18519l.isEmpty() && c2299Rk != null && A04(c2299Rk, obj, lq.ABL(), lq.A89(), lq.A8A(), i)) {
            obj = objA0M;
            i = iA07;
            return c2299Rk;
        }
        obj = objA0M;
        i = iA07;
        return null;
    }

    public Pz(UM um) {
        this.A05 = um;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vr != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization
    private void A02(Timeline timeline) {
        C2405Vr<C2299Rk, Timeline> c2405VrA03 = AbstractC2404Vq.A03();
        if (this.A03.isEmpty()) {
            A03(c2405VrA03, this.A01, timeline);
            C2299Rk c2299Rk = this.A02;
            if (A06[7].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = "SFFeMhCWOx4mkt";
            strArr[3] = "OeAFK2mj2j4I62wsIHhNmd";
            if (!A6.A01(c2299Rk, this.A01)) {
                A03(c2405VrA03, this.A02, timeline);
            }
            C2299Rk c2299Rk2 = this.A00;
            if (A06[0].charAt(24) == 'D') {
                String[] strArr2 = A06;
                strArr2[4] = "nwjeKqa56zVpsX";
                strArr2[3] = "ZIYXg9JpEESGpw2jJSXeG4";
                if (!A6.A01(c2299Rk2, this.A01)) {
                    if (!A6.A01(this.A00, this.A02)) {
                        A03(c2405VrA03, this.A00, timeline);
                    }
                }
            } else if (!A6.A01(c2299Rk2, this.A01)) {
                if (!A6.A01(this.A00, this.A02)) {
                    A03(c2405VrA03, this.A00, timeline);
                }
            }
        } else {
            for (int i = 0; i < this.A03.size(); i++) {
                A03(c2405VrA03, this.A03.get(i), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(c2405VrA03, this.A00, timeline);
            }
        }
        AbstractC2404Vq<C2299Rk, Timeline> abstractC2404VqA07 = c2405VrA03.A07();
        if (A06[1].charAt(2) != 'B') {
            this.A04 = abstractC2404VqA07;
        } else {
            A06[0] = "rKMKb263tcLdpphrkSuVJeufDK83wEO8";
            this.A04 = abstractC2404VqA07;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vr != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C2405Vr<C2299Rk, Timeline> c2405Vr, C2299Rk c2299Rk, Timeline timeline) {
        if (c2299Rk == null) {
            return;
        }
        if (timeline.A0A(c2299Rk.A04) != -1) {
            c2405Vr.A05(c2299Rk, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c2299Rk);
        if (existingTimeline == null) {
            return;
        }
        c2405Vr.A05(c2299Rk, existingTimeline);
    }

    public static boolean A04(C2299Rk c2299Rk, Object obj, boolean z, int i, int i2, int i3) {
        if (c2299Rk.A04.equals(obj)) {
            return (z && c2299Rk.A00 == i && c2299Rk.A01 == i2) || (!z && c2299Rk.A00 == -1 && c2299Rk.A02 == i3);
        }
        return false;
    }

    public final Timeline A05(C2299Rk c2299Rk) {
        return this.A04.get(c2299Rk);
    }

    public final C2299Rk A06() {
        return this.A00;
    }

    public final void A07(LQ lq) {
        this.A00 = A00(lq, this.A03, this.A01, this.A05);
        A02(lq.A8H());
    }
}
