package com.moloco.sdk.internal.ortb.model;

import com.ironsource.C4664b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
import defpackage.uu;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements qt0 {
    public static final c a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes10.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return t.a;
        }
    }

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Player", cVar, 13);
        pluginGeneratedSerialDescriptor.j("skip", true);
        pluginGeneratedSerialDescriptor.j(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, false);
        pluginGeneratedSerialDescriptor.j("progress_bar", true);
        pluginGeneratedSerialDescriptor.j(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
        pluginGeneratedSerialDescriptor.j(C4664b4.i.G0, true);
        pluginGeneratedSerialDescriptor.j("is_all_area_clickable", false);
        pluginGeneratedSerialDescriptor.j("auto_store", true);
        pluginGeneratedSerialDescriptor.j("vast_privacy_icon", true);
        pluginGeneratedSerialDescriptor.j(com.safedk.android.analytics.brandsafety.m.Q, true);
        pluginGeneratedSerialDescriptor.j("countdown_timer", true);
        pluginGeneratedSerialDescriptor.j("android_inline", true);
        pluginGeneratedSerialDescriptor.j("auto_inline", true);
        pluginGeneratedSerialDescriptor.j("inline_button", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        k kVar = k.a;
        return new KSerializer[]{uu.w(kVar), kVar, uu.w(e.a), a.a, uu.w(d0.a), rj.a, uu.w(t.a), uu.w(m.a), uu.w(m0.a), uu.w(g0.a), uu.w(p.a), uu.w(r.a), uu.w(f1.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        s sVar = null;
        q qVar = null;
        h0 h0Var = null;
        g1 g1Var = null;
        n0 n0Var = null;
        int i = 0;
        l lVar = null;
        l lVar2 = null;
        f fVar = null;
        com.moloco.sdk.internal.ortb.model.b bVar = null;
        e0 e0Var = null;
        boolean zY = false;
        u uVar = null;
        n nVar = null;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    zY = zY;
                    sVar = sVar;
                    break;
                case 0:
                    lVar = (l) hwVarB.B(pluginGeneratedSerialDescriptor, 0, k.a, lVar);
                    i |= 1;
                    zY = zY;
                    sVar = sVar;
                    break;
                case 1:
                    lVar2 = (l) hwVarB.D(pluginGeneratedSerialDescriptor, 1, k.a, lVar2);
                    i |= 2;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 2:
                    fVar = (f) hwVarB.B(pluginGeneratedSerialDescriptor, 2, e.a, fVar);
                    i |= 4;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 3:
                    bVar = (com.moloco.sdk.internal.ortb.model.b) hwVarB.D(pluginGeneratedSerialDescriptor, 3, a.a, bVar);
                    i |= 8;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 4:
                    e0Var = (e0) hwVarB.B(pluginGeneratedSerialDescriptor, 4, d0.a, e0Var);
                    i |= 16;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 5:
                    lVar = lVar;
                    zY = hwVarB.y(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    lVar = lVar;
                    break;
                case 6:
                    uVar = (u) hwVarB.B(pluginGeneratedSerialDescriptor, 6, t.a, uVar);
                    i |= 64;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 7:
                    nVar = (n) hwVarB.B(pluginGeneratedSerialDescriptor, 7, m.a, nVar);
                    i |= 128;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 8:
                    n0Var = (n0) hwVarB.B(pluginGeneratedSerialDescriptor, 8, m0.a, n0Var);
                    i |= 256;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 9:
                    h0Var = (h0) hwVarB.B(pluginGeneratedSerialDescriptor, 9, g0.a, h0Var);
                    i |= 512;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 10:
                    qVar = (q) hwVarB.B(pluginGeneratedSerialDescriptor, 10, p.a, qVar);
                    i |= 1024;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 11:
                    sVar = (s) hwVarB.B(pluginGeneratedSerialDescriptor, 11, r.a, sVar);
                    i |= 2048;
                    zY = zY;
                    lVar = lVar;
                    break;
                case 12:
                    g1Var = (g1) hwVarB.B(pluginGeneratedSerialDescriptor, 12, f1.a, g1Var);
                    i |= 4096;
                    zY = zY;
                    lVar = lVar;
                    break;
                default:
                    m93.c(iT);
                    return null;
            }
        }
        boolean z2 = zY;
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new d(i, lVar, lVar2, fVar, bVar, e0Var, z2, uVar, nVar, n0Var, h0Var, qVar, sVar, g1Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        l lVar = dVar.a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || lVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 0, k.a, lVar);
        }
        k kVar = k.a;
        l lVar2 = dVar.b;
        g1 g1Var = dVar.m;
        s sVar = dVar.l;
        q qVar = dVar.k;
        h0 h0Var = dVar.j;
        n0 n0Var = dVar.i;
        n nVar = dVar.h;
        u uVar = dVar.g;
        e0 e0Var = dVar.e;
        f fVar = dVar.c;
        iwVarB.e(pluginGeneratedSerialDescriptor, 1, kVar, lVar2);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || fVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 2, e.a, fVar);
        }
        iwVarB.e(pluginGeneratedSerialDescriptor, 3, a.a, dVar.d);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || e0Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 4, d0.a, e0Var);
        }
        iwVarB.p(pluginGeneratedSerialDescriptor, 5, dVar.f);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || uVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 6, t.a, uVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || nVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 7, m.a, nVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || n0Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 8, m0.a, n0Var);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || h0Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 9, g0.a, h0Var);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || qVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 10, p.a, qVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || sVar != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 11, r.a, sVar);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || g1Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 12, f1.a, g1Var);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
