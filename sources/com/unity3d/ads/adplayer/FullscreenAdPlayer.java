package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FullscreenAdPlayer extends AdPlayer {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull FullscreenAdPlayer fullscreenAdPlayer, @NotNull dy dyVar) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, dyVar);
            if (objDestroy == dz.a) {
                return objDestroy;
            }
            return az2.a;
        }

        public static void show(@NotNull FullscreenAdPlayer fullscreenAdPlayer, @NotNull ShowOptions showOptions) {
            showOptions.getClass();
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
