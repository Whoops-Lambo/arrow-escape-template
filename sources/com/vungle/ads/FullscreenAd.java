package com.vungle.ads;

import android.content.Context;
import defpackage.d;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/FullscreenAd;", "Lcom/vungle/ads/Ad;", "Landroid/content/Context;", "context", "Laz2;", "play", "(Landroid/content/Context;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface FullscreenAd extends Ad {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void play$default(FullscreenAd fullscreenAd, Context context, int i, Object obj) {
            if (obj != null) {
                d.u("Super calls with default arguments not supported in this target, function: play");
                return;
            }
            if ((i & 1) != 0) {
                context = null;
            }
            fullscreenAd.play(context);
        }
    }

    void play(@Nullable Context context);
}
