package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cb2 implements qt0 {
    public static final cb2 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        cb2 cb2Var = new cb2();
        a = cb2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.settings.SessionConfigs", cb2Var, 5);
        pluginGeneratedSerialDescriptor.j("sessionsEnabled", false);
        pluginGeneratedSerialDescriptor.j("sessionSamplingRate", false);
        pluginGeneratedSerialDescriptor.j("sessionTimeoutSeconds", false);
        pluginGeneratedSerialDescriptor.j("cacheDurationSeconds", false);
        pluginGeneratedSerialDescriptor.j("cacheUpdatedTimeSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerW = uu.w(rj.a);
        KSerializer kSerializerW2 = uu.w(od0.a);
        k71 k71Var = k71.a;
        return new KSerializer[]{kSerializerW, kSerializerW2, uu.w(k71Var), uu.w(k71Var), uu.w(jg1.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        hw hwVarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int iT = hwVarB.t(serialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                bool = (Boolean) hwVarB.B(serialDescriptor, 0, rj.a, bool);
                i |= 1;
            } else if (iT == 1) {
                d = (Double) hwVarB.B(serialDescriptor, 1, od0.a, d);
                i |= 2;
            } else if (iT == 2) {
                num = (Integer) hwVarB.B(serialDescriptor, 2, k71.a, num);
                i |= 4;
            } else if (iT == 3) {
                num2 = (Integer) hwVarB.B(serialDescriptor, 3, k71.a, num2);
                i |= 8;
            } else {
                if (iT != 4) {
                    m93.c(iT);
                    return null;
                }
                l = (Long) hwVarB.B(serialDescriptor, 4, jg1.a, l);
                i |= 16;
            }
        }
        hwVarB.c(serialDescriptor);
        return new eb2(i, bool, d, num, num2, l);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        eb2 eb2Var = (eb2) obj;
        eb2Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        iw iwVarB = encoder.b(serialDescriptor);
        iwVarB.h(serialDescriptor, 0, rj.a, eb2Var.a);
        iwVarB.h(serialDescriptor, 1, od0.a, eb2Var.b);
        k71 k71Var = k71.a;
        iwVarB.h(serialDescriptor, 2, k71Var, eb2Var.c);
        iwVarB.h(serialDescriptor, 3, k71Var, eb2Var.d);
        iwVarB.h(serialDescriptor, 4, jg1.a, eb2Var.e);
        iwVarB.c(serialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }
}
