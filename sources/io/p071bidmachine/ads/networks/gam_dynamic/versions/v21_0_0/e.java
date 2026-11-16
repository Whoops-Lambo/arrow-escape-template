package io.p071bidmachine.ads.networks.gam_dynamic.versions.v21_0_0;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.ads.networks.gam_dynamic.j;
import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.q0;
import io.p071bidmachine.unified.h;
import io.p071bidmachine.utils.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends FullScreenContentCallback {
    public final /* synthetic */ int a;
    public final j b;

    public /* synthetic */ e(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                ((AdProcessCallback) ((q0) ((h) jVar.a)).a).processFinished();
                ((AdProcessCallback) ((q0) ((h) jVar.a)).a).processClosed();
                break;
            case 1:
                ((AdProcessCallback) ((q0) ((h) jVar.a)).a).processFinished();
                ((AdProcessCallback) ((q0) ((h) jVar.a)).a).processClosed();
                break;
            default:
                ((AdProcessCallback) ((q0) ((h) jVar.a)).a).processFinished();
                ((AdProcessCallback) ((q0) ((h) jVar.a)).a).processClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                ((AdProcessCallback) ((m) jVar.a).a).processShowFail(new a(a.q, adError.getCode(), adError.getMessage()));
                break;
            case 1:
                ((AdProcessCallback) ((m) jVar.a).a).processShowFail(new a(a.q, adError.getCode(), adError.getMessage()));
                break;
            default:
                ((AdProcessCallback) ((m) jVar.a).a).processShowFail(new a(a.q, adError.getCode(), adError.getMessage()));
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
