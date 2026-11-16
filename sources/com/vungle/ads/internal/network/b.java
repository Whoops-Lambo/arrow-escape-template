package com.vungle.ads.internal.network;

import defpackage.hw;
import defpackage.hw0;
import defpackage.iw;
import defpackage.k71;
import defpackage.m93;
import defpackage.qt0;
import defpackage.uu;
import defpackage.wz2;
import defpackage.zj2;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements qt0 {
    public static final b a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.network.FailedTpat", bVar, 6);
        pluginGeneratedSerialDescriptor.j("method", true);
        pluginGeneratedSerialDescriptor.j("headers", true);
        pluginGeneratedSerialDescriptor.j("body", true);
        pluginGeneratedSerialDescriptor.j("retryAttempt", true);
        pluginGeneratedSerialDescriptor.j("retryCount", false);
        pluginGeneratedSerialDescriptor.j("tpatKey", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        KSerializer kSerializerW = uu.w(new hw0(zj2Var, zj2Var, 1));
        KSerializer kSerializerW2 = uu.w(zj2Var);
        KSerializer kSerializerW3 = uu.w(zj2Var);
        k71 k71Var = k71.a;
        return new KSerializer[]{e.a, kSerializerW, kSerializerW2, k71Var, k71Var, kSerializerW3};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        encoder.getClass();
        dVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        d.a(dVar, iwVarB, pluginGeneratedSerialDescriptor);
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
        int iH2 = 0;
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objD = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    break;
                case 0:
                    objD = hwVarB.D(pluginGeneratedSerialDescriptor, 0, e.a, objD);
                    i |= 1;
                    break;
                case 1:
                    zj2 zj2Var = zj2.a;
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, new hw0(zj2Var, zj2Var, 1), objB3);
                    i |= 2;
                    break;
                case 2:
                    objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, zj2.a, objB2);
                    i |= 4;
                    break;
                case 3:
                    iH = hwVarB.h(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iH2 = hwVarB.h(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 5, zj2.a, objB);
                    i |= 32;
                    break;
                default:
                    m93.c(iT);
                    return null;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new d(i, (g) objD, (Map) objB3, (String) objB2, iH, iH2, (String) objB);
    }
}
