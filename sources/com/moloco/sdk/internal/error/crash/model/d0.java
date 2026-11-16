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
public final /* synthetic */ class d0 implements qt0 {
    public static final d0 a;
    public static final PluginGeneratedSerialDescriptor b;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.error.crash.model.SentryStacktrace", d0Var, 1);
        pluginGeneratedSerialDescriptor.j(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS, false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e0.b[0]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = e0.b;
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
        return new e0(i, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e0 e0Var = (e0) obj;
        e0Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        iwVarB.e(pluginGeneratedSerialDescriptor, 0, e0.b[0], e0Var.a);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
