package io.p071bidmachine.media3.exoplayer.video;

import io.p071bidmachine.media3.common.a1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final l a;

    public final void a() throws a1 {
        try {
            ((m) Class.forName("io.bidmachine.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(l.class).newInstance(this.a)).a();
        } catch (Exception e) {
            throw a1.a(e);
        }
    }

    public m(l lVar) {
        this.a = lVar;
    }
}
