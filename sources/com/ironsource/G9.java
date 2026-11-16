package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class G9 implements InterfaceC5088yg {

    @Nullable
    private final Hb a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError b() {
        return C5095z5.a.b("Load task config is null");
    }

    @Override // com.ironsource.InterfaceC5088yg
    public void a() {
        a(this.a != null, new defpackage.v2(12));
    }

    public G9(@Nullable Hb hb) {
        this.a = hb;
    }
}
