package com.moloco.sdk.internal.ortb.model;

import androidx.compose.ui.graphics.Color;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.cy2;
import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
import defpackage.uu;
import defpackage.yx2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements qt0 {
    public static final a a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return p.a;
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Mute", aVar, 7);
        pluginGeneratedSerialDescriptor.j(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
        pluginGeneratedSerialDescriptor.j("padding", false);
        pluginGeneratedSerialDescriptor.j("horizontal_alignment", false);
        pluginGeneratedSerialDescriptor.j("vertical_alignment", false);
        pluginGeneratedSerialDescriptor.j("foreground_color", false);
        pluginGeneratedSerialDescriptor.j("control_size", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = com.moloco.sdk.internal.ortb.model.b.h;
        cy2 cy2Var = cy2.a;
        KSerializer kSerializer = kSerializerArr[2];
        KSerializer kSerializer2 = kSerializerArr[3];
        f0 f0Var = f0.a;
        return new KSerializer[]{rj.a, cy2Var, kSerializer, kSerializer2, f0Var, uu.w(cy2Var), uu.w(f0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = com.moloco.sdk.internal.ortb.model.b.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zY = false;
        yx2 yx2Var = null;
        e1 e1Var = null;
        o oVar = null;
        Color color = null;
        yx2 yx2Var2 = null;
        Color color2 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zY = hwVarB.y(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    yx2Var = (yx2) hwVarB.D(pluginGeneratedSerialDescriptor, 1, cy2.a, yx2Var);
                    i |= 2;
                    break;
                case 2:
                    e1Var = (e1) hwVarB.D(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], e1Var);
                    i |= 4;
                    break;
                case 3:
                    oVar = (o) hwVarB.D(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], oVar);
                    i |= 8;
                    break;
                case 4:
                    color = (Color) hwVarB.D(pluginGeneratedSerialDescriptor, 4, f0.a, color);
                    i |= 16;
                    break;
                case 5:
                    yx2Var2 = (yx2) hwVarB.B(pluginGeneratedSerialDescriptor, 5, cy2.a, yx2Var2);
                    i |= 32;
                    break;
                case 6:
                    color2 = (Color) hwVarB.B(pluginGeneratedSerialDescriptor, 6, f0.a, color2);
                    i |= 64;
                    break;
                default:
                    m93.c(iT);
                    return obj;
            }
            obj = null;
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new com.moloco.sdk.internal.ortb.model.b(i, zY, yx2Var, e1Var, oVar, color, yx2Var2, color2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        com.moloco.sdk.internal.ortb.model.b bVar = (com.moloco.sdk.internal.ortb.model.b) obj;
        bVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = com.moloco.sdk.internal.ortb.model.b.h;
        boolean z = bVar.a;
        Color color = bVar.g;
        yx2 yx2Var = bVar.f;
        iwVarB.p(pluginGeneratedSerialDescriptor, 0, z);
        cy2 cy2Var = cy2.a;
        iwVarB.e(pluginGeneratedSerialDescriptor, 1, cy2Var, new yx2(bVar.b));
        iwVarB.e(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], bVar.c);
        iwVarB.e(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], bVar.d);
        f0 f0Var = f0.a;
        iwVarB.e(pluginGeneratedSerialDescriptor, 4, f0Var, new Color(bVar.e));
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || yx2Var != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 5, cy2Var, yx2Var);
        }
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || color != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 6, f0Var, color);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
