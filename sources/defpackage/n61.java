package defpackage;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n61 extends PluginGeneratedSerialDescriptor {
    public final boolean l;

    public n61(String str, o61 o61Var) {
        super(str, o61Var, 1);
        this.l = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n61) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.h())) {
                n61 n61Var = (n61) obj;
                if (n61Var.l && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) n61Var.j.getValue())) {
                    int iE = serialDescriptor.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (s71.b(d(i2).h(), serialDescriptor.d(i2).h()) && s71.b(d(i2).getKind(), serialDescriptor.d(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.l;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
