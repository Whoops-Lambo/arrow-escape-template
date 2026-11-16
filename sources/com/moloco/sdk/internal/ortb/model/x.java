package com.moloco.sdk.internal.ortb.model;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.ironsource.C5074y2;
import defpackage.ap0;
import defpackage.hw;
import defpackage.iw;
import defpackage.k71;
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
public final /* synthetic */ class x implements qt0 {
    public static final x a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return f1.a;
        }
    }

    static {
        x xVar = new x();
        a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Bid", xVar, 8);
        pluginGeneratedSerialDescriptor.j("adm", false);
        pluginGeneratedSerialDescriptor.j("price", false);
        pluginGeneratedSerialDescriptor.j(C5074y2.y, true);
        pluginGeneratedSerialDescriptor.j("ext", false);
        pluginGeneratedSerialDescriptor.j("crid", true);
        pluginGeneratedSerialDescriptor.j("bundle", true);
        pluginGeneratedSerialDescriptor.j("w", true);
        pluginGeneratedSerialDescriptor.j(CmcdData.STREAMING_FORMAT_HLS, true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        KSerializer kSerializerW = uu.w(zj2Var);
        KSerializer kSerializerW2 = uu.w(zj2Var);
        KSerializer kSerializerW3 = uu.w(zj2Var);
        k71 k71Var = k71.a;
        return new KSerializer[]{zj2Var, ap0.a, kSerializerW, z.a, kSerializerW2, kSerializerW3, uu.w(k71Var), uu.w(k71Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        Object obj = null;
        int i = 0;
        String strJ = null;
        String str = null;
        a0 a0Var = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        float fW = 0.0f;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strJ = hwVarB.j(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    fW = hwVarB.w(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) hwVarB.B(pluginGeneratedSerialDescriptor, 2, zj2.a, str);
                    i |= 4;
                    break;
                case 3:
                    a0Var = (a0) hwVarB.D(pluginGeneratedSerialDescriptor, 3, z.a, a0Var);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) hwVarB.B(pluginGeneratedSerialDescriptor, 4, zj2.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) hwVarB.B(pluginGeneratedSerialDescriptor, 5, zj2.a, str3);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) hwVarB.B(pluginGeneratedSerialDescriptor, 6, k71.a, num);
                    i |= 64;
                    break;
                case 7:
                    num2 = (Integer) hwVarB.B(pluginGeneratedSerialDescriptor, 7, k71.a, num2);
                    i |= 128;
                    break;
                default:
                    m93.c(iT);
                    return obj;
            }
            obj = null;
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new y(i, strJ, fW, str, a0Var, str2, str3, num, num2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y yVar = (y) obj;
        yVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        String str = yVar.a;
        Integer num = yVar.h;
        Integer num2 = yVar.g;
        String str2 = yVar.f;
        String str3 = yVar.e;
        String str4 = yVar.c;
        iwVarB.q(pluginGeneratedSerialDescriptor, 0, str);
        iwVarB.D(pluginGeneratedSerialDescriptor, 1, yVar.b);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || str4 != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 2, zj2.a, str4);
        }
        iwVarB.e(pluginGeneratedSerialDescriptor, 3, z.a, yVar.d);
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || str3 != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 4, zj2.a, str3);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || str2 != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 5, zj2.a, str2);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || num2 != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 6, k71.a, num2);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || num != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 7, k71.a, num);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
