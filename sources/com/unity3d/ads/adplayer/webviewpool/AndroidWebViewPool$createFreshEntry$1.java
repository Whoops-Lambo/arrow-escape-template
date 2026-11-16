package com.unity3d.ads.adplayer.webviewpool;

import defpackage.dy;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool", f = "AndroidWebViewPool.kt", l = {136}, m = "createFreshEntry$suspendImpl")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class AndroidWebViewPool$createFreshEntry$1 extends fy {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewPool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewPool$createFreshEntry$1(AndroidWebViewPool androidWebViewPool, dy dyVar) {
        super(dyVar);
        this.this$0 = androidWebViewPool;
    }

    @Override // defpackage.ph
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AndroidWebViewPool.createFreshEntry$suspendImpl(this.this$0, this);
    }
}
