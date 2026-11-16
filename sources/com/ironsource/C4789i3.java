package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4789i3 implements InterfaceC5088yg {

    @Nullable
    private final Hb a;

    @Nullable
    private final AdSize b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError b() {
        return C5095z5.a.a("Load task config is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError c() {
        return C5095z5.a.l();
    }

    @Override // com.ironsource.InterfaceC5088yg
    public void a() {
        a(this.a != null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(15));
        a(this.b != null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(16));
    }

    public C4789i3(@Nullable Hb hb, @Nullable AdSize adSize) {
        this.a = hb;
        this.b = adSize;
    }
}
