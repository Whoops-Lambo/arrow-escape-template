package defpackage;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class la1 implements KSerializer {
    public static final la1 a = new la1();
    public static final w92 b = wx.d("kotlinx.serialization.json.JsonElement", rv1.e, new SerialDescriptor[0], new w01(1));

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b bVar = (b) obj;
        bVar.getClass();
        nq2.d(encoder);
        if (bVar instanceof d) {
            encoder.y(ib1.a, bVar);
            return;
        }
        if (bVar instanceof c) {
            encoder.y(ab1.a, bVar);
        } else if (bVar instanceof a) {
            encoder.y(w91.a, bVar);
        } else {
            e.b();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return nq2.c(decoder).r();
    }
}
