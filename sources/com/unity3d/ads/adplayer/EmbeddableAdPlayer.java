package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EmbeddableAdPlayer extends AdPlayer {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull EmbeddableAdPlayer embeddableAdPlayer, @NotNull dy dyVar) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, dyVar);
            if (objDestroy == dz.a) {
                return objDestroy;
            }
            return az2.a;
        }

        public static void show(@NotNull EmbeddableAdPlayer embeddableAdPlayer, @NotNull ShowOptions showOptions) {
            showOptions.getClass();
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
