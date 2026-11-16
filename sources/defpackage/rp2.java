package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rp2 implements qt0 {
    public static final rp2 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        jg1 jg1Var = jg1.a;
        return new KSerializer[]{jg1Var, jg1Var, jg1Var};
    }

    static {
        rp2 rp2Var = new rp2();
        a = rp2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.Time", rp2Var, 3);
        pluginGeneratedSerialDescriptor.j("ms", false);
        pluginGeneratedSerialDescriptor.j("us", true);
        pluginGeneratedSerialDescriptor.j("seconds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        hw hwVarB = decoder.b(serialDescriptor);
        int i = 0;
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(serialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                jF = hwVarB.f(serialDescriptor, 0);
                i |= 1;
            } else if (iT == 1) {
                jF2 = hwVarB.f(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iT != 2) {
                    m93.c(iT);
                    return null;
                }
                jF3 = hwVarB.f(serialDescriptor, 2);
                i |= 4;
            }
        }
        hwVarB.c(serialDescriptor);
        return new up2(i, jF, jF2, jF3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        up2 up2Var = (up2) obj;
        up2Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        iw iwVarB = encoder.b(serialDescriptor);
        long j = up2Var.a;
        long j2 = up2Var.c;
        long j3 = up2Var.b;
        iwVarB.u(serialDescriptor, 0, j);
        if (iwVarB.B(serialDescriptor) || j3 != j * 1000) {
            iwVarB.u(serialDescriptor, 1, j3);
        }
        if (iwVarB.B(serialDescriptor) || j2 != j / 1000) {
            iwVarB.u(serialDescriptor, 2, j2);
        }
        iwVarB.c(serialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }
}
