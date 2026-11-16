package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ib1 implements KSerializer {
    public static final ib1 a = new ib1();
    public static final w92 b = wx.e("kotlinx.serialization.json.JsonPrimitive", ty1.l, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        nq2.d(encoder);
        if (dVar instanceof JsonNull) {
            encoder.y(xa1.a, JsonNull.INSTANCE);
        } else {
            encoder.y(ua1.a, (ta1) dVar);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        b bVarR = nq2.c(decoder).r();
        if (bVarR instanceof d) {
            return (d) bVarR;
        }
        throw os2.c(-1, bVarR.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + p32.a(bVarR.getClass()));
    }
}
