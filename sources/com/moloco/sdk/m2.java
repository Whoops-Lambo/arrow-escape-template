package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class m2 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(List list) {
        copyOnWrite();
        n2.a((n2) this.instance, list);
    }

    public final void b(int i) {
        copyOnWrite();
        n2.b((n2) this.instance, i);
    }

    public final void c(String str) {
        copyOnWrite();
        n2.c((n2) this.instance, str);
    }
}
