package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.de, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4710de implements InterfaceC5088yg {

    @Nullable
    private final Hb a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError b() {
        return C5095z5.a.d("Load task config is null");
    }

    @Override // com.ironsource.InterfaceC5088yg
    public void a() {
        a(this.a != null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(10));
    }

    public C4710de(@Nullable Hb hb) {
        this.a = hb;
    }
}
