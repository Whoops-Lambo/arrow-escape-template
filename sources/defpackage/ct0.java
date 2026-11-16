package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ct0 implements qt0 {
    public static final ct0 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ct0 ct0Var = new ct0();
        a = ct0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.util.date.GMTDate", ct0Var, 9);
        pluginGeneratedSerialDescriptor.j("seconds", false);
        pluginGeneratedSerialDescriptor.j("minutes", false);
        pluginGeneratedSerialDescriptor.j("hours", false);
        pluginGeneratedSerialDescriptor.j("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.j("dayOfMonth", false);
        pluginGeneratedSerialDescriptor.j("dayOfYear", false);
        pluginGeneratedSerialDescriptor.j("month", false);
        pluginGeneratedSerialDescriptor.j("year", false);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        gd1[] gd1VarArr = et0.j;
        k71 k71Var = k71.a;
        return new KSerializer[]{k71Var, k71Var, k71Var, gd1VarArr[3].getValue(), k71Var, k71Var, gd1VarArr[6].getValue(), k71Var, jg1.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        hw hwVarB = decoder.b(serialDescriptor);
        gd1[] gd1VarArr = et0.j;
        Object obj = null;
        int i = 0;
        int iH = 0;
        int iH2 = 0;
        int iH3 = 0;
        int iH4 = 0;
        int iH5 = 0;
        int iH6 = 0;
        n83 n83Var = null;
        long jF = 0;
        boolean z = true;
        go1 go1Var = null;
        while (z) {
            int iT = hwVarB.t(serialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iH = hwVarB.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iH2 = hwVarB.h(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iH3 = hwVarB.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    n83Var = (n83) hwVarB.D(serialDescriptor, 3, (KSerializer) gd1VarArr[3].getValue(), n83Var);
                    i |= 8;
                    break;
                case 4:
                    iH4 = hwVarB.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iH5 = hwVarB.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    go1Var = (go1) hwVarB.D(serialDescriptor, 6, (KSerializer) gd1VarArr[6].getValue(), go1Var);
                    i |= 64;
                    break;
                case 7:
                    iH6 = hwVarB.h(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    jF = hwVarB.f(serialDescriptor, 8);
                    i |= 256;
                    continue;
                default:
                    m93.c(iT);
                    return obj;
            }
            obj = null;
        }
        hwVarB.c(serialDescriptor);
        return new et0(i, iH, iH2, iH3, n83Var, iH4, iH5, go1Var, iH6, jF);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        et0 et0Var = (et0) obj;
        et0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        iw iwVarB = encoder.b(serialDescriptor);
        gd1[] gd1VarArr = et0.j;
        iwVarB.E(0, et0Var.a, serialDescriptor);
        iwVarB.E(1, et0Var.b, serialDescriptor);
        iwVarB.E(2, et0Var.c, serialDescriptor);
        iwVarB.e(serialDescriptor, 3, (KSerializer) gd1VarArr[3].getValue(), et0Var.d);
        iwVarB.E(4, et0Var.e, serialDescriptor);
        iwVarB.E(5, et0Var.f, serialDescriptor);
        iwVarB.e(serialDescriptor, 6, (KSerializer) gd1VarArr[6].getValue(), et0Var.g);
        iwVarB.E(7, et0Var.h, serialDescriptor);
        iwVarB.u(serialDescriptor, 8, et0Var.i);
        iwVarB.c(serialDescriptor);
    }
}
