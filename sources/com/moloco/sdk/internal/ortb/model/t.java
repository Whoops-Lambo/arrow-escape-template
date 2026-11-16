package com.moloco.sdk.internal.ortb.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
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
public final /* synthetic */ class t implements qt0 {
    public static final t a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return y0.a;
        }
    }

    static {
        t tVar = new t();
        a = tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.AutoStore", tVar, 3);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        pluginGeneratedSerialDescriptor.j("on_skip", true);
        pluginGeneratedSerialDescriptor.j("event_link", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerW = uu.w(zj2.a);
        rj rjVar = rj.a;
        return new KSerializer[]{rjVar, rjVar, kSerializerW};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zY = false;
        boolean zY2 = false;
        String str = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                zY = hwVarB.y(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iT == 1) {
                zY2 = hwVarB.y(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else {
                if (iT != 2) {
                    m93.c(iT);
                    return null;
                }
                str = (String) hwVarB.B(pluginGeneratedSerialDescriptor, 2, zj2.a, str);
                i |= 4;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new u(str, zY, zY2, i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u uVar = (u) obj;
        uVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        boolean z = uVar.a;
        String str = uVar.c;
        boolean z2 = uVar.b;
        iwVarB.p(pluginGeneratedSerialDescriptor, 0, z);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || !z2) {
            iwVarB.p(pluginGeneratedSerialDescriptor, 1, z2);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || str != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 2, zj2.a, str);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
