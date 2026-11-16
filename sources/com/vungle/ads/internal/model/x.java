package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.uu;
import defpackage.wz2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class x implements qt0 {
    public static final x a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        x xVar = new x();
        a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.ViewAbility", xVar, 1);
        pluginGeneratedSerialDescriptor.j("om", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uu.w(a0.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z zVar = (z) obj;
        encoder.getClass();
        zVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        z.a(zVar, iwVarB, pluginGeneratedSerialDescriptor);
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
        Object objB = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT == 0) {
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 0, a0.a, objB);
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
        return new z(i, (c0) objB);
    }
}
