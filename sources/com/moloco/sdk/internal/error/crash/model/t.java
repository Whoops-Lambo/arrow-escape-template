package com.moloco.sdk.internal.error.crash.model;

import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.s71;
import defpackage.uu;
import defpackage.zj2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements qt0 {
    public static final t a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return h0.a;
        }
    }

    static {
        t tVar = new t();
        a = tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.error.crash.model.RuntimeContext", tVar, 2);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("version", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{zj2Var, uu.w(zj2Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String strJ = null;
        String str = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                if (iT != 1) {
                    m93.c(iT);
                    return null;
                }
                str = (String) hwVarB.B(pluginGeneratedSerialDescriptor, 1, zj2.a, str);
                i |= 2;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new u(i, strJ, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u uVar = (u) obj;
        uVar.getClass();
        String str = uVar.b;
        String str2 = uVar.a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || !s71.b(str2, "ART")) {
            iwVarB.q(pluginGeneratedSerialDescriptor, 0, str2);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || str != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 1, zj2.a, str);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
