package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.j8;
import defpackage.k71;
import defpackage.m93;
import defpackage.qt0;
import defpackage.uu;
import defpackage.wz2;
import defpackage.zj2;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class n0 implements qt0 {
    public static final n0 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        n0 n0Var = new n0();
        a = n0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.BidPayload", n0Var, 4);
        pluginGeneratedSerialDescriptor.j("version", true);
        pluginGeneratedSerialDescriptor.j("adunit", true);
        pluginGeneratedSerialDescriptor.j("impression", true);
        pluginGeneratedSerialDescriptor.j("ad", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerW = uu.w(k71.a);
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{kSerializerW, uu.w(zj2Var), uu.w(new j8(zj2Var, 0)), uu.w(c.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q0 q0Var = (q0) obj;
        encoder.getClass();
        q0Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        q0.a(q0Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT != 2) {
                            if (iT == 3) {
                                objB = hwVarB.B(pluginGeneratedSerialDescriptor, 3, c.a, objB);
                                i |= 8;
                            } else {
                                m93.c(iT);
                                return null;
                            }
                        } else {
                            objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, new j8(zj2.a, 0), objB2);
                            i |= 4;
                        }
                    } else {
                        objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, zj2.a, objB3);
                        i |= 2;
                    }
                } else {
                    objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, k71.a, objB4);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new q0(i, (Integer) objB4, (String) objB3, (List) objB2, (i0) objB);
    }
}
