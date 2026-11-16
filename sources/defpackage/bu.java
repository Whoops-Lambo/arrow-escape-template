package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bu extends j0 {
    public final KSerializer a;

    public abstract void i(int i, Object obj, Object obj2);

    public bu(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.j0
    public void f(hw hwVar, int i, Object obj) {
        i(i, obj, hwVar.D(getDescriptor(), i, this.a, null));
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        iw iwVarT = encoder.t(descriptor);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            iwVarT.e(getDescriptor(), i, this.a, itC.next());
        }
        iwVarT.c(descriptor);
    }
}
