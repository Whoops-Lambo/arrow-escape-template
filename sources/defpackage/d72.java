package defpackage;

import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d72 implements Allocator.AllocationNode {
    public long a;
    public long b;
    public Allocation c;
    public d72 d;

    @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
    public final Allocation getAllocation() {
        return (Allocation) Assertions.checkNotNull(this.c);
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
    public final Allocator.AllocationNode next() {
        d72 d72Var = this.d;
        if (d72Var == null || d72Var.c == null) {
            return null;
        }
        return d72Var;
    }

    public d72(long j, int i) {
        boolean z;
        if (this.c == null) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        this.a = j;
        this.b = j + ((long) i);
    }
}
