package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tl1 implements KSerializer {
    public final /* synthetic */ int a;
    public final Object b;

    public tl1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = eu.v(pd1.b, new d21(this));
                break;
            default:
                this.b = k71.b;
                break;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object j52Var;
        switch (this.a) {
            case 0:
                try {
                    j52Var = Integer.valueOf(decoder.s());
                    break;
                } catch (Throwable th) {
                    j52Var = new j52(th);
                }
                return k52.b(j52Var) == null ? j52Var : decoder.z(new j8(k71.a, 0));
            default:
                SerialDescriptor descriptor = getDescriptor();
                hw hwVarB = decoder.b(descriptor);
                int iT = hwVarB.t(getDescriptor());
                if (iT != -1) {
                    throw new ba2(pv1.k(iT, "Unexpected index "));
                }
                hwVarB.c(descriptor);
                return az2.a;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.a) {
            case 0:
                return (vy1) this.b;
            default:
                return (SerialDescriptor) ((gd1) this.b).getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i = this.a;
        obj.getClass();
        switch (i) {
            case 0:
                if (obj instanceof Integer) {
                    encoder.y(k71.a, obj);
                } else if (!(obj instanceof List)) {
                    e32.i("Unexpected vendors array serialization");
                } else {
                    encoder.y(new j8(k71.a, 0), (List) obj);
                }
                break;
            default:
                encoder.b(getDescriptor()).c(getDescriptor());
                break;
        }
    }
}
