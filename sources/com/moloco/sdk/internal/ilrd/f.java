package com.moloco.sdk.internal.ilrd;

import defpackage.hw;
import defpackage.iw;
import defpackage.jg1;
import defpackage.k71;
import defpackage.m93;
import defpackage.qt0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements qt0 {
    public static final f a;
    public static final PluginGeneratedSerialDescriptor b;

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        k71 k71Var = k71.a;
        return new KSerializer[]{jg1.a, k71Var, k71Var, k71Var, k71Var, k71Var};
    }

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", fVar, 6);
        pluginGeneratedSerialDescriptor.j("lastEventReceivedTs", false);
        pluginGeneratedSerialDescriptor.j("banner", false);
        pluginGeneratedSerialDescriptor.j("mrec", false);
        pluginGeneratedSerialDescriptor.j("native", false);
        pluginGeneratedSerialDescriptor.j("interstitial", false);
        pluginGeneratedSerialDescriptor.j("rewarded", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        int i = 0;
        int iH = 0;
        int iH2 = 0;
        int iH3 = 0;
        int iH4 = 0;
        int iH5 = 0;
        long jF = 0;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jF = hwVarB.f(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iH = hwVarB.h(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iH2 = hwVarB.h(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iH3 = hwVarB.h(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iH4 = hwVarB.h(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iH5 = hwVarB.h(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    m93.c(iT);
                    return null;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new g(i, iH, iH2, iH3, iH4, iH5, jF);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        iwVarB.u(pluginGeneratedSerialDescriptor, 0, gVar.a);
        iwVarB.E(1, gVar.b, pluginGeneratedSerialDescriptor);
        iwVarB.E(2, gVar.c, pluginGeneratedSerialDescriptor);
        iwVarB.E(3, gVar.d, pluginGeneratedSerialDescriptor);
        iwVarB.E(4, gVar.e, pluginGeneratedSerialDescriptor);
        iwVarB.E(5, gVar.f, pluginGeneratedSerialDescriptor);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
