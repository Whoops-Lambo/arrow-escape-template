package com.vungle.ads.internal.model;

import com.ironsource.C5013ud;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.hw;
import defpackage.iw;
import defpackage.j8;
import defpackage.jg1;
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
public final class o1 implements qt0 {
    public static final o1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        o1 o1Var = new o1();
        a = o1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", o1Var, 7);
        pluginGeneratedSerialDescriptor.j(C5013ud.c, true);
        pluginGeneratedSerialDescriptor.j("ad_size", true);
        pluginGeneratedSerialDescriptor.j("ad_start_time", true);
        pluginGeneratedSerialDescriptor.j(MBridgeConstans.APP_ID, true);
        pluginGeneratedSerialDescriptor.j("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.j("user", true);
        pluginGeneratedSerialDescriptor.j("csb", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{uu.w(new j8(zj2Var, 0)), uu.w(s0.a), uu.w(jg1.a), uu.w(zj2Var), uu.w(zj2Var), uu.w(zj2Var), uu.w(b1.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q1 q1Var = (q1) obj;
        encoder.getClass();
        q1Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        q1.a(q1Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        Object objB6 = null;
        Object objB7 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    break;
                case 0:
                    objB7 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, new j8(zj2.a, 0), objB7);
                    i |= 1;
                    break;
                case 1:
                    objB6 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, s0.a, objB6);
                    i |= 2;
                    break;
                case 2:
                    objB5 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, jg1.a, objB5);
                    i |= 4;
                    break;
                case 3:
                    objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 3, zj2.a, objB4);
                    i |= 8;
                    break;
                case 4:
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 4, zj2.a, objB3);
                    i |= 16;
                    break;
                case 5:
                    objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 5, zj2.a, objB2);
                    i |= 32;
                    break;
                case 6:
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 6, b1.a, objB);
                    i |= 64;
                    break;
                default:
                    m93.c(iT);
                    return null;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new q1(i, (List) objB7, (u0) objB6, (Long) objB5, (String) objB4, (String) objB3, (String) objB2, (d1) objB);
    }
}
