package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.k71;
import defpackage.m93;
import defpackage.od0;
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
/* JADX INFO: loaded from: classes6.dex */
public final class b1 implements qt0 {
    public static final b1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        b1 b1Var = new b1();
        a = b1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", b1Var, 7);
        pluginGeneratedSerialDescriptor.j("bidfloor", false);
        pluginGeneratedSerialDescriptor.j("phase", false);
        pluginGeneratedSerialDescriptor.j("is_vx_winner", false);
        pluginGeneratedSerialDescriptor.j("parent_auction_id", false);
        pluginGeneratedSerialDescriptor.j("creative_id", false);
        pluginGeneratedSerialDescriptor.j("ad_unit_id", false);
        pluginGeneratedSerialDescriptor.j("ext", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{od0.a, k71.a, rj.a, zj2Var, zj2Var, zj2Var, uu.w(zj2Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d1 d1Var = (d1) obj;
        encoder.getClass();
        d1Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        d1.a(d1Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        int i = 0;
        int iH = 0;
        boolean zY = false;
        double dC = 0.0d;
        Object objB = null;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    dC = hwVarB.C(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iH = hwVarB.h(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    zY = hwVarB.y(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strJ2 = hwVarB.j(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strJ3 = hwVarB.j(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 6, zj2.a, objB);
                    i |= 64;
                    break;
                default:
                    m93.c(iT);
                    return obj;
            }
            obj = null;
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new d1(i, dC, iH, zY, strJ, strJ2, strJ3, (String) objB);
    }
}
