package com.moloco.sdk.internal.error.crash.model;

import com.ironsource.C4664b4;
import com.ironsource.R6;
import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.uu;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements qt0 {
    public static final c a;
    public static final PluginGeneratedSerialDescriptor b;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.error.crash.model.Contexts", cVar, 5);
        pluginGeneratedSerialDescriptor.j("app", true);
        pluginGeneratedSerialDescriptor.j(C4664b4.i.G, true);
        pluginGeneratedSerialDescriptor.j(R6.F, true);
        pluginGeneratedSerialDescriptor.j("runtime", true);
        pluginGeneratedSerialDescriptor.j("trace", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uu.w(a.a), uu.w(m.a), uu.w(q.a), uu.w(t.a), uu.w(l0.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        b bVar = null;
        n nVar = null;
        r rVar = null;
        u uVar = null;
        m0 m0Var = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                bVar = (b) hwVarB.B(pluginGeneratedSerialDescriptor, 0, a.a, bVar);
                i |= 1;
            } else if (iT == 1) {
                nVar = (n) hwVarB.B(pluginGeneratedSerialDescriptor, 1, m.a, nVar);
                i |= 2;
            } else if (iT == 2) {
                rVar = (r) hwVarB.B(pluginGeneratedSerialDescriptor, 2, q.a, rVar);
                i |= 4;
            } else if (iT == 3) {
                uVar = (u) hwVarB.B(pluginGeneratedSerialDescriptor, 3, t.a, uVar);
                i |= 8;
            } else {
                if (iT != 4) {
                    m93.c(iT);
                    return null;
                }
                m0Var = (m0) hwVarB.B(pluginGeneratedSerialDescriptor, 4, l0.a, m0Var);
                i |= 16;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new d(i, bVar, nVar, rVar, uVar, m0Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        m0 m0Var = dVar.e;
        u uVar = dVar.d;
        r rVar = dVar.c;
        n nVar = dVar.b;
        b bVar = dVar.a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || bVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 0, a.a, bVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || nVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 1, m.a, nVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || rVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 2, q.a, rVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || uVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 3, t.a, uVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || m0Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 4, l0.a, m0Var);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
