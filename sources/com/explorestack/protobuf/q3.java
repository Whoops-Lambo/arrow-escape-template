package com.explorestack.protobuf;

import defpackage.e32;
import defpackage.m93;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q3 extends p3 {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            c9.c.m(j4.class.getDeclaredField("a"));
        } catch (Throwable unused) {
            e32.i("Unable to lookup extension field offset");
        }
    }

    @Override // com.explorestack.protobuf.p3
    public final void a(o3 o3Var, MessageLite messageLite, int i) {
        if (((l3) o3Var).f.get(new j3(((Message) messageLite).getDescriptorForType(), i)) == null) {
            return;
        }
        m93.b();
    }

    @Override // com.explorestack.protobuf.p3
    public final boolean b(MessageLite messageLite) {
        return messageLite instanceof j4;
    }
}
