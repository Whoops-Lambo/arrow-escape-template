package com.moloco.sdk.publisher;

import android.widget.FrameLayout;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements zr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ d(FrameLayout frameLayout, int i) {
        this.a = i;
        this.b = frameLayout;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Banner banner = (Banner) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        FrameLayout frameLayout = this.b;
        switch (i) {
            case 0:
                return MolocoSamplesKt.MolocoCreateMREC$lambda$4(frameLayout, banner, adCreateError);
            case 1:
                return MolocoSamplesKt.MolocoCreateBanner$lambda$2(frameLayout, banner, adCreateError);
            case 2:
                return MolocoSamplesKt.MolocoCreateBannerTablet$lambda$3(frameLayout, banner, adCreateError);
            case 3:
                return MolocoSamplesKt.MolocoCreateMolocoBanner$lambda$5(frameLayout, banner, adCreateError);
            case 4:
                return MolocoSamplesKt.MolocoCreateMolocoBanner$lambda$6(frameLayout, banner, adCreateError);
            default:
                return MolocoSamplesKt.MolocoCreateMolocoBanner$lambda$7(frameLayout, banner, adCreateError);
        }
    }
}
