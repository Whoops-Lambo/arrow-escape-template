package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2255Pn implements InterfaceC2493Zi {
    public abstract Metadata A0R(C18338e c18338e, ByteBuffer byteBuffer);

    @Override // com.facebook.ads.redexgen.X.InterfaceC2493Zi
    public final Metadata A6N(C18338e c18338e) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC2159Ln.A01(c18338e.A02);
        AbstractC2159Ln.A07(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (c18338e.A04()) {
            return null;
        }
        return A0R(c18338e, byteBuffer);
    }
}
