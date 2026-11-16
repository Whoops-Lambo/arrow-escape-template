package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
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
/* JADX INFO: loaded from: classes7.dex */
public final class g2 implements qt0 {
    public static final g2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        g2 g2Var = new g2();
        a = g2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.Endpoints", g2Var, 5);
        pluginGeneratedSerialDescriptor.j("ads", true);
        pluginGeneratedSerialDescriptor.j("ri", true);
        pluginGeneratedSerialDescriptor.j("error_logs", true);
        pluginGeneratedSerialDescriptor.j("metrics", true);
        pluginGeneratedSerialDescriptor.j("csb", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{uu.w(zj2Var), uu.w(zj2Var), uu.w(zj2Var), uu.w(zj2Var), uu.w(zj2Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i2 i2Var = (i2) obj;
        encoder.getClass();
        i2Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        i2.a(i2Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        Object objB5 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT != 2) {
                            if (iT != 3) {
                                if (iT == 4) {
                                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 4, zj2.a, objB);
                                    i |= 16;
                                } else {
                                    m93.c(iT);
                                    return null;
                                }
                            } else {
                                objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 3, zj2.a, objB2);
                                i |= 8;
                            }
                        } else {
                            objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, zj2.a, objB3);
                            i |= 4;
                        }
                    } else {
                        objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, zj2.a, objB4);
                        i |= 2;
                    }
                } else {
                    objB5 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, zj2.a, objB5);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new i2(i, (String) objB5, (String) objB4, (String) objB3, (String) objB2, (String) objB);
    }
}
