package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.jg1;
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
public final class f1 implements qt0 {
    public static final f1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{zj2Var, zj2Var, jg1.a, zj2Var};
    }

    static {
        f1 f1Var = new f1();
        a = f1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.GDPR", f1Var, 4);
        pluginGeneratedSerialDescriptor.j("consent_status", false);
        pluginGeneratedSerialDescriptor.j("consent_source", false);
        pluginGeneratedSerialDescriptor.j("consent_timestamp", false);
        pluginGeneratedSerialDescriptor.j("consent_message_version", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h1 h1Var = (h1) obj;
        encoder.getClass();
        h1Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        h1.a(h1Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        long jF = 0;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT != 2) {
                            if (iT == 3) {
                                strJ3 = hwVarB.j(pluginGeneratedSerialDescriptor, 3);
                                i |= 8;
                            } else {
                                m93.c(iT);
                                return null;
                            }
                        } else {
                            jF = hwVarB.f(pluginGeneratedSerialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        strJ2 = hwVarB.j(pluginGeneratedSerialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new h1(i, strJ, strJ2, jF, strJ3);
    }
}
