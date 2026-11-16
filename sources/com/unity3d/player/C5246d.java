package com.unity3d.player;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5246d implements AssetPackStateUpdateListener {
    public final HashSet a;
    public final UnityPlayer b;
    public final /* synthetic */ C5258j c;

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a.add(iAssetPackManagerDownloadStatusCallback);
    }

    public C5246d(C5258j c5258j, UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.c = c5258j;
        this.b = unityPlayer;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final void onStateUpdate(Object obj) {
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            try {
                if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    synchronized (C5258j.e) {
                        try {
                            this.c.c.remove(assetPackState.name());
                            if (this.c.c.isEmpty()) {
                                C5258j c5258j = this.c;
                                C5246d c5246d = c5258j.d;
                                if (c5246d != null) {
                                    c5258j.b.unregisterListener(c5246d);
                                }
                                this.c.d = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (this.a.size() == 0) {
                    return;
                }
                this.b.invokeOnMainThread(new RunnableC5244c((Set) this.a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
