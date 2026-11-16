package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.k71;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
import defpackage.uu;
import defpackage.wz2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements qt0 {
    public static final d0 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.WebViewSettings", d0Var, 3);
        pluginGeneratedSerialDescriptor.j("allow_file_access_from_file_urls", true);
        pluginGeneratedSerialDescriptor.j("allow_universal_access_from_file_urls", true);
        pluginGeneratedSerialDescriptor.j("layer_type", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        rj rjVar = rj.a;
        return new KSerializer[]{uu.w(rjVar), uu.w(rjVar), uu.w(k71.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f0 f0Var = (f0) obj;
        encoder.getClass();
        f0Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        f0.a(f0Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT == 2) {
                            objB = hwVarB.B(pluginGeneratedSerialDescriptor, 2, k71.a, objB);
                            i |= 4;
                        } else {
                            m93.c(iT);
                            return null;
                        }
                    } else {
                        objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, rj.a, objB2);
                        i |= 2;
                    }
                } else {
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, rj.a, objB3);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new f0(i, (Boolean) objB3, (Boolean) objB2, (Integer) objB);
    }
}
