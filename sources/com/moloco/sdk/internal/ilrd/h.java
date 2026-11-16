package com.moloco.sdk.internal.ilrd;

import defpackage.hw;
import defpackage.iw;
import defpackage.jg1;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
import defpackage.zj2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements qt0 {
    public static final h a;
    public static final PluginGeneratedSerialDescriptor b;

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zj2.a, f.a, rj.a, jg1.a};
    }

    static {
        h hVar = new h();
        a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", hVar, 4);
        pluginGeneratedSerialDescriptor.j("sessionId", false);
        pluginGeneratedSerialDescriptor.j("impressionCounts", false);
        pluginGeneratedSerialDescriptor.j("isExpired", false);
        pluginGeneratedSerialDescriptor.j("sessionStartTs", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        int i = 0;
        boolean zY = false;
        String strJ = null;
        g gVar = null;
        long jF = 0;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iT == 1) {
                gVar = (g) hwVarB.D(pluginGeneratedSerialDescriptor, 1, f.a, gVar);
                i |= 2;
            } else if (iT == 2) {
                zY = hwVarB.y(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                if (iT != 3) {
                    m93.c(iT);
                    return null;
                }
                jF = hwVarB.f(pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new i(i, strJ, gVar, zY, jF);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        iwVarB.q(pluginGeneratedSerialDescriptor, 0, iVar.a);
        iwVarB.e(pluginGeneratedSerialDescriptor, 1, f.a, iVar.b);
        iwVarB.p(pluginGeneratedSerialDescriptor, 2, iVar.c);
        iwVarB.u(pluginGeneratedSerialDescriptor, 3, iVar.d);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
