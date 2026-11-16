package com.vungle.ads.internal.signals;

import defpackage.hw;
import defpackage.iw;
import defpackage.jg1;
import defpackage.k71;
import defpackage.m93;
import defpackage.qt0;
import defpackage.uu;
import defpackage.wz2;
import defpackage.zj2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements qt0 {
    public static final k a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SignaledAd", kVar, 5);
        pluginGeneratedSerialDescriptor.j("500", true);
        pluginGeneratedSerialDescriptor.j("109", false);
        pluginGeneratedSerialDescriptor.j("107", true);
        pluginGeneratedSerialDescriptor.j("110", true);
        pluginGeneratedSerialDescriptor.j("108", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        KSerializer kSerializerW = uu.w(zj2Var);
        KSerializer kSerializerW2 = uu.w(zj2Var);
        jg1 jg1Var = jg1.a;
        return new KSerializer[]{kSerializerW, jg1Var, kSerializerW2, jg1Var, k71.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m mVar = (m) obj;
        encoder.getClass();
        mVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        m.a(mVar, iwVarB, pluginGeneratedSerialDescriptor);
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
        int i = 0;
        int iH = 0;
        Object objB = null;
        long jF = 0;
        long jF2 = 0;
        boolean z = true;
        Object objB2 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT != 2) {
                            if (iT != 3) {
                                if (iT == 4) {
                                    iH = hwVarB.h(pluginGeneratedSerialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    m93.c(iT);
                                    return null;
                                }
                            } else {
                                jF2 = hwVarB.f(pluginGeneratedSerialDescriptor, 3);
                                i |= 8;
                            }
                        } else {
                            objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, zj2.a, objB2);
                            i |= 4;
                        }
                    } else {
                        jF = hwVarB.f(pluginGeneratedSerialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 0, zj2.a, objB);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new m(i, (String) objB, jF, (String) objB2, jF2, iH);
    }
}
