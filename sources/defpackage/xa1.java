package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class xa1 implements KSerializer {
    public static final xa1 a = new xa1();
    public static final w92 b = wx.e("kotlinx.serialization.json.JsonNull", y92.d, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((JsonNull) obj).getClass();
        nq2.d(encoder);
        encoder.C();
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        nq2.c(decoder);
        if (!decoder.A()) {
            return JsonNull.INSTANCE;
        }
        throw new ga1("Expected 'null' literal");
    }
}
