package com.moloco.sdk.internal.error.crash.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.jg1;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
import defpackage.uu;
import defpackage.zj2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements qt0 {
    public static final f0 a;
    public static final PluginGeneratedSerialDescriptor b;

    static {
        f0 f0Var = new f0();
        a = f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.error.crash.model.SentryThread", f0Var, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("crashed", false);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("stacktrace", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{jg1.a, rj.a, uu.w(zj2.a), uu.w(d0.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        int i = 0;
        boolean zY = false;
        long jF = 0;
        String str = null;
        e0 e0Var = null;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                jF = hwVarB.f(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iT == 1) {
                zY = hwVarB.y(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (iT == 2) {
                str = (String) hwVarB.B(pluginGeneratedSerialDescriptor, 2, zj2.a, str);
                i |= 4;
            } else {
                if (iT != 3) {
                    m93.c(iT);
                    return null;
                }
                e0Var = (e0) hwVarB.B(pluginGeneratedSerialDescriptor, 3, d0.a, e0Var);
                i |= 8;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new g0(i, jF, zY, str, e0Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g0 g0Var = (g0) obj;
        g0Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        long j = g0Var.a;
        e0 e0Var = g0Var.d;
        String str = g0Var.c;
        iwVarB.u(pluginGeneratedSerialDescriptor, 0, j);
        iwVarB.p(pluginGeneratedSerialDescriptor, 1, g0Var.b);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || str != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 2, zj2.a, str);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || e0Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 3, d0.a, e0Var);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
