package com.vungle.ads.internal.signals;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.model.q3;
import defpackage.hw;
import defpackage.iw;
import defpackage.j8;
import defpackage.jg1;
import defpackage.k71;
import defpackage.m93;
import defpackage.qt0;
import defpackage.wz2;
import defpackage.zj2;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements qt0 {
    public static final a a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", aVar, 12);
        pluginGeneratedSerialDescriptor.j("103", false);
        pluginGeneratedSerialDescriptor.j(StatisticData.ERROR_CODE_IO_ERROR, true);
        pluginGeneratedSerialDescriptor.j(StatisticData.ERROR_CODE_NOT_FOUND, true);
        pluginGeneratedSerialDescriptor.j("106", true);
        pluginGeneratedSerialDescriptor.j("102", true);
        pluginGeneratedSerialDescriptor.j("104", true);
        pluginGeneratedSerialDescriptor.j("105", true);
        pluginGeneratedSerialDescriptor.j("112", true);
        pluginGeneratedSerialDescriptor.j("113", true);
        pluginGeneratedSerialDescriptor.j("114", true);
        pluginGeneratedSerialDescriptor.j("115", true);
        pluginGeneratedSerialDescriptor.j("116", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        j8 j8Var = new j8(k.a, 0);
        j8 j8Var2 = new j8(q3.a, 0);
        k71 k71Var = k71.a;
        jg1 jg1Var = jg1.a;
        return new KSerializer[]{k71Var, zj2.a, jg1Var, j8Var, jg1Var, k71Var, j8Var2, k71Var, k71Var, k71Var, k71Var, k71Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        encoder.getClass();
        cVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        c.a(cVar, iwVarB, pluginGeneratedSerialDescriptor);
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
        int iH2 = 0;
        int iH3 = 0;
        int iH4 = 0;
        int iH5 = 0;
        int iH6 = 0;
        int iH7 = 0;
        Object objD = null;
        String strJ = null;
        long jF = 0;
        long jF2 = 0;
        boolean z = true;
        Object objD2 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iH = hwVarB.h(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    jF = hwVarB.f(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    objD = hwVarB.D(pluginGeneratedSerialDescriptor, 3, new j8(k.a, 0), objD);
                    i |= 8;
                    break;
                case 4:
                    jF2 = hwVarB.f(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iH2 = hwVarB.h(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    objD2 = hwVarB.D(pluginGeneratedSerialDescriptor, 6, new j8(q3.a, 0), objD2);
                    i |= 64;
                    break;
                case 7:
                    iH3 = hwVarB.h(pluginGeneratedSerialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    iH4 = hwVarB.h(pluginGeneratedSerialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    iH5 = hwVarB.h(pluginGeneratedSerialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    iH6 = hwVarB.h(pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    continue;
                case 11:
                    iH7 = hwVarB.h(pluginGeneratedSerialDescriptor, 11);
                    i |= 2048;
                    continue;
                default:
                    m93.c(iT);
                    return obj;
            }
            obj = null;
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new c(i, iH, strJ, jF, (List) objD, jF2, iH2, (List) objD2, iH3, iH4, iH5, iH6, iH7);
    }
}
