package com.moloco.sdk;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p3 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void c() {
        String str = Build.VERSION.RELEASE;
        copyOnWrite();
        r3.c((r3) this.instance);
    }

    public final void a(String str) {
        copyOnWrite();
        r3.a((r3) this.instance, str);
    }

    public final void b() {
        copyOnWrite();
        r3.b((r3) this.instance);
    }

    public final void d(float f) {
        copyOnWrite();
        r3.d((r3) this.instance, f);
    }
}
