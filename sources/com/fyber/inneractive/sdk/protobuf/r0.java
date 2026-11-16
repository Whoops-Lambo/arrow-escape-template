package com.fyber.inneractive.sdk.protobuf;

import defpackage.vq2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements b2 {
    public static final r0 a = new r0();

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(Class cls) {
        return z0.class.isAssignableFrom(cls);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final r2 b(Class cls) {
        if (!z0.class.isAssignableFrom(cls)) {
            defpackage.d.r("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (r2) z0.getDefaultInstance(cls.asSubclass(z0.class)).buildMessageInfo();
        } catch (Exception e) {
            vq2.n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
