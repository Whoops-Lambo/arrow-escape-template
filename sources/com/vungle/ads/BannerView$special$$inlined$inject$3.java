package com.vungle.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.platform.f;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class BannerView$special$$inlined$inject$3 extends rc1 implements sr0 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView$special$$inlined$inject$3(Context context) {
        super(0);
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.vungle.ads.internal.platform.f, java.lang.Object] */
    @Override // defpackage.sr0
    @NotNull
    public final f invoke() {
        return ServiceLocator.d.a(this.a).getService(f.class);
    }
}
