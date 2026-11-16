package com.moloco.sdk.internal.ortb.model;

import androidx.compose.ui.graphics.Color;
import defpackage.cy2;
import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
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
public final /* synthetic */ class k implements qt0 {
    public static final k a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return g0.a;
        }
    }

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.SkipClose", kVar, 7);
        pluginGeneratedSerialDescriptor.j("delay_seconds", false);
        pluginGeneratedSerialDescriptor.j("padding", false);
        pluginGeneratedSerialDescriptor.j("control_size", false);
        pluginGeneratedSerialDescriptor.j("horizontal_alignment", false);
        pluginGeneratedSerialDescriptor.j("vertical_alignment", false);
        pluginGeneratedSerialDescriptor.j("foreground_color", false);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = l.h;
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[4];
        f0 f0Var = f0.a;
        KSerializer kSerializerW = uu.w(f0Var);
        cy2 cy2Var = cy2.a;
        return new KSerializer[]{cy2Var, cy2Var, cy2Var, kSerializer, kSerializer2, f0Var, kSerializerW};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = l.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        yx2 yx2Var = null;
        yx2 yx2Var2 = null;
        yx2 yx2Var3 = null;
        e1 e1Var = null;
        o oVar = null;
        Color color = null;
        Color color2 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    yx2Var = (yx2) hwVarB.D(pluginGeneratedSerialDescriptor, 0, cy2.a, yx2Var);
                    i |= 1;
                    break;
                case 1:
                    yx2Var2 = (yx2) hwVarB.D(pluginGeneratedSerialDescriptor, 1, cy2.a, yx2Var2);
                    i |= 2;
                    break;
                case 2:
                    yx2Var3 = (yx2) hwVarB.D(pluginGeneratedSerialDescriptor, 2, cy2.a, yx2Var3);
                    i |= 4;
                    break;
                case 3:
                    e1Var = (e1) hwVarB.D(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], e1Var);
                    i |= 8;
                    break;
                case 4:
                    oVar = (o) hwVarB.D(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], oVar);
                    i |= 16;
                    break;
                case 5:
                    color = (Color) hwVarB.D(pluginGeneratedSerialDescriptor, 5, f0.a, color);
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
        return new l(i, yx2Var, yx2Var2, yx2Var3, e1Var, oVar, color, color2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        lVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = l.h;
        cy2 cy2Var = cy2.a;
        int i = lVar.a;
        Color color = lVar.g;
        iwVarB.e(pluginGeneratedSerialDescriptor, 0, cy2Var, new yx2(i));
        iwVarB.e(pluginGeneratedSerialDescriptor, 1, cy2Var, new yx2(lVar.b));
        iwVarB.e(pluginGeneratedSerialDescriptor, 2, cy2Var, new yx2(lVar.c));
        iwVarB.e(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], lVar.d);
        iwVarB.e(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], lVar.e);
        f0 f0Var = f0.a;
        iwVarB.e(pluginGeneratedSerialDescriptor, 5, f0Var, new Color(lVar.f));
        if (iwVarB.B(pluginGeneratedSerialDescriptor) || color != null) {
            iwVarB.h(pluginGeneratedSerialDescriptor, 6, f0Var, color);
        }
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
