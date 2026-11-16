package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ma1 implements SerialDescriptor {
    public final cm2 a;

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.a.getValue();
    }

    public ma1(sr0 sr0Var) {
        this.a = new cm2(sr0Var);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        return a().c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return a().d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return a().e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return a().f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        return a().g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final h00 getKind() {
        return a().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return a().h();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return a().i(i);
    }
}
