package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class sy1 extends bu {
    public final ry1 b;

    public abstract Object j();

    public abstract void k(iw iwVar, Object obj, int i);

    @Override // defpackage.j0
    public final int b(Object obj) {
        qy1 qy1Var = (qy1) obj;
        qy1Var.getClass();
        return qy1Var.d();
    }

    @Override // defpackage.j0
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.j0
    public final Object h(Object obj) {
        qy1 qy1Var = (qy1) obj;
        qy1Var.getClass();
        return qy1Var.a();
    }

    @Override // defpackage.bu
    public final void i(int i, Object obj, Object obj2) {
        ((qy1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy1(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = new ry1(kSerializer.getDescriptor());
    }

    @Override // defpackage.j0
    public final Object a() {
        return (qy1) g(j());
    }

    @Override // defpackage.j0, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // defpackage.bu, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int iD = d(obj);
        ry1 ry1Var = this.b;
        iw iwVarT = encoder.t(ry1Var);
        k(iwVarT, obj, iD);
        iwVarT.c(ry1Var);
    }
}
