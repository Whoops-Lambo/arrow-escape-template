package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(boolean z) {
        copyOnWrite();
        m.a((m) this.instance, z);
    }

    public final void b(String str) {
        copyOnWrite();
        m.b((m) this.instance, str);
    }
}
