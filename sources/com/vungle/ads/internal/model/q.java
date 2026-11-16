package com.vungle.ads.internal.model;

import defpackage.hw;
import defpackage.iw;
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
/* JADX INFO: loaded from: classes9.dex */
public final class q implements qt0 {
    public static final q a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        q qVar = new q();
        a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", qVar, 3);
        pluginGeneratedSerialDescriptor.j("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.j(com.safedk.android.analytics.brandsafety.creatives.discoveries.t.c, true);
        pluginGeneratedSerialDescriptor.j("csb", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uu.w(zj2.a), uu.w(g.a), uu.w(j.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s sVar = (s) obj;
        encoder.getClass();
        sVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        s.a(sVar, iwVarB, pluginGeneratedSerialDescriptor);
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
                            objB = hwVarB.B(pluginGeneratedSerialDescriptor, 2, j.a, objB);
                            i |= 4;
                        } else {
                            m93.c(iT);
                            return null;
                        }
                    } else {
                        objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, g.a, objB2);
                        i |= 2;
                    }
                } else {
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, zj2.a, objB3);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new s(i, (String) objB3, (i) objB2, (l) objB);
    }
}
