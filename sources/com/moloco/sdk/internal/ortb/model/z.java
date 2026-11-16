package com.moloco.sdk.internal.ortb.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.uu;
import defpackage.zj2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements qt0 {
    public static final z a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return j1.a;
        }
    }

    static {
        z zVar = new z();
        a = zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.BidExt", zVar, 5);
        pluginGeneratedSerialDescriptor.j("player", true);
        pluginGeneratedSerialDescriptor.j(com.safedk.android.analytics.brandsafety.creatives.discoveries.n.b, true);
        pluginGeneratedSerialDescriptor.j("moloco_sdk_configs", true);
        pluginGeneratedSerialDescriptor.j("moloco_sdk_events", true);
        pluginGeneratedSerialDescriptor.j("moloco_sdk_click_metadata", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uu.w(c.a), uu.w(zj2.a), uu.w(j1.a), uu.w(g.a), uu.w(h1.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        d dVar = null;
        String str = null;
        k1 k1Var = null;
        h hVar = null;
        i1 i1Var = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                dVar = (d) hwVarB.B(pluginGeneratedSerialDescriptor, 0, c.a, dVar);
                i |= 1;
            } else if (iT == 1) {
                str = (String) hwVarB.B(pluginGeneratedSerialDescriptor, 1, zj2.a, str);
                i |= 2;
            } else if (iT == 2) {
                k1Var = (k1) hwVarB.B(pluginGeneratedSerialDescriptor, 2, j1.a, k1Var);
                i |= 4;
            } else if (iT == 3) {
                hVar = (h) hwVarB.B(pluginGeneratedSerialDescriptor, 3, g.a, hVar);
                i |= 8;
            } else {
                if (iT != 4) {
                    m93.c(iT);
                    return null;
                }
                i1Var = (i1) hwVarB.B(pluginGeneratedSerialDescriptor, 4, h1.a, i1Var);
                i |= 16;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new a0(i, dVar, str, k1Var, hVar, i1Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a0 a0Var = (a0) obj;
        a0Var.getClass();
        i1 i1Var = a0Var.e;
        h hVar = a0Var.d;
        k1 k1Var = a0Var.c;
        String str = a0Var.b;
        d dVar = a0Var.a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || dVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 0, c.a, dVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || str != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 1, zj2.a, str);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || k1Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 2, j1.a, k1Var);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || hVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 3, g.a, hVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || i1Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 4, h1.a, i1Var);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
