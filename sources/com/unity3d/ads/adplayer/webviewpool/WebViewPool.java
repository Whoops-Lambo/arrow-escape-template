package com.unity3d.ads.adplayer.webviewpool;

import defpackage.dy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/adplayer/webviewpool/WebViewPool;", "", "", "size", "Laz2;", "initialize", "(ILdy;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;", "acquireFreshEntry", "(Ldy;)Ljava/lang/Object;", "acquireForShow", "entry", "resetEntry", "(Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;Ldy;)Ljava/lang/Object;", "enqueueRecycled", "release", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface WebViewPool {
    @Nullable
    Object acquireForShow(@NotNull dy dyVar);

    @Nullable
    Object acquireFreshEntry(@NotNull dy dyVar);

    @Nullable
    Object enqueueRecycled(@NotNull PoolEntry poolEntry, @NotNull dy dyVar);

    @Nullable
    Object initialize(int i, @NotNull dy dyVar);

    @Nullable
    Object release(@NotNull PoolEntry poolEntry, @NotNull dy dyVar);

    @Nullable
    Object resetEntry(@NotNull PoolEntry poolEntry, @NotNull dy dyVar);
}
