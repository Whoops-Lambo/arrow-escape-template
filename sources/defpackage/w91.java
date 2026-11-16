package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class w91 implements KSerializer {
    public static final w91 a = new w91();
    public static final v91 b = v91.b;

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a aVar = (a) obj;
        aVar.getClass();
        nq2.d(encoder);
        la1 la1Var = la1.a;
        SerialDescriptor descriptor = la1Var.getDescriptor();
        descriptor.getClass();
        e8 e8Var = new e8(descriptor, 1);
        int size = aVar.size();
        iw iwVarT = encoder.t(e8Var);
        Iterator<b> it = aVar.iterator();
        for (int i = 0; i < size; i++) {
            iwVarT.e(e8Var, i, la1Var, it.next());
        }
        iwVarT.c(e8Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        nq2.c(decoder);
        return new a((List) new j8(la1.a, 0).e(decoder));
    }
}
