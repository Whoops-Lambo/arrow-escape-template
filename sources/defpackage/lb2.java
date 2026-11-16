package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class lb2 implements qt0 {
    public static final lb2 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        return new KSerializer[]{zj2Var, zj2Var, k71.a, jg1.a};
    }

    static {
        lb2 lb2Var = new lb2();
        a = lb2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.SessionDetails", lb2Var, 4);
        pluginGeneratedSerialDescriptor.j("sessionId", false);
        pluginGeneratedSerialDescriptor.j("firstSessionId", false);
        pluginGeneratedSerialDescriptor.j("sessionIndex", false);
        pluginGeneratedSerialDescriptor.j("sessionStartTimestampUs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        hw hwVarB = decoder.b(serialDescriptor);
        int i = 0;
        int iH = 0;
        String strJ = null;
        String strJ2 = null;
        long jF = 0;
        boolean z = true;
        while (z) {
            int iT = hwVarB.t(serialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                strJ = hwVarB.j(serialDescriptor, 0);
                i |= 1;
            } else if (iT == 1) {
                strJ2 = hwVarB.j(serialDescriptor, 1);
                i |= 2;
            } else if (iT == 2) {
                iH = hwVarB.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iT != 3) {
                    m93.c(iT);
                    return null;
                }
                jF = hwVarB.f(serialDescriptor, 3);
                i |= 8;
            }
        }
        hwVarB.c(serialDescriptor);
        return new nb2(i, strJ, iH, strJ2, jF);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nb2 nb2Var = (nb2) obj;
        nb2Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        iw iwVarB = encoder.b(serialDescriptor);
        iwVarB.q(serialDescriptor, 0, nb2Var.a);
        iwVarB.q(serialDescriptor, 1, nb2Var.b);
        iwVarB.E(2, nb2Var.c, serialDescriptor);
        iwVarB.u(serialDescriptor, 3, nb2Var.d);
        iwVarB.c(serialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }
}
