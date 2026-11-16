package com.moloco.sdk.internal.ortb.model;

import androidx.compose.ui.graphics.Color;
import defpackage.cy2;
import defpackage.hw;
import defpackage.iw;
import defpackage.m93;
import defpackage.qt0;
import defpackage.yx2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements qt0 {
    public static final e a;
    public static final PluginGeneratedSerialDescriptor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return x.a;
        }
    }

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.ProgressBar", eVar, 4);
        pluginGeneratedSerialDescriptor.j("padding", false);
        pluginGeneratedSerialDescriptor.j("horizontal_alignment", false);
        pluginGeneratedSerialDescriptor.j("vertical_alignment", false);
        pluginGeneratedSerialDescriptor.j("foreground_color", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = f.e;
        return new KSerializer[]{cy2.a, kSerializerArr[1], kSerializerArr[2], f0.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = f.e;
        boolean z = true;
        int i = 0;
        yx2 yx2Var = null;
        e1 e1Var = null;
        o oVar = null;
        Color color = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                yx2Var = (yx2) hwVarB.D(pluginGeneratedSerialDescriptor, 0, cy2.a, yx2Var);
                i |= 1;
            } else if (iT == 1) {
                e1Var = (e1) hwVarB.D(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], e1Var);
                i |= 2;
            } else if (iT == 2) {
                oVar = (o) hwVarB.D(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], oVar);
                i |= 4;
            } else {
                if (iT != 3) {
                    m93.c(iT);
                    return null;
                }
                color = (Color) hwVarB.D(pluginGeneratedSerialDescriptor, 3, f0.a, color);
                i |= 8;
            }
        }
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new f(i, yx2Var, e1Var, oVar, color);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = f.e;
        iwVarB.e(pluginGeneratedSerialDescriptor, 0, cy2.a, new yx2(fVar.a));
        iwVarB.e(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], fVar.b);
        iwVarB.e(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], fVar.c);
        iwVarB.e(pluginGeneratedSerialDescriptor, 3, f0.a, new Color(fVar.d));
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }
}
