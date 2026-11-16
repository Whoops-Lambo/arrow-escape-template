package com.vungle.ads.internal.model;

import defpackage.cy;
import defpackage.hw;
import defpackage.hw0;
import defpackage.iw;
import defpackage.j8;
import defpackage.jg1;
import defpackage.m93;
import defpackage.p32;
import defpackage.qt0;
import defpackage.rj;
import defpackage.uu;
import defpackage.vr;
import defpackage.wz2;
import defpackage.zj2;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements qt0 {
    public static final c a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload", cVar, 7);
        pluginGeneratedSerialDescriptor.j("ads", true);
        pluginGeneratedSerialDescriptor.j("config", true);
        pluginGeneratedSerialDescriptor.j("expiryWindowStart", true);
        pluginGeneratedSerialDescriptor.j("mraidFiles", true);
        pluginGeneratedSerialDescriptor.j("incentivizedTextSettings", true);
        pluginGeneratedSerialDescriptor.j("assetsFullyDownloaded", true);
        pluginGeneratedSerialDescriptor.j("indexFilePath", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerW = uu.w(new j8(q.a, 0));
        KSerializer kSerializerW2 = uu.w(v1.a);
        KSerializer kSerializerW3 = uu.w(jg1.a);
        vr vrVarA = p32.a(ConcurrentHashMap.class);
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{kSerializerW, kSerializerW2, kSerializerW3, new cy(vrVarA, (KSerializer) null, new KSerializer[]{zj2Var, zj2Var}), new hw0(zj2Var, zj2Var, 1), rj.a, uu.w(zj2Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i0 i0Var = (i0) obj;
        encoder.getClass();
        i0Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        i0.a(i0Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        Object objD = null;
        Object objD2 = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    break;
                case 0:
                    objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, new j8(q.a, 0), objB4);
                    i |= 1;
                    break;
                case 1:
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, v1.a, objB3);
                    i |= 2;
                    break;
                case 2:
                    objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, jg1.a, objB2);
                    i |= 4;
                    break;
                case 3:
                    vr vrVarA = p32.a(ConcurrentHashMap.class);
                    zj2 zj2Var = zj2.a;
                    objD2 = hwVarB.D(pluginGeneratedSerialDescriptor, 3, new cy(vrVarA, (KSerializer) null, new KSerializer[]{zj2Var, zj2Var}), objD2);
                    i |= 8;
                    break;
                case 4:
                    zj2 zj2Var2 = zj2.a;
                    objD = hwVarB.D(pluginGeneratedSerialDescriptor, 4, new hw0(zj2Var2, zj2Var2, 1), objD);
                    i |= 16;
                    break;
                case 5:
                    zY = hwVarB.y(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 6, zj2.a, objB);
                    i |= 64;
                    break;
                default:
                    m93.c(iT);
                    return null;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new i0(i, (List) objB4, (w2) objB3, (Long) objB2, (ConcurrentHashMap) objD2, (Map) objD, zY, (String) objB);
    }
}
