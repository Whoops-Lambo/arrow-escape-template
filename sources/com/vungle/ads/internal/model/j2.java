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
public final class j2 implements qt0 {
    public static final j2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        j2 j2Var = new j2();
        a = j2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", j2Var, 6);
        pluginGeneratedSerialDescriptor.j("is_country_data_protected", true);
        pluginGeneratedSerialDescriptor.j("consent_title", true);
        pluginGeneratedSerialDescriptor.j("consent_message", true);
        pluginGeneratedSerialDescriptor.j("consent_message_version", true);
        pluginGeneratedSerialDescriptor.j("button_accept", true);
        pluginGeneratedSerialDescriptor.j("button_deny", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerW = uu.w(rj.a);
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{kSerializerW, uu.w(zj2Var), uu.w(zj2Var), uu.w(zj2Var), uu.w(zj2Var), uu.w(zj2Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l2 l2Var = (l2) obj;
        encoder.getClass();
        l2Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        l2.a(l2Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    break;
                case 0:
                    objB6 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, rj.a, objB6);
                    i |= 1;
                    break;
                case 1:
                    objB5 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, zj2.a, objB5);
                    i |= 2;
                    break;
                case 2:
                    objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, zj2.a, objB4);
                    i |= 4;
                    break;
                case 3:
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 3, zj2.a, objB3);
                    i |= 8;
                    break;
                case 4:
                    objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 4, zj2.a, objB2);
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
        return new l2(i, (Boolean) objB6, (String) objB5, (String) objB4, (String) objB3, (String) objB2, (String) objB);
    }
}
