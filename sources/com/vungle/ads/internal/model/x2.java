package com.vungle.ads.internal.model;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.ironsource.R6;
import defpackage.hw;
import defpackage.iw;
import defpackage.k71;
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
public final class x2 implements qt0 {
    public static final x2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        x2 x2Var = new x2();
        a = x2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode", x2Var, 11);
        pluginGeneratedSerialDescriptor.j(R6.t, false);
        pluginGeneratedSerialDescriptor.j(R6.B, false);
        pluginGeneratedSerialDescriptor.j(R6.G, false);
        pluginGeneratedSerialDescriptor.j(R6.R0, true);
        pluginGeneratedSerialDescriptor.j(R6.F, false);
        pluginGeneratedSerialDescriptor.j("w", false);
        pluginGeneratedSerialDescriptor.j(CmcdData.STREAMING_FORMAT_HLS, false);
        pluginGeneratedSerialDescriptor.j(R6.d0, true);
        pluginGeneratedSerialDescriptor.j("ifa", true);
        pluginGeneratedSerialDescriptor.j("lmt", true);
        pluginGeneratedSerialDescriptor.j("ext", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        KSerializer kSerializerW = uu.w(zj2Var);
        k71 k71Var = k71.a;
        return new KSerializer[]{zj2Var, zj2Var, zj2Var, kSerializerW, zj2Var, k71Var, k71Var, uu.w(zj2Var), uu.w(zj2Var), uu.w(k71Var), uu.w(z2.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c3 c3Var = (c3) obj;
        encoder.getClass();
        c3Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        c3.a(c3Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iH = 0;
        int iH2 = 0;
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strJ2 = hwVarB.j(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strJ3 = hwVarB.j(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    objB5 = hwVarB.B(pluginGeneratedSerialDescriptor, 3, zj2.a, objB5);
                    i |= 8;
                    break;
                case 4:
                    strJ4 = hwVarB.j(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iH = hwVarB.h(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iH2 = hwVarB.h(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 7, zj2.a, objB4);
                    i |= 128;
                    break;
                case 8:
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 8, zj2.a, objB3);
                    i |= 256;
                    break;
                case 9:
                    objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 9, k71.a, objB2);
                    i |= 512;
                    break;
                case 10:
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 10, z2.a, objB);
                    i |= 1024;
                    break;
                default:
                    m93.c(iT);
                    return obj;
            }
            obj = null;
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new c3(i, strJ, strJ2, strJ3, (String) objB5, strJ4, iH, iH2, (String) objB4, (String) objB3, (Integer) objB2, (b3) objB);
    }
}
