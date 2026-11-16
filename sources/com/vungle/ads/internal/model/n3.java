package com.vungle.ads.internal.model;

import com.ironsource.C4664b4;
import defpackage.hw;
import defpackage.iw;
import defpackage.k71;
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
/* JADX INFO: loaded from: classes7.dex */
public final class n3 implements qt0 {
    public static final n3 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        n3 n3Var = new n3();
        a = n3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbToken", n3Var, 5);
        pluginGeneratedSerialDescriptor.j(C4664b4.i.G, false);
        pluginGeneratedSerialDescriptor.j("user", true);
        pluginGeneratedSerialDescriptor.j("ext", true);
        pluginGeneratedSerialDescriptor.j("request", true);
        pluginGeneratedSerialDescriptor.j("ordinal_view", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{x2.a, uu.w(r1.a), uu.w(l1.a), uu.w(k3.a), k71.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p3 p3Var = (p3) obj;
        encoder.getClass();
        p3Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        p3.a(p3Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        int iH = 0;
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objD = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT != 2) {
                            if (iT != 3) {
                                if (iT == 4) {
                                    iH = hwVarB.h(pluginGeneratedSerialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    m93.c(iT);
                                    return null;
                                }
                            } else {
                                objB = hwVarB.B(pluginGeneratedSerialDescriptor, 3, k3.a, objB);
                                i |= 8;
                            }
                        } else {
                            objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, l1.a, objB2);
                            i |= 4;
                        }
                    } else {
                        objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, r1.a, objB3);
                        i |= 2;
                    }
                } else {
                    objD = hwVarB.D(pluginGeneratedSerialDescriptor, 0, x2.a, objD);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new p3(i, (c3) objD, (t1) objB3, (n1) objB2, (m3) objB, iH);
    }
}
