package com.unity3d.player;

import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.HashSet;

/* JADX INFO: renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5258j {
    public static C5258j e;
    public final UnityPlayer a;
    public final AssetPackManager b;
    public final HashSet c;
    public C5246d d;

    public C5258j(UnityPlayer unityPlayer, Context context) {
        if (e == null) {
            this.a = unityPlayer;
            this.b = AssetPackManagerFactory.getInstance(context);
            this.c = new HashSet();
            return;
        }
        io.p071bidmachine.media3.extractor.ts.y.j("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        throw null;
    }
}
