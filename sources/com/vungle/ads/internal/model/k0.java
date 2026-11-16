package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.wz2;
import defpackage.zj2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements qt0 {
    public static final k0 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{zj2Var, zj2Var, zj2Var};
    }

    static {
        k0 k0Var = new k0();
        a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AppNode", k0Var, 3);
        pluginGeneratedSerialDescriptor.j("bundle", false);
        pluginGeneratedSerialDescriptor.j("ver", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m0 m0Var = (m0) obj;
        encoder.getClass();
        m0Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        m0.a(m0Var, iwVarB, pluginGeneratedSerialDescriptor);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT == 2) {
                            strJ3 = hwVarB.j(pluginGeneratedSerialDescriptor, 2);
                            i |= 4;
                        } else {
                            m93.c(iT);
                            return null;
                        }
                    } else {
                        strJ2 = hwVarB.j(pluginGeneratedSerialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new m0(i, strJ, strJ2, strJ3);
    }
}
