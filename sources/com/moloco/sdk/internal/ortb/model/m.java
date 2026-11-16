package com.moloco.sdk.internal.ortb.model;

import defpackage.cy2;
import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.yx2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements qt0 {
    public static final m a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return k0.a;
        }
    }

    static {
        m mVar = new m();
        a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.VastPrivacyIcon", mVar, 3);
        pluginGeneratedSerialDescriptor.j("padding", false);
        pluginGeneratedSerialDescriptor.j("horizontal_alignment", false);
        pluginGeneratedSerialDescriptor.j("vertical_alignment", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = n.d;
        return new KSerializer[]{cy2.a, kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = n.d;
        boolean z = true;
        int i = 0;
        yx2 yx2Var = null;
        e1 e1Var = null;
        o oVar = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                yx2Var = (yx2) hwVarB.D(pluginGeneratedSerialDescriptor, 0, cy2.a, yx2Var);
                i |= 1;
            } else if (iT == 1) {
                e1Var = (e1) hwVarB.D(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], e1Var);
                i |= 2;
            } else {
                if (iT != 2) {
                    m93.c(iT);
                    return null;
                }
                oVar = (o) hwVarB.D(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], oVar);
                i |= 4;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new n(i, yx2Var, e1Var, oVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n nVar = (n) obj;
        nVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = n.d;
        iwVarB.e(pluginGeneratedSerialDescriptor, 0, cy2.a, new yx2(nVar.a));
        iwVarB.e(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], nVar.b);
        iwVarB.e(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], nVar.c);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
