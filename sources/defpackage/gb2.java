package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gb2 implements qt0 {
    public static final gb2 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        gb2 gb2Var = new gb2();
        a = gb2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.SessionData", gb2Var, 3);
        pluginGeneratedSerialDescriptor.j("sessionDetails", false);
        pluginGeneratedSerialDescriptor.j("backgroundTime", true);
        pluginGeneratedSerialDescriptor.j("processDataMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lb2.a, uu.w(rp2.a), uu.w((KSerializer) ib2.d[2].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        hw hwVarB = decoder.b(serialDescriptor);
        gd1[] gd1VarArr = ib2.d;
        boolean z = true;
        int i = 0;
        nb2 nb2Var = null;
        up2 up2Var = null;
        Map map = null;
        while (z) {
            int iT = hwVarB.t(serialDescriptor);
            if (iT == -1) {
                z = false;
            } else if (iT == 0) {
                nb2Var = (nb2) hwVarB.D(serialDescriptor, 0, lb2.a, nb2Var);
                i |= 1;
            } else if (iT == 1) {
                up2Var = (up2) hwVarB.B(serialDescriptor, 1, rp2.a, up2Var);
                i |= 2;
            } else {
                if (iT != 2) {
                    m93.c(iT);
                    return null;
                }
                map = (Map) hwVarB.B(serialDescriptor, 2, (KSerializer) gd1VarArr[2].getValue(), map);
                i |= 4;
            }
        }
        hwVarB.c(serialDescriptor);
        return new ib2(i, nb2Var, up2Var, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ib2 ib2Var = (ib2) obj;
        ib2Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        iw iwVarB = encoder.b(serialDescriptor);
        gd1[] gd1VarArr = ib2.d;
        lb2 lb2Var = lb2.a;
        nb2 nb2Var = ib2Var.a;
        Map map = ib2Var.c;
        up2 up2Var = ib2Var.b;
        iwVarB.e(serialDescriptor, 0, lb2Var, nb2Var);
        if (iwVarB.B(serialDescriptor) || up2Var != null) {
            iwVarB.h(serialDescriptor, 1, rp2.a, up2Var);
        }
        if (iwVarB.B(serialDescriptor) || map != null) {
            iwVarB.h(serialDescriptor, 2, (KSerializer) gd1VarArr[2].getValue(), map);
        }
        iwVarB.c(serialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }
}
