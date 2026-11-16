package com.moloco.sdk.internal.error.crash.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j0 implements qt0 {
    public static final j0 a;
    public static final PluginGeneratedSerialDescriptor b;

    static {
        j0 j0Var = new j0();
        a = j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.error.crash.model.ThreadValues", j0Var, 1);
        pluginGeneratedSerialDescriptor.j("values", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{k0.b[0]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = k0.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else {
                if (iT != 0) {
                    m93.c(iT);
                    return null;
                }
                list = (List) hwVarB.D(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                i = 1;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new k0(i, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k0 k0Var = (k0) obj;
        k0Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        iwVarB.e(pluginGeneratedSerialDescriptor, 0, k0.b[0], k0Var.a);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
