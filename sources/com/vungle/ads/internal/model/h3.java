package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
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
public final class h3 implements qt0 {
    public static final h3 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        h3 h3Var = new h3();
        a = h3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.Placement", h3Var, 3);
        pluginGeneratedSerialDescriptor.j("placement_ref_id", false);
        pluginGeneratedSerialDescriptor.j("is_hb", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{zj2Var, rj.a, uu.w(zj2Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j3 j3Var = (j3) obj;
        encoder.getClass();
        j3Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        j3.a(j3Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        boolean zY = false;
        Object objB = null;
        String strJ = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT == 2) {
                            objB = hwVarB.B(pluginGeneratedSerialDescriptor, 2, zj2.a, objB);
                            i |= 4;
                        } else {
                            m93.c(iT);
                            return null;
                        }
                    } else {
                        zY = hwVarB.y(pluginGeneratedSerialDescriptor, 1);
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
        return new j3(i, strJ, zY, (String) objB);
    }
}
