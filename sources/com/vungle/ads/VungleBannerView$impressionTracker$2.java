package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.b1;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vungle/ads/internal/b1;", "invoke", "()Lcom/vungle/ads/internal/b1;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class VungleBannerView$impressionTracker$2 extends rc1 implements sr0 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView$impressionTracker$2(Context context) {
        super(0);
        this.a = context;
    }

    @Override // defpackage.sr0
    @NotNull
    public final b1 invoke() {
        return new b1(this.a);
    }
}
