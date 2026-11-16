package com.vungle.ads.internal.model;

import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.uu;
import defpackage.wz2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class r1 implements qt0 {
    public static final r1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        r1 r1Var = new r1();
        a = r1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.User", r1Var, 5);
        pluginGeneratedSerialDescriptor.j(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
        pluginGeneratedSerialDescriptor.j("ccpa", true);
        pluginGeneratedSerialDescriptor.j("coppa", true);
        pluginGeneratedSerialDescriptor.j("fpd", true);
        pluginGeneratedSerialDescriptor.j("iab", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uu.w(f1.a), uu.w(v0.a), uu.w(y0.a), uu.w(FirstPartyData$$serializer.INSTANCE), uu.w(i1.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t1 t1Var = (t1) obj;
        encoder.getClass();
        t1Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        t1.a(t1Var, iwVarB, pluginGeneratedSerialDescriptor);
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
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT != -1) {
                if (iT != 0) {
                    if (iT != 1) {
                        if (iT != 2) {
                            if (iT != 3) {
                                if (iT == 4) {
                                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 4, i1.a, objB);
                                    i |= 16;
                                } else {
                                    m93.c(iT);
                                    return null;
                                }
                            } else {
                                objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 3, FirstPartyData$$serializer.INSTANCE, objB2);
                                i |= 8;
                            }
                        } else {
                            objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, y0.a, objB3);
                            i |= 4;
                        }
                    } else {
                        objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, v0.a, objB4);
                        i |= 2;
                    }
                } else {
                    objB5 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, f1.a, objB5);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new t1(i, (h1) objB5, (x0) objB4, (a1) objB3, (FirstPartyData) objB2, (k1) objB);
    }
}
