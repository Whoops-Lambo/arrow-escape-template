package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cz1 implements qt0 {
    public static final cz1 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{k71.a, zj2.a};
    }

    static {
        cz1 cz1Var = new cz1();
        a = cz1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.ProcessData", cz1Var, 2);
        pluginGeneratedSerialDescriptor.j("pid", false);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        hw hwVarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iH = 0;
        String strJ = null;
        while (z) {
            int iT = hwVarB.t(serialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                iH = hwVarB.h(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iT != 1) {
                    m93.c(iT);
                    return null;
                }
                strJ = hwVarB.j(serialDescriptor, 1);
                i |= 2;
            }
        }
        hwVarB.c(serialDescriptor);
        return new ez1(i, iH, strJ);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ez1 ez1Var = (ez1) obj;
        ez1Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        iw iwVarB = encoder.b(serialDescriptor);
        iwVarB.E(0, ez1Var.a, serialDescriptor);
        iwVarB.q(serialDescriptor, 1, ez1Var.b);
        iwVarB.c(serialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }
}
