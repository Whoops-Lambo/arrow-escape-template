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
public final class i1 implements qt0 {
    public static final i1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zj2.a};
    }

    static {
        i1 i1Var = new i1();
        a = i1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.IAB", i1Var, 1);
        pluginGeneratedSerialDescriptor.j("tcf", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k1 k1Var = (k1) obj;
        encoder.getClass();
        k1Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        k1.a(k1Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT == 0) {
                    strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 0);
                    i = 1;
                } else {
                    m93.c(iT);
                    return null;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new k1(i, strJ);
    }
}
