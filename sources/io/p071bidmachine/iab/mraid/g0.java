package io.p071bidmachine.iab.mraid;

import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends rc1 implements sr0 {
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z) {
        super(0);
        this.i = z;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return "setAudioMuted: " + this.i;
    }
}
