package com.moloco.sdk.internal.error.crash.model;

import com.applovin.sdk.AppLovinEventTypes;
import defpackage.hg0;
import defpackage.hw;
import defpackage.iw;
import defpackage.jg1;
import defpackage.m93;
import defpackage.qt0;
import defpackage.s71;
import defpackage.uu;
import defpackage.zj2;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements qt0 {
    public static final f a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return i.a;
        }
    }

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.error.crash.model.CrashReport", fVar, 14);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        pluginGeneratedSerialDescriptor.j("platform", true);
        pluginGeneratedSerialDescriptor.j(AppLovinEventTypes.USER_COMPLETED_LEVEL, true);
        pluginGeneratedSerialDescriptor.j("environment", true);
        pluginGeneratedSerialDescriptor.j("release", false);
        pluginGeneratedSerialDescriptor.j("sdk", false);
        pluginGeneratedSerialDescriptor.j("user", true);
        pluginGeneratedSerialDescriptor.j("exception", false);
        pluginGeneratedSerialDescriptor.j("threads", true);
        pluginGeneratedSerialDescriptor.j("debug_meta", true);
        pluginGeneratedSerialDescriptor.j("contexts", false);
        pluginGeneratedSerialDescriptor.j("tags", true);
        pluginGeneratedSerialDescriptor.j("extra", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = g.o;
        KSerializer kSerializerW = uu.w(j0.a);
        KSerializer kSerializerW2 = uu.w(k.a);
        KSerializer kSerializer = kSerializerArr[12];
        KSerializer kSerializer2 = kSerializerArr[13];
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{zj2Var, jg1.a, zj2Var, zj2Var, zj2Var, zj2Var, v.a, h0.a, o.a, kSerializerW, kSerializerW2, c.a, kSerializer, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        long jF;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = g.o;
        long j = 0;
        d dVar = null;
        l lVar = null;
        k0 k0Var = null;
        p pVar = null;
        Map map = null;
        w wVar = null;
        i0 i0Var = null;
        int i = 0;
        Map map2 = null;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        boolean z = true;
        String strJ5 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    jF = j;
                    z = false;
                    break;
                case 0:
                    jF = j;
                    strJ5 = hwVarB.j(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    jF = hwVarB.f(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    jF = j;
                    strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    jF = j;
                    strJ2 = hwVarB.j(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    jF = j;
                    strJ3 = hwVarB.j(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    jF = j;
                    strJ4 = hwVarB.j(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    jF = j;
                    wVar = (w) hwVarB.D(pluginGeneratedSerialDescriptor, 6, v.a, wVar);
                    i |= 64;
                    break;
                case 7:
                    jF = j;
                    i0Var = (i0) hwVarB.D(pluginGeneratedSerialDescriptor, 7, h0.a, i0Var);
                    i |= 128;
                    break;
                case 8:
                    jF = j;
                    pVar = (p) hwVarB.D(pluginGeneratedSerialDescriptor, 8, o.a, pVar);
                    i |= 256;
                    break;
                case 9:
                    jF = j;
                    k0Var = (k0) hwVarB.B(pluginGeneratedSerialDescriptor, 9, j0.a, k0Var);
                    i |= 512;
                    break;
                case 10:
                    jF = j;
                    lVar = (l) hwVarB.B(pluginGeneratedSerialDescriptor, 10, k.a, lVar);
                    i |= 1024;
                    break;
                case 11:
                    jF = j;
                    dVar = (d) hwVarB.D(pluginGeneratedSerialDescriptor, 11, c.a, dVar);
                    i |= 2048;
                    break;
                case 12:
                    jF = j;
                    map = (Map) hwVarB.D(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], map);
                    i |= 4096;
                    break;
                case 13:
                    jF = j;
                    map2 = (Map) hwVarB.D(pluginGeneratedSerialDescriptor, 13, kSerializerArr[13], map2);
                    i |= 8192;
                    break;
                default:
                    m93.c(iT);
                    return null;
            }
            j = jF;
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new g(i, strJ5, j, strJ, strJ2, strJ3, strJ4, wVar, i0Var, pVar, k0Var, lVar, dVar, map, map2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = g.o;
        String str = gVar.a;
        Map map = gVar.n;
        Map map2 = gVar.m;
        l lVar = gVar.k;
        k0 k0Var = gVar.j;
        i0 i0Var = gVar.h;
        String str2 = gVar.e;
        String str3 = gVar.d;
        String str4 = gVar.c;
        iwVarB.q(pluginGeneratedSerialDescriptor, 0, str);
        iwVarB.u(pluginGeneratedSerialDescriptor, 1, gVar.b);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || !s71.b(str4, "java")) {
            iwVarB.q(pluginGeneratedSerialDescriptor, 2, str4);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || !s71.b(str3, "fatal")) {
            iwVarB.q(pluginGeneratedSerialDescriptor, 3, str3);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || !s71.b(str2, "production")) {
            iwVarB.q(pluginGeneratedSerialDescriptor, 4, str2);
        }
        iwVarB.q(pluginGeneratedSerialDescriptor, 5, gVar.f);
        iwVarB.e(pluginGeneratedSerialDescriptor, 6, v.a, gVar.g);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || !s71.b(i0Var, new i0())) {
            iwVarB.e(pluginGeneratedSerialDescriptor, 7, h0.a, i0Var);
        }
        iwVarB.e(pluginGeneratedSerialDescriptor, 8, o.a, gVar.i);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || k0Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 9, j0.a, k0Var);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || lVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 10, k.a, lVar);
        }
        iwVarB.e(pluginGeneratedSerialDescriptor, 11, c.a, gVar.l);
        boolean zB = iwVarB.B(pluginGeneratedSerialDescriptor);
        hg0 hg0Var = hg0.a;
        if (zB || !s71.b(map2, hg0Var)) {
            iwVarB.e(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], map2);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || !s71.b(map, hg0Var)) {
            iwVarB.e(pluginGeneratedSerialDescriptor, 13, kSerializerArr[13], map);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
